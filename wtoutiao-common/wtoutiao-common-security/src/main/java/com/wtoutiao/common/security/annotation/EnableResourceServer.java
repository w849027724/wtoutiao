package com.wtoutiao.common.security.annotation;

import com.wtoutiao.common.security.component.WResourceServerConfigurerAdapter;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import java.lang.annotation.*;

/**
 * @author wulijun
 * @date 2019/10/22 16:55
 */
@Documented
@Inherited
@EnableResourceServer
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
// 开启注解
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import({WResourceServerConfigurerAdapter.class})
public @interface EnableResourceServer {
}
