package com.wtoutiao.admin;

import com.wtoutiao.common.core.annotation.EnableWComponetScan;
import com.wtoutiao.common.swagger.annotation.EnableWtoutiaoSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@EnableWComponetScan
@EnableWtoutiaoSwagger2
@SpringCloudApplication
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
