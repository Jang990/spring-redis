package com.example.demo.redis.gaja.dto.response;

import com.example.demo.redis.gaja.dto.LocationInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponse {
    private String name;
    private String phoneNumber;
    private LocationInfo location;
    private Double distance;
}
