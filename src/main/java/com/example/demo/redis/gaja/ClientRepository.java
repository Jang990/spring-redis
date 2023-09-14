package com.example.demo.redis.gaja;

import com.example.demo.redis.gaja.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
