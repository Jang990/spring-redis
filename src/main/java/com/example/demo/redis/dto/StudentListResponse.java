package com.example.demo.redis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StudentListResponse {
    List<StudentResponse> studentList;
}
