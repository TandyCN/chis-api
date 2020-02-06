package pers.tandy.chis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Tandy
 * @Date: 2019/5/25 18:56
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    /*
        stringRedisTemplate.opsForValue();
        stringRedisTemplate.opsForList();
        stringRedisTemplate.opsForSet();
        stringRedisTemplate.opsForHash();
        stringRedisTemplate.opsForZSet();
    */

    @Test
    public void test1() {
        stringRedisTemplate.opsForHash().put("GoodsPrescription:Clinic4", "LSH0000000001", "JSON............");
    }

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test2() {
    }
}
