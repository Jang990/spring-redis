package com.example.demo.redis;

import com.example.demo.redis.dto.StudentResponse;
import com.example.demo.redis.repository.StudentRedisRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class TestServiceTest {

    @Autowired
    private StudentRedisRepository studentRedisRepository;

    @Test
    @Rollback(value = false)
    void test1() {
        for (int i = 0; i < 10; i++) {
            StudentResponse response = new StudentResponse("id-field:"+i, "normal");
            studentRedisRepository.save(response);
        }

    }
}