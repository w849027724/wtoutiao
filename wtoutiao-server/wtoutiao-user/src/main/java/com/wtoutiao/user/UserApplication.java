package com.wtoutiao.user;

import com.wtoutiao.common.core.annotation.EnableWComponetScan;
import com.wtoutiao.common.security.annotation.EnableResourceServer;
import com.wtoutiao.common.swagger.annotation.EnableWtoutiaoSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@EnableResourceServer
@EnableWComponetScan
@EnableWtoutiaoSwagger2
@SpringCloudApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
