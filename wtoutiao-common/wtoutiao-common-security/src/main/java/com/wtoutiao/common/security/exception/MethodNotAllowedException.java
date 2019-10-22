package com.wtoutiao.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wtoutiao.common.security.component.WAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author wulijun
 * @date 2019/10/22 17:55
 */
@JsonSerialize(using = WAuth2ExceptionSerializer.class)
public class MethodNotAllowedException extends WOAuth2Exception {
    public MethodNotAllowedException(String msg, Throwable t) {
        super(msg);
    }

    @Override
    public String getOAuth2ErrorCode() {
        return "method_not_allowed";
    }

    @Override
    public int getHttpErrorCode() {
        return HttpStatus.METHOD_NOT_ALLOWED.value();
    }
}
