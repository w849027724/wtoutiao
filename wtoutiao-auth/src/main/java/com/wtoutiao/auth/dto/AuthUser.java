package com.wtoutiao.auth.dto;

import lombok.Data;

/**
 * @author wulijun
 * @date 2019/10/22 15:18
 */
@Data
public class AuthUser {
    private String username;
    private String password;
    private String code;
    private String scope;
}
