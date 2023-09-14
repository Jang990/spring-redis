package com.example.demo.redis.gaja.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "GROUP_SET")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public void updateName(String name) {
        this.name = name;
    }

 }
