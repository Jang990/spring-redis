package com.example.demo.redis.repository;

import com.example.demo.redis.dto.StudentResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface StudentRedisRepository extends CrudRepository<StudentResponse, String> {
}
