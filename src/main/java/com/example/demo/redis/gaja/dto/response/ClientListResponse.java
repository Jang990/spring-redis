package com.example.demo.redis.gaja.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ClientListResponse {
    private Long groupId;
    private List<ClientResponse> clientList;
}
