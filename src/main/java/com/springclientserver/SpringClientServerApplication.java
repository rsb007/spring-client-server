package com.springclientserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class SpringClientServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringClientServerApplication.class, args);
    }

}
