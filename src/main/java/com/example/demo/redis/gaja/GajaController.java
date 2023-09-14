package com.example.demo.redis.gaja;

import com.example.demo.redis.basic.TestService;
import com.example.demo.redis.basic.dto.AgeAndNameRequest;
import com.example.demo.redis.basic.dto.StudentListResponse;
import com.example.demo.redis.basic.dto.StudentRequest;
import com.example.demo.redis.basic.dto.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gaja")
@RequiredArgsConstructor
public class GajaController {

    private final TestService testService;

    @PostMapping
    public Long save() {
        System.out.println("===> Gaja.Client.SAVE 컨트롤러 실행");
        return 1L;
    }

    @GetMapping("/{id}")
    public void find(@PathVariable Long id) {
        System.out.println("===> Gaja.Client.FIND 컨트롤러 실행");
//        return testService.find(id);
    }

    @GetMapping("/group/{groupId}/client")
    public void findAllInGroup(@PathVariable Long groupId) {
        System.out.println("===> Gaja.Client.고객전부찾기 컨트롤러 실행");
//        return testService.findAge(request);
    }

    @GetMapping("/age")
    public void findRadius(AgeAndNameRequest request) {
        System.out.println("===> Gaja.Client.반경검색 컨트롤러 실행");
        return testService.findAge(request);
    }
}
