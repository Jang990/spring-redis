package com.example.demo.redis.gaja.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientRadiusSearchRequest {
    private Long groupId;
    private LocationInfo location = new LocationInfo();
    private int distance;

    public void setX(double x) {
        location.setX(x);
    }

    public void setY(double y) {
        location.setY(y);
    }
}
