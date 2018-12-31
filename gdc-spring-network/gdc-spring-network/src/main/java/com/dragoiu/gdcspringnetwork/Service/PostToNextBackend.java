package com.dragoiu.gdcspringnetwork.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostToNextBackend {

    public Integer postToNextNode(String value, String nextNode) {
        final String uri = nextNode;

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, value, Integer.class);
    }

    public Integer finishTowerControl(String value) {
        final String uri = "http://towercontol:8080/finish";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, value, Integer.class);
    }
}
