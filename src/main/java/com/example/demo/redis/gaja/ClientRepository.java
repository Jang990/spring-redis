package com.example.demo.redis.gaja;

import com.example.demo.redis.gaja.domain.Client;
import com.example.demo.redis.gaja.dto.response.ClientListResponse;
import com.example.demo.redis.gaja.dto.response.ClientResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
//    @Query("Select new com.example.demo.redis.gaja.dto.response.ClientResponse(" +
//            "c.name, c.phoneNumber, " +
//            "new com.example.demo.redis.gaja.dto.LocationInfo(c.x, c.y), ST_Distance_Sphere(POINT(:x, :y), POINT(c.location.x, c.location.y))) " +
//            "From Client c join fetch c.group g on g.groupId = c.group.groupId " +
//            "Where g.groupId = :groupId")
    List<ClientResponse> findClients(Long groupId, Double x, Double y);

//            "Where g.groupId = :groupId And ST_Distance_Sphere(ST_Distance_Sphere(POINT(:x, :y), POINT(c.location.x, c.location.y) ), :point) <= 3000")

}
