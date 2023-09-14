package com.example.demo.redis.gaja;

import com.example.demo.redis.basic.TestService;
import com.example.demo.redis.basic.dto.AgeAndNameRequest;
import com.example.demo.redis.basic.dto.StudentListResponse;
import com.example.demo.redis.basic.dto.StudentRequest;
import com.example.demo.redis.basic.dto.StudentResponse;
import com.example.demo.redis.gaja.dto.ClientInfoRequest;
import com.example.demo.redis.gaja.dto.ClientRadiusSearchRequest;
import com.example.demo.redis.gaja.dto.ClientSearchRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gaja")
@RequiredArgsConstructor
public class GajaController {

    private final GajaService service;

    @PostMapping
    public Long save(ClientInfoRequest request) {
        System.out.println(request);
        System.out.println("===> Gaja.Client.SAVE 컨트롤러 실행");
        return 1L;
    }

    @GetMapping("/{id}")
    public void find(@PathVariable Long id) {
        System.out.println("===> Gaja.Client.FIND 컨트롤러 실행");
//        return testService.find(id);
    }

    @GetMapping("/client")
    public void findAllInGroup(ClientSearchRequest request) {
        System.out.println(request);
        System.out.println("===> Gaja.Client.고객전부찾기 컨트롤러 실행");
//        return testService.findAge(request);
    }

    @GetMapping("/client/nearby")
    public void findRadius(ClientRadiusSearchRequest request) {
        System.out.println(request);
        System.out.println("===> Gaja.Client.반경검색 컨트롤러 실행");
//        return testService.findAge(request);
    }
}
