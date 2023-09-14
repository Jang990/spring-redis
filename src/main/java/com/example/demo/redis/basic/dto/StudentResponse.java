package com.example.demo.redis.basic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private String studentNumber;
    private String name;
    private int age;
}
