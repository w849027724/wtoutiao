package com.wtoutiao.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wtoutiao.common.security.component.WAuth2ExceptionSerializer;
import lombok.Getter;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * @author wulijun
 * @date 2019/10/22 17:38
 */
@JsonSerialize(using = WAuth2ExceptionSerializer.class)
public class WOAuth2Exception extends OAuth2Exception {

    @Getter
    private String errorCode;

    public WOAuth2Exception(String msg) {
        super(msg);
    }

    public WOAuth2Exception(String msg, String errorCode) {
        super(msg);
        this.errorCode = errorCode;
    }
}
