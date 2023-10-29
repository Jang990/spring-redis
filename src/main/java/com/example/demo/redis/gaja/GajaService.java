package com.example.demo.redis.gaja;

import com.example.demo.redis.gaja.domain.Client;
import com.example.demo.redis.gaja.domain.ClientLocation;
import com.example.demo.redis.gaja.domain.Group;
import com.example.demo.redis.gaja.dto.LocationInfo;
import com.example.demo.redis.gaja.dto.request.ClientInfoRequest;
import com.example.demo.redis.gaja.dto.request.ClientRadiusSearchRequest;
import com.example.demo.redis.gaja.dto.request.ClientSearchRequest;
import com.example.demo.redis.gaja.dto.response.ClientListResponse;
import com.example.demo.redis.gaja.dto.response.ClientResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class GajaService {

    private final ClientRepository repository;
    private final GroupRepository groupRepository;


    @CachePut(value = "Single-Client", key="#result")
    public Long save(ClientInfoRequest request) {
        System.out.println("=====> SAVE 서비스 실행");
        Group group = groupRepository.findById(request.getGroupId()).get();
        Client client = new Client(request.getName(), convertLocation(request.getLocation()), group);
        return repository.save(client).getId();
    }

    private static ClientLocation convertLocation(LocationInfo location) {
        return new ClientLocation(location.getY(), location.getX());
    }

    private static LocationInfo convertLocation(ClientLocation location) {
        return new LocationInfo(location.getX(), location.getY());
    }

    @Cacheable(value = "Single-Client")
    public ClientResponse find(Long id) {
        System.out.println("=====> FIND 서비스 실행");
        Client client = repository.findById(id).get();
        return new ClientResponse(client.getName(), client.getPhoneNumber(), convertLocation(client.getLocation()), null);
    }

    @Cacheable(value = "Group-Client", key = "#request.groupId")
    public ClientListResponse findClientList(ClientSearchRequest request) {
        System.out.println("=====> 고객전부찾기 서비스 실행");
//        List<ClientResponse> list = repository.findClients(request.getGroupId(), request.getLocation().getX(), request.getLocation().getY());
//        return new ClientListResponse(request.getGroupId(), list);
        return null;
    }

    @Caching(
            cacheable = {
                    @Cacheable(value = "Radius-Client", condition = "#request.radius", key = "#request")
            }
    )
    public ClientListResponse findRadius(ClientRadiusSearchRequest request) {
        System.out.println("=====> 반경검색 서비스 실행");
        return null;
    }
}
