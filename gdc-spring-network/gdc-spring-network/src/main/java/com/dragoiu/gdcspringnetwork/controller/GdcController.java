package com.dragoiu.gdcspringnetwork.controller;

import com.dragoiu.gdcspringnetwork.Service.PostToNextBackend;
import com.dragoiu.gdcspringnetwork.Util.Gdc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GdcController {

    private boolean flag = false;

    @Value("${url:ceva}")
    String URL;
    @Value("${target.url:ceva}")
    String targetURL;
    @Value("${value:1}")
    String value;

    @Autowired
    PostToNextBackend post;

    @GetMapping(value = "/dummyValues")
    public String shit() {
        return URL + targetURL + value;
    }

    @GetMapping(value = "/start")
    public void startEndPoint() {
        flag = true;
        post.postToNextNode(value, targetURL);
    }

    @PostMapping(value = "/gdc")
    public void getGDC(@RequestBody String value) {
        System.out.println(value);
        if (flag) {
            post.finishTowerControl(value);
        } else {
            int gdc = Gdc.gdc(Integer.parseInt(value), Integer.parseInt(this.value));
            post.postToNextNode(String.valueOf(gdc), targetURL);
        }
    }

}
