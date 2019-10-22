package com.wtoutiao.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wtoutiao.common.security.component.WAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author wulijun
 * @date 2019/10/22 17:52
 */
@JsonSerialize(using = WAuth2ExceptionSerializer.class)
public class ServerErrorException extends WOAuth2Exception {
    public ServerErrorException(String msg, Throwable t) {
        super(msg);
    }

    @Override
    public String getOAuth2ErrorCode() {
        return "server_error";
    }

    @Override
    public int getHttpErrorCode() {
        return HttpStatus.INTERNAL_SERVER_ERROR.value();
    }


}
