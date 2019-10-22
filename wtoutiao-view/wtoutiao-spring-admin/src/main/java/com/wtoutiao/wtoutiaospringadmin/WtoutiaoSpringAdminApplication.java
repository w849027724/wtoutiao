package com.wtoutiao.wtoutiaospringadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class WtoutiaoSpringAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WtoutiaoSpringAdminApplication.class, args);
    }

}
