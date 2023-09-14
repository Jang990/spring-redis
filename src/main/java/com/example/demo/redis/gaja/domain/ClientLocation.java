package com.example.demo.redis.gaja.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
public class ClientLocation {
//    @Column(columnDefinition = "GEOMETRY SRID 4326") // MySQL
//    @Column(columnDefinition = "geometry(Point, 4326)") // PostgreSQL
    private double x;
    private double y;

    public ClientLocation(double latitude, double longitude) {
        x = latitude;
        y = longitude;
    }
}
