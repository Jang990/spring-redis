package com.example.demo.redis;

import com.example.demo.redis.domain.Student;
import com.example.demo.redis.dto.StudentListResponse;
import com.example.demo.redis.dto.StudentRequest;
import com.example.demo.redis.dto.StudentResponse;
import com.example.demo.redis.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class TestService {

    private final StudentRepository studentRepository;

    public Long save(StudentRequest request) {
        System.out.println("===> SAVE 로직 실행");
        Student student = new Student(request.getStudentNumber(), request.getName(), request.getAge());
        studentRepository.save(student);
        return student.getId();
    }

    @Cacheable(value = "StudentResponse", key = "#id")
    public StudentResponse find(Long id) {
        System.out.println("===> FIND 로직 실행");
        Student student = studentRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return new StudentResponse(student.getStudentNumber(), student.getName(), student.getAge());
    }

    @Cacheable(value = "StudentListResponse", key = "#age")
    public StudentListResponse findAge(int age) {
        System.out.println("===> FIND 로직 실행");
        List<Student> list = studentRepository.findByAge(age);

        List<StudentResponse> reponseList = list.stream().map(entity -> {
            return new StudentResponse(entity.getStudentNumber(), entity.getName(), entity.getAge());
        }).collect(Collectors.toList());
        return new StudentListResponse(reponseList);
    }

}
