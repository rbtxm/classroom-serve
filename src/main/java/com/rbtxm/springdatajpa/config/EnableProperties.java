package com.rbtxm.springdatajpa.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @Author: guanxiangkai
 * @Description:
 * @Data: 2023年03月11日 周六 15时35分09秒
 **/
@Configuration
@RefreshScope
@EnableDiscoveryClient
@EnableConfigurationProperties({XssProperties.class})
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EnableProperties {
}
