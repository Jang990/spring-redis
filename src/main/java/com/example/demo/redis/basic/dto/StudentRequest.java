package com.example.demo.redis.basic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentRequest {
    private String studentNumber;
    private String name;
    private int age;
}
