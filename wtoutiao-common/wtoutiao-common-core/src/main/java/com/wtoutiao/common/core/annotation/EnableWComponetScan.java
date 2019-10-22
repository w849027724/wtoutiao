package com.wtoutiao.common.core.annotation;

import com.wtoutiao.common.core.config.ComponentScanConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(ComponentScanConfig.class)
public @interface EnableWComponetScan {
}
