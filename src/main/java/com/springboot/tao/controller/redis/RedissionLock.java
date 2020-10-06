package com.springboot.tao.controller.redis;

import org.redisson.RedissonRedLock;
import org.redisson.api.RLock;
import org.redisson.api.RReadWriteLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author taozhiwei
 * @date 2020/9/7 14:03
 */
@RestController
@RequestMapping("/redis/lock")
public class RedissionLock {

    @Autowired
    RedissonClient redissonClient;

    /**
     * 重入锁
     * 大家都知道，如果负责储存这个分布式锁的Redisson节点宕机以后，而且这个锁正好处于锁住的状态时，
     * 这个锁会出现锁死的状态。为了避免这种情况的发生，Redisson内部提供了一个监控锁的看门狗，
     * 它的作用是在Redisson实例被关闭前，不断的延长锁的有效期。默认情况下，看门狗的检查锁的超时时间是30秒钟，
     * 也可以通过修改Config.lockWatchdogTimeout来另行指定
     * https://redis.io/topics/distlock
     */
    @RequestMapping("/reentrantLock")
    public void reentrantLock() throws InterruptedException {
        RLock lock = redissonClient.getLock("anyLock");
        // 最常见的使用方法
        lock.lock();
        // 加锁以后10秒钟自动解锁, 如果时间是-1表示永久加锁，无论永久还是自动都可以手动调用lock.unlock()释放锁
            // 无需调用unlock方法手动解锁
        lock.lock(10, TimeUnit.SECONDS);
            // 尝试加锁，最多等待100秒，上锁以后10秒自动解锁
        boolean res = lock.tryLock(100, 10, TimeUnit.SECONDS);
        if (res) {
            try {
                //...
            } finally {
                lock.unlock();
            }
        }
    }

    /**
     * redis非高可用部署,redLock算法虽然是需要多个实例，但是这些实例都是独自部署的，没有主从关系。
     * 之所以要用独立的，是避免了redis异步复制造成的锁丢失，比如：主节点没来的及把刚刚set进来这条数据给从节点，就挂了
     * 红锁算法认为，只要2N + 1个节点加锁成功，那么就认为获取了锁， 解锁时将所有实例解锁
     * 1.顺序向五个节点请求加锁
     * 2.根据一定的超时时间来推断是不是跳过该节点
     * 3.三个节点加锁成功并且花费时间小于锁的有效期
     * 4.认定加锁成功
     * eg
     * 1.假设锁30秒过期，三个节点加锁花了31秒，自然是加锁失败了
     * 2.假设有效期是10秒，那么单个redis实例操作超时时间，应该在5到50毫秒(注意时间单位)
     * 3.假设我们设置有效期是30秒，图中超时了两个redis节点。 那么加锁成功的节点总共花费了3秒，所以锁的实际有效期是小于27秒的,
     * 即扣除加锁成功三个实例的3秒，还要扣除等待超时redis实例的总共时间。
     */
    @RequestMapping("/redLock")
    public void redLock() throws InterruptedException {
        //RLock lock1 = redissonInstance1.getLock("lock1");
        //RLock lock2 = redissonInstance2.getLock("lock2");
        //RLock lock3 = redissonInstance3.getLock("lock3");

/*        RedissonRedLock lock = new RedissonRedLock(lock1, lock2, lock3);
        // 同时加锁：lock1 lock2 lock3
        // 红锁在大部分节点上加锁成功就算成功。
        lock.lock();
        lock.unlock();*/
    }

    /**
     * 读写锁类似数据库的共享锁和排它锁
     */
    public void readWriteLock() throws InterruptedException {
        RReadWriteLock rwlock = redissonClient.getReadWriteLock("anyRWLock");
        // 最常见的使用方法
        rwlock.readLock().lock();
        rwlock.readLock().unlock();
        // 或
        rwlock.writeLock().lock();

        // 10秒钟以后自动解锁
        // 无需调用unlock方法手动解锁
        rwlock.readLock().lock(10, TimeUnit.SECONDS);
        // 或
        rwlock.writeLock().lock(10, TimeUnit.SECONDS);

        // 尝试加锁，最多等待100秒，上锁以后10秒自动解锁
        boolean res = rwlock.readLock().tryLock(100, 10, TimeUnit.SECONDS);
        rwlock.readLock().unlock();
        // 或
        boolean res1 = rwlock.writeLock().tryLock(100, 10, TimeUnit.SECONDS);

    }
}
