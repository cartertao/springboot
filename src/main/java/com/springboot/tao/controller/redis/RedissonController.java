package com.springboot.tao.controller.redis;

import com.springboot.tao.bean.db.Sessions;
import com.springboot.tao.bean.db.Student;
import org.redisson.api.*;
import org.redisson.api.listener.MessageListener;
import org.redisson.api.listener.PatternMessageListener;
import org.redisson.client.codec.Codec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.SerializationUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * @author taozhiwei
 * @date 2020/9/3 17:24
 * <a href="https://github.com/redisson/redisson/wiki/%E7%9B%AE%E5%BD%95"/>
 */
@RestController
@RequestMapping("/redis")
public class RedissonController {

    @Autowired
    RedissonClient redissonClient;

    @GetMapping("/getKey")
    public void getKeys(){
        RKeys keys = redissonClient.getKeys();
        Iterable<String> keys1 = keys.getKeys();
        Iterable<String> keysByPattern = keys.getKeysByPattern("key*");
        keysByPattern.forEach(s -> System.out.println(s));
        //long key1 = keys.delete("key1");
        //long l = keys.deleteByPattern("key*");
        String s = keys.randomKey();
        long count = keys.count();
        long key11 = keys.countExists("key1");
    }

    /***************************通用对象key:value***********************************/

    @GetMapping("/save/{key}/{value}")
    public void saveValue(@PathVariable("key")String key, @PathVariable("value")String value){
        RBucket<Object> obj = redissonClient.getBucket(key);
        //如果存在则赋值
        if(!obj.isExists()){
            obj.set("not exists" + value, 300, TimeUnit.SECONDS);
            //序列化和反序列化
/*            SerializationUtils.serialize();
            SerializationUtils.deserialize()*/
        }
        boolean tao11 = obj.setIfExists("exists" + value, 50, TimeUnit.SECONDS);
    }

    @GetMapping("/get")
    public String getValue(){
        RBucket<Object> key = redissonClient.getBucket("key1");
        //获取值，不存在为null, 如果key二进制对象的key,则会抛出IO异常
        Object o = key.get();
        //返回过期时间(毫秒)，如果不存在-2,如果存在但是没有过期时间-1
        long l = key.remainTimeToLive();
        //设置过期时间
        key.expire(60, TimeUnit.SECONDS);
        //得到上一次读写到现在的时间秒
        Long idleTime = key.getIdleTime();

        //重新命名key，如果新的key存在，则覆盖新的key，当前key删除
        //key.rename("key2");
        //重新命名，必须新的key不存在, 设置成功true(不存在key),是否false(存在key)
        //boolean renamenx = key.renamenx("key3");

        //如果keyValue不存在则赋值成功true,存在则false
        //boolean value2 = key.trySet("trySet", 30, TimeUnit.SECONDS);
        //重新赋值，返回之前的值,如果keyValue不存在则相当于创建一个
        //Object value3 = key.getAndSet("getAndSet", 60, TimeUnit.SECONDS);
        //对比序列化后的值，相等则更新
        boolean b = key.compareAndSet("exists3", "value2");

        //清楚到期的对象，如果清楚成功true,如果不存在false
        //boolean b1 = key.clearExpire();
        //key.delete();

        //返回字节大小
        //long size = key.size();
        //long l1 = key.sizeInMemory();
        //boolean touch = key.touch();
        //key.dump();
        //key.restore(null);
        Codec codec = key.getCodec();
        return (String)o;
    }

    @GetMapping("/get/{key}")
    public String get1(@PathVariable("key")String key){
        RBucket<Object> keyValue = redissonClient.getBucket(key);
        Object o = keyValue.get();
        return  (String)o;
    }

    @GetMapping("/gets")
    public Map<String, Object> gets(){
        RBuckets buckets = redissonClient.getBuckets();
        //获取多个key的value映射，如果所有key都不存在map不会为null，只是元素为0，
        //如果key不存在则map里面不会包含该key(map不会出现key:null)
        Map<String, Object> map = buckets.get("key1", "key2", "key3");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
        map.put("key1", "update1");
        map.put("key2", "update2");
        map.put("key3", "update3");
        //赋值，如果存在key则覆盖
        //buckets.set(map);
        //只要有一个key是存在的则所有的赋值都失败，必须全部key都不存在
        boolean b = buckets.trySet(map);
        return map;
    }

    /***************************二进制流***********************************/

    @GetMapping("/binary/test")
    public void binaryStream() throws IOException {
        RBinaryStream stream = redissonClient.getBinaryStream("anyStream");
        //想要保存的二进制流
        byte[] content = "学习redis".getBytes();
        //赋值到redis,会替换之前的值
        stream.set(content, 30, TimeUnit.SECONDS);

        //保存到redis,在之前的值后面追加，不会替换
        OutputStream os = stream.getOutputStream();
        byte[] content1 = "学习redission".getBytes();
        os.write(content1);

        //从redis中读取
        InputStream is = stream.getInputStream();
        byte[] readBuffer = new byte[512];
        is.read(readBuffer);
        System.out.println(new String(readBuffer));

        stream.delete();
        //stream.compareAndSet()
        //stream.getAndDelete()
        //stream.remainTimeToLive()
        //stream.expire()
        //stream.expireAt()
    }

    /***************************原子 Atomic***********************************/

    /**
     * long
     */
    @GetMapping("/atomicLong/test")
    public long rAtomicLong(){
        RAtomicLong atomicLong = redissonClient.getAtomicLong("myAtomicLong");
        //这个set没法设置过期时间
        atomicLong.set(3);
        //-1
        long l = atomicLong.remainTimeToLive();
        atomicLong.expire(30, TimeUnit.SECONDS);
        //30000
        long l1 = atomicLong.remainTimeToLive();
        //增加一，然后返回新值
        long l2 = atomicLong.incrementAndGet();
        //返回旧值，然后增加一
        long andIncrement = atomicLong.getAndIncrement();
        //减一，然后返回新值
        atomicLong.decrementAndGet();
        //返回旧值，然后减一
        atomicLong.getAndDecrement();
        long l3 = atomicLong.get();
        return l3;
    }

    /**
     * 累加器LongAdder java.util.concurrent.atomic.LongAdder
     * 性能最高比分布式AtomicLong对象快 12000 倍
     */
    @GetMapping("/longAdder/test")
    public void longAdder(){
        //不用初始值，初始为0
        RLongAdder atomicLong = redissonClient.getLongAdder("myLongAdder");
        atomicLong.add(12);
        atomicLong.increment();
        atomicLong.decrement();
        //得到值
        long sum = atomicLong.sum();
        atomicLong.delete();
        atomicLong.destroy();
    }

    /**
     * Double
     */
    @GetMapping("/atomicDouble/test")
    public void atomicDouble(){
        RAtomicDouble atomicDouble = redissonClient.getAtomicDouble("myAtomicDouble");
        atomicDouble.set(2.81);
        //增加
        atomicDouble.addAndGet(4.11);
        atomicDouble.get();
    }

    /**
     * 双精度浮点累加器 DoubleAdder
     * 其性能最高比分布式AtomicDouble对象快 12000 倍
     */
    @GetMapping("/doubleAdder/test")
    public void doubleAdder(){
        //不用初始值，初始为0
        RDoubleAdder myLongDouble = redissonClient.getDoubleAdder("myLongDouble");
        myLongDouble.add(12.5);
        myLongDouble.increment();
        myLongDouble.decrement();
        //得到值
        double sum = myLongDouble.sum();
    }



    /***************************发布订阅***********************************/
    /**
     * 每次当客户端发起对某个topic添加监听器，如果topic不存在，则redis创建topic，并将该topic指向请求的客户端，
     * 也就是 topic -> client client client ...   一个topic可以对应多个客户端
     * 每当客户端给指定的topic添加listen,只会在本地对象中增加listen,而不是修改redis中的数据
     * 当客户端发布数据时候，redis只需要把数据推送给指定topic下的所有订阅者，每个订阅者执行自己的listener
     * 所以topic.publish返回的数量由topic类型决定
     * topic -> client client client
     * patternTopic -> client client client
     */

    @GetMapping("/topicListener/test")
    public void topicListener(){
        //创建订阅者，为订阅者添加监听器
        RTopic topic = redissonClient.getTopic("anyTopic");


        int i1 = topic.addListener(Student.class, new MessageListener<Student>() {
            @Override
            public void onMessage(CharSequence channel, Student msg) {
                // channel.toString();得到topic的名称 anyTopic
                System.out.println("listener:student1" + msg);
            }
        });

        int i = topic.addListener(Student.class, new MessageListener<Student>() {
            @Override
            public void onMessage(CharSequence channel, Student msg) {
                System.out.println("listener:student2" + msg);
            }
        });

/*        topic.addListener(Sessions.class, new MessageListener<Sessions>() {
            @Override
            public void onMessage(CharSequence channel, Sessions msg) {
                System.out.println("listener:session" + msg);
            }
        });*/

        //创建一个正则订阅者，发布消息的主题符合该正则就可以消费
        RPatternTopic topic1 = redissonClient.getPatternTopic("anyTop*");
        topic1.addListener(Student.class, new PatternMessageListener<Student>() {
            @Override
            public void onMessage(CharSequence pattern, CharSequence channel, Student msg) {
                //pattern.toString();得到topic的名称 anyTop*
                System.out.println("PatternMessageListener" + msg);
            }
        });
    }

    @GetMapping("/topicPublish/test")
    public long topicPublish(){
        RTopic topic = redissonClient.getTopic("anyTopic");
        Student student = new Student(1, "tao", 888);
        //推送消息，并且返回客户端订阅数量
        //  数量由同一个ip和端口的服务上，不同类型的topic数量决定，如果同一个服务上同种类型的topic多个相同的订阅者只算一个
        //  正则类型和指定类型订阅者是不同类型topic,所以可以是2个订阅者（也就是一个服务订阅数量最多=topic所有类型数量）
        //  不会因为订阅者的监听器里面有多个可以匹配推送的消息而增加
        //  即使订阅者无法消费该消息也算一个订阅数量

        //消息推送的是所有服务的订阅者，一个服务(同ip同端口)里面可以有多个订阅者，就比如上面接口多调用几次，就多几个一样订阅者
        //在Redis节点故障转移（主从切换）或断线重连以后，所有的话题监听器将自动完成话题的重新订阅
        long clientsReceivedMessage = topic.publish(student);

        List<String> channelNames = topic.getChannelNames();
        int i = topic.countListeners();//获取自己本地的对应topic的监听器数量

        topic.removeAllListeners();//移除自己本地的对应的topic的所有监听器
        long l = topic.countSubscribers();
        //通过id来删除本地对应topic的监听器，id从添加监听器获取
        topic.removeListenerAsync(1,2);
        return clientsReceivedMessage;
    }
    @GetMapping("/topicPublish/test1")
    public void topicPublish1(){
        RTopic topic = redissonClient.getTopic("anyTopic");
        Sessions session = new Sessions("123", "sessionmmmmm");
        long clientsReceivedMessage = topic.publish(session);
    }

    /***************************布隆过滤器 Bloom Filter***********************************/

    @GetMapping("/bloomFilter/test")
    public void bloomFilter(){
        RBloomFilter<Student> bloomFilter = redissonClient.getBloomFilter("sample");
        // 初始化布隆过滤器，预计统计元素数量为55000000，期望误差率为0.03
        bloomFilter.tryInit(55000000L, 0.03);
        bloomFilter.add(new Student(1, "tao1", 11));
        bloomFilter.add(new Student(2, "tao2", 22));
        bloomFilter.add(new Student(3, "tao3", 33));
        boolean tao3 = bloomFilter.contains(new Student(3, "tao3", 33));
        bloomFilter.expire(60, TimeUnit.SECONDS);
        bloomFilter.delete();
    }

    /***************************基数估计算法 hyperLogLog***********************************/

    @GetMapping("/hyperLogLog/test")
    public long hyperLogLog(){
        RHyperLogLog<Student> log = redissonClient.getHyperLogLog("hyperStudent");
        log.add(new Student(1, "tao1", 11));
        log.add(new Student(2, "tao2", 22));
        log.add(new Student(2, "tao1", 11));
        log.add(new Student(3, "tao1", 11));
        log.add(new Student(3, "tao1", 11));
        log.expire(60, TimeUnit.SECONDS);
        //去重后总数量 4
        return log.count();
    }

    /***************************队列***********************************/

    /**
     * 先进先出 无边界（没有指定大小容量）Queue，
     * 尽管RQueue对象无初始大小（边界）限制，但对象的最大容量受Redis限制，最大元素数量是4 294 967 295个
     */
    @GetMapping("/queue/insert")
    public void queue(){
        RQueue<Student> queue = redissonClient.getQueue("queue");
        queue.add(new Student(3, "tao1", 11));
        queue.add(new Student(2, "tao1", 11));
        queue.add(new Student(4, "tao1", 11));
        queue.add(new Student(1, "tao1", 11));
    }

    @GetMapping("/queue/get")
    public Student queueGet(){
        RQueue<Student> queue = redissonClient.getQueue("queue");
        //获取单不移除队列的头，如果队列为null则返回null
        Student obj = queue.peek();
        //获取移除队列的头，如果队列为null则返回null
        Student someObj = queue.poll();
        return someObj;
    }

    /**
     * 双端队列Deque
     */
    @GetMapping("/deque/insert")
    public void dequeInsert() {
        RDeque<Student> queue = redissonClient.getDeque("anyDeque");
        queue.addFirst(new Student(3, "tao1", 11));
        queue.addLast(new Student(2, "tao1", 11));
        queue.addLast(new Student(5, "tao1", 11));
        queue.addLast(new Student(6, "tao1", 11));
        queue.expire(60, TimeUnit.SECONDS);
    }
    @GetMapping("/deque/get")
    public Student dequeGet(){
        RDeque<Student> queue = redissonClient.getDeque("anyDeque");
        Iterator<Student> iterator = queue.iterator();
        Stream<Student> studentStream = queue.parallelStream();
        Stream<Student> stream = queue.stream();
        int size = queue.size();

        //都是移除第一个,最先添加的
        //删除前面2个，返回的list第一个是队列头元素（第一个添加的），移除后queue对象中list也会减少
        //List<Student> students = queue.pollFirst(2);
        //Student poll = queue.poll();
        //queue.pollFirst();
        //移除最后一个
        //queue.pollLast();
        //queue.pollLast(1);
        // 删除队列最后2个元素，返回的list元素第一个是队列最后一个元素，移除后queue对象中list也会减少
        List<Student> students = queue.pollLast(2);

        //和poll不同点为如果队列为null则抛出异常
        //Student obj = queue.removeFirst();
        //Student someObj = queue.removeLast();

        Student student = queue.peekFirst();
        Student student1 = queue.peekLast();
        Student peek = queue.peek();
        return peek;
    }

    /**
     * 阻塞无界阻塞队列
     * 1）支持阻塞的插入方法：意思是当队列满时，队列会阻塞插入元素的线程，直到队列不满。
     * 2）支持阻塞的移除方法：意思是在队列为空时，获取元素的线程会等待队列变为非空
     * 阻塞队列常用于生产者和消费者的场景，生产者是向队列里添加元素的线程，消费者是从队列里取元素的线程。
     * 阻塞队列就是生产者用来存放元素、消费者用来获取元素的容器
     */
    @GetMapping("/blockingQueue/insert")
    public void blockingQueue() throws InterruptedException {
        RBlockingQueue<Student> queue = redissonClient.getBlockingQueue("anyQueue");
        queue.offer(new Student());

        Student obj = queue.peek();
        Student someObj = queue.poll();
        //等待获取队列中元素，指定超时时间
        Student ob = queue.poll(10, TimeUnit.MINUTES);
    }

    /**
     * 有界阻塞队列（Bounded Blocking Queue）
     */
    @GetMapping("/boundedBlockingQueue/insert")
    public void boundedBlockingQueue() throws InterruptedException {
        RBoundedBlockingQueue<Student> queue = redissonClient.getBoundedBlockingQueue("anyQueue");
        queue.expire(30, TimeUnit.SECONDS);
        // 如果初始容量（边界）设定成功则返回`真（true）`，
        // 如果初始容量（边界）已近存在则返回`假（false）`。
        queue.trySetCapacity(2);

        queue.offer(new Student());
        // 此时容量已满，下面代码将会被阻塞，直到有空闲为止。
        queue.put(new Student());

        Student obj = queue.peek();
        Student someObj = queue.poll();
        Student ob = queue.poll(10, TimeUnit.MINUTES);
    }

    /**
     * 阻塞双端队列（Blocking Deque）
     */
    @GetMapping("/blockingDeque/insert")
    public void blockingDeque() throws InterruptedException {
        RBlockingDeque<Integer> deque = redissonClient.getBlockingDeque("anyDeque");
        deque.putFirst(1);
        deque.putLast(2);
        Integer firstValue = deque.takeFirst();
        Integer lastValue = deque.takeLast();
        Integer firstValue1 = deque.pollFirst(10, TimeUnit.MINUTES);
        Integer lastValue1 = deque.pollLast(3, TimeUnit.MINUTES);
    }

    /**
     * 延迟队列（Delayed Queue）
     * Java对象在实现了RQueue接口的基础上提供了向队列按要求延迟添加项目的功能。
     * 该功能可以用来实现消息传送延迟按几何增长或几何衰减的发送策略。
     */
    @GetMapping("/delayedQueue/insert")
    public void delayedQueue() throws InterruptedException {
        //先指定一个其他类型队列
        RBlockingDeque<Student> blockingDeque = redissonClient.getBlockingDeque("anyDeque");
        //将队列包装成延迟队列
        RDelayedQueue<Student> delayedQueue = redissonClient.getDelayedQueue(blockingDeque);
        // 10秒钟以后将消息发送到指定队列
        delayedQueue.offer(new Student(3, "tao1", 11), 10, TimeUnit.SECONDS);
        // 一分钟以后将消息发送到指定队列
        delayedQueue.offer(new Student(3, "tao1", 11), 1, TimeUnit.MINUTES);
    }

    /**
     * 阻塞公平队列（Blocking Fair Queue）
     *  阻塞公平双端队列（Blocking Fair Deque）
     *   优先队列（Priority Queue）
     *   优先双端队列（Priority Deque）
     *   优先阻塞队列（Priority Blocking Queue）
     *    优先阻塞双端队列（Priority Blocking Deque）
     */
}
