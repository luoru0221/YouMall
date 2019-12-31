package com.luoru.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 *  @author: Luoru
 *  @Date: 2019/12/30 16:20
 *  @Description: Redis缓存工具类
 */
@Service("redisUtil")
public class RedisUtil {

    @Autowired()
    RedisTemplate redisTemplate;

    /**
     * 获取缓存
     * @param cacheKey key
     * @return value
     */
    Object getCacheValue(String cacheKey){
        return redisTemplate.execute(new RedisCallback<Object>(){
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                return redisConnection.get(cacheKey.getBytes());
            }
        });
    }

    /**
     * 设置缓存值
     * @param key key
     * @param value value序列化后的字节数组
     */
     void setCacheValue(String key,byte[] value){
        redisTemplate.execute(new RedisCallback<Object>() {
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException{
                redisConnection.set(key.getBytes(),value);
                return null;
            }
        });
    }

    /**
     * 设置缓存值并设置有效期
     * @param key key
     * @param value value
     */
    public void setCacheValueForTime(String key,String value,long time){
        redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
    }

    /**
     * 删除key值
     * @param key key
     */
    public void delCacheByKey(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
        redisTemplate.opsForHash().delete("");
    }

    /**
     * 获取key的有效期
     * @param key key
     * @return key的有效期
     */
    public Long getExpireTime(String key){
        Long time = redisTemplate.getExpire(key);
        return time;
    }

    /**
     * 获取有效期指定时间类型---秒
     * @param key key
     * @return time
     */
    public Long getExpireTimeType(String key){
        Long time = redisTemplate.getExpire(key,TimeUnit.SECONDS);
        return time;
    }

    /**
     * 获取有效期指定时间类型--分
     * @param key---分
     * @return time
     */
    public Long getExpireTimeTypeForMin(String key){
        Long time = redisTemplate.getExpire(key, TimeUnit.MINUTES);
        return time;
    }

    /**
     * 设置一个自增的数据
     * @param key key
     * @param growthLength 自增长度
     */
    public void testInc(String key,Long growthLength){
        redisTemplate.opsForValue().increment(key, growthLength);
    }
}

