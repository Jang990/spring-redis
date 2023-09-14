package com.example.demo.redis.gaja;

import com.example.demo.redis.gaja.dto.request.ClientInfoRequest;
import com.example.demo.redis.gaja.dto.request.ClientRadiusSearchRequest;
import com.example.demo.redis.gaja.dto.request.ClientSearchRequest;
import com.example.demo.redis.gaja.dto.response.ClientListResponse;
import com.example.demo.redis.gaja.dto.response.ClientResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GajaService {
    public Long save(ClientInfoRequest request) {
        return null;
    }

    public ClientResponse find(Long id) {
        return null;
    }

    public ClientListResponse findClientList(ClientSearchRequest request) {
        return null;
    }

    public ClientListResponse findRadius(ClientRadiusSearchRequest request) {
        return null;
    }
}
