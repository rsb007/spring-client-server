package com.springclientserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {

    @Value("${rsb.url}")
    private String name;

    @Value("${rsb.location}")
    private String location;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @GetMapping("/db")
    public String dbDetails(){
        return String.format("username - %s and password -%s", username,password);
    }

    @GetMapping("/user")
    public String userDetails(){
        return String.format("name - %s and location - %s", name, location);
    }
}
