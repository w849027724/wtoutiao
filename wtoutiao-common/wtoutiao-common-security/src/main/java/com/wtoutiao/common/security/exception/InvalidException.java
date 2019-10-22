package com.wtoutiao.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wtoutiao.common.security.component.WAuth2ExceptionSerializer;

/**
 * @author wulijun
 * @date 2019/10/22 17:57
 */
@JsonSerialize(using = WAuth2ExceptionSerializer.class)
public class InvalidException extends WOAuth2Exception {
    public InvalidException(String msg, Throwable throwable) {
        super(msg);
    }

    @Override
    public String getOAuth2ErrorCode() {
        return "invalid_exception";
    }

    @Override
    public int getHttpErrorCode() {
        return 426;
    }
}
