package com.example.demo.redis.repository;

import com.example.demo.redis.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("Select s From Student s Where s.age = :age")
    List<Student> findByAge(int age);
}
