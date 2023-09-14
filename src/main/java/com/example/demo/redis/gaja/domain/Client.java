package com.example.demo.redis.gaja.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;

    @Column(nullable = false)
    private String name;
    private String phoneNumber;

    @Embedded
    private ClientLocation location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    public Client(String name, Group group) {
        this.name = name;
        updateGroup(group);
    }

    public Client(String name, ClientLocation location, Group group) {
        this.name = name;
        updateLocation(location);
        updateGroup(group);
    }

    public void updateClientField(String name, String phoneNumber, ClientLocation location) {
        updateName(name);
        updateLocation(location);
    }

    public void updateGroup(Group group) {
        this.group = group;
    }

    private void updateName(String name) {
        this.name = name;
    }

    private void updateLocation(ClientLocation location) {
        this.location = location;
    }
}
