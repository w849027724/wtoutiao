package com.wtoutiao.user.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wulijun
 * @Title: TestController
 * @date 2019/10/15 20:13
 */
@RestController
@Api(value = "user", tags = "用户模块")
public class TestController {

    @ApiOperation(value = "用户登录", notes = "用户登录接口")
    @ApiResponses({
            @ApiResponse(code = 0, message = "success"),
            @ApiResponse(code = 10001, message = "用户名错误", response = IllegalArgumentException.class),
            @ApiResponse(code = 10002, message = "密码错误")
    })
    @PostMapping(value = "/login")
    public String login(@ApiParam(name = "username", value = "用户名", required = true) @RequestParam String username,
                        @ApiParam(name = "password", value = "密码", required = true) @RequestParam String password){
        return "{'username':'" + username + "', 'password':'" + password + "'}";
    }

}
