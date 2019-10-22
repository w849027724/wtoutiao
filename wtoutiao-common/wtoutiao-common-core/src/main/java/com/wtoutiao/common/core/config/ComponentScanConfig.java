package com.wtoutiao.common.core.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wulijun
 * @Title: ComSan
 * @date 2019/10/18 16:05
 */
@ComponentScan("com.wtoutiao")
@MapperScan("com.wtoutiao.**.mapper")
public class ComponentScanConfig {
}
