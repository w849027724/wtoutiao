package com.wtoutiao.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wtoutiao.common.security.component.WAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author wulijun
 * @date 2019/10/22 17:59
 */
@JsonSerialize(using = WAuth2ExceptionSerializer.class)
public class ForbiddenException extends WOAuth2Exception {
    public ForbiddenException(String msg, Throwable throwable) {
        super(msg);
    }

    @Override
    public String getOAuth2ErrorCode() {
        return "access_denied";
    }

    @Override
    public int getHttpErrorCode() {
        return HttpStatus.FORBIDDEN.value();
    }
}
