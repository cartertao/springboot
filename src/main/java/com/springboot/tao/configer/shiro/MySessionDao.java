package com.springboot.tao.configer.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.util.SerializationUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * @author taozhiwei
 * @date 2020/9/11 14:53
 */
public class MySessionDao extends AbstractSessionDAO {

    public MySessionDao(RedissonClient redissonClient) {
        this.redissonClient = redissonClient;
    }

    private RedissonClient redissonClient;

    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = generateSessionId(session);
        assignSessionId(session, sessionId);
        String key = sessionId.toString();
        byte[] value = SerializationUtils.serialize(session);

        RBucket<Object> obj = redissonClient.getBucket(key);
        if(!obj.isExists()){
            obj.set(value, 300, TimeUnit.SECONDS);
        }
        return sessionId;
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        RBucket<Object> obj = redissonClient.getBucket(sessionId.toString());
        Object o = obj.get();
        if(o != null){
            return (Session)SerializationUtils.deserialize((byte[])o);
        }
        return null;
    }

    @Override
    public void update(Session session) throws UnknownSessionException {
        Serializable sessionId = session.getId();
        byte[] value = SerializationUtils.serialize(session);
        RBucket<Object> obj = redissonClient.getBucket(sessionId.toString());
        obj.set(value, 300, TimeUnit.SECONDS);
    }

    @Override
    public void delete(Session session) {
        Serializable sessionId = session.getId();
        RBucket<Object> obj = redissonClient.getBucket(sessionId.toString());
        obj.delete();
    }

    @Override
    public Collection<Session> getActiveSessions() {
        return null;
    }
}
