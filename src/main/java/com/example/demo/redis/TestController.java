package com.example.demo.redis;

import com.example.demo.redis.dto.StudentListResponse;
import com.example.demo.redis.dto.StudentRequest;
import com.example.demo.redis.dto.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @PostMapping
    public Long save(StudentRequest request) {
        System.out.println("===> SAVE 컨트롤러 실행");
        return testService.save(request);
    }

    @GetMapping("/age")
    public StudentListResponse findAge(int age) {
        System.out.println("===> FIND-AGE 컨트롤러 실행");
        return testService.findAge(age);
    }

    @GetMapping("/{id}")
    public StudentResponse find(@PathVariable Long id) {
        System.out.println("===> FIND 컨트롤러 실행");
        return testService.find(id);
    }
}
