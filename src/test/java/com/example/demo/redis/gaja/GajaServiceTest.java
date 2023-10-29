package com.example.demo.redis.gaja;

import com.example.demo.redis.gaja.dto.LocationInfo;
import com.example.demo.redis.gaja.dto.request.ClientInfoRequest;
import com.example.demo.redis.gaja.dto.request.ClientRadiusSearchRequest;
import com.example.demo.redis.gaja.dto.request.ClientSearchRequest;
import com.example.demo.redis.gaja.dto.response.ClientResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GajaServiceTest {

    @Autowired
    GajaService service;

    @Autowired
    EntityManager em;


    @Test
    void aa() {
        em.createQuery("Select * from Client c join fetch c.group g");
    }
    @Test
    void save() {
        long groupId = 7L;
        LocationInfo clientLoc = new LocationInfo(125d, 37d);
        ClientInfoRequest request = new ClientInfoRequest("Test", groupId, clientLoc);
        service.save(request);
        service.save(request);
    }

    @Test
    void find() {
        ClientResponse response = service.find(67L);
        ClientResponse cachedResponse = service.find(67L);
        System.out.println(response);
        System.out.println(cachedResponse);
    }

    @Test
    void findClientList() {
        LocationInfo myLocation = new LocationInfo(125d, 37d);
        service.findClientList(new ClientSearchRequest(7L, myLocation));
        service.findClientList(new ClientSearchRequest(7L, myLocation));
    }

    @Test
    void findRadius() {
        LocationInfo myLocation = new LocationInfo(125d, 37d);
        service.findRadius(new ClientRadiusSearchRequest(7L, myLocation, 3000));
        service.findRadius(new ClientRadiusSearchRequest(7L, myLocation, 3000));
    }
}