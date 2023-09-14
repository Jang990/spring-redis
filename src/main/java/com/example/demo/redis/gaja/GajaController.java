package com.example.demo.redis.gaja;

import com.example.demo.redis.basic.TestService;
import com.example.demo.redis.basic.dto.AgeAndNameRequest;
import com.example.demo.redis.basic.dto.StudentListResponse;
import com.example.demo.redis.basic.dto.StudentRequest;
import com.example.demo.redis.basic.dto.StudentResponse;
import com.example.demo.redis.gaja.dto.ClientInfoRequest;
import com.example.demo.redis.gaja.dto.ClientRadiusSearchRequest;
import com.example.demo.redis.gaja.dto.ClientSearchRequest;
import com.example.demo.redis.gaja.dto.response.ClientListResponse;
import com.example.demo.redis.gaja.dto.response.ClientResponse;
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
        return service.save(request);
    }

    @GetMapping("/{id}")
    public ClientResponse find(@PathVariable Long id) {
        System.out.println("===> Gaja.Client.FIND 컨트롤러 실행");
        return service.find(id);
    }

    @GetMapping("/client")
    public ClientListResponse findAllInGroup(ClientSearchRequest request) {
        System.out.println(request);
        System.out.println("===> Gaja.Client.고객전부찾기 컨트롤러 실행");
        return service.findClientList(request);
    }

    @GetMapping("/client/nearby")
    public ClientListResponse findRadius(ClientRadiusSearchRequest request) {
        System.out.println(request);
        System.out.println("===> Gaja.Client.반경검색 컨트롤러 실행");
        return service.findRadius(request);
    }
}
