package com.example.demo.redis.gaja.dto.response;

import com.example.demo.redis.gaja.dto.LocationInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientResponse {
    private String name;
    private String phoneNumber;
    private LocationInfo location;
    private Double distance;
}
