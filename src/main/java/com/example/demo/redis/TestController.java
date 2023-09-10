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
        return testService.save(request);
    }

    @GetMapping("/age")
    public StudentListResponse findAge(int age) {
        System.out.println(age);

        return testService.findAge(age);
    }

    @GetMapping("/{id}")
    public StudentResponse find(@PathVariable Long id) {
        return testService.find(id);
    }
}
