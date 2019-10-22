package com.wtoutiao.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wtoutiao.common.security.component.WAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author wulijun
 * @date 2019/10/22 18:00
 */
@JsonSerialize(using = WAuth2ExceptionSerializer.class)
public class UnauthorizedException extends WOAuth2Exception {
    public UnauthorizedException(String msg, Throwable throwable) {
        super(msg);
    }

    @Override
    public String getOAuth2ErrorCode() {
        return "unauthorized";
    }

    @Override
    public int getHttpErrorCode() {
        return HttpStatus.UNAUTHORIZED.value();
    }
}
