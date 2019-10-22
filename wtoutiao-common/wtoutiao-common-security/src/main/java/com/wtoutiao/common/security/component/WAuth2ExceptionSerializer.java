package com.wtoutiao.common.security.component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.wtoutiao.common.security.exception.WOAuth2Exception;
import lombok.SneakyThrows;

import java.io.IOException;

/**
 * @author wulijun
 * @date 2019/10/22 17:47
 */
public class WAuth2ExceptionSerializer extends StdSerializer<WOAuth2Exception> {
    protected WAuth2ExceptionSerializer() {
        super(WOAuth2Exception.class);
    }

    @Override
    @SneakyThrows
    public void serialize(WOAuth2Exception e, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectField("code", "-1");
        jsonGenerator.writeStringField("msg", e.getMessage());
        jsonGenerator.writeStringField("data", e.getErrorCode());
        jsonGenerator.writeEndObject();
    }
}
