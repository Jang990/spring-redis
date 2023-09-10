package com.example.demo.redis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@RedisHash(value = "student", timeToLive = 10)
public class StudentResponse {
    @Id
    private String studentNumber;
    private String name;
    private int age;
}
