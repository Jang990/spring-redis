package com.example.demo.redis.gaja;

import com.example.demo.redis.gaja.domain.Client;
import com.example.demo.redis.gaja.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
