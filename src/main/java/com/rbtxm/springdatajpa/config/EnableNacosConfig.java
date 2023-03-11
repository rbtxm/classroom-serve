package com.rbtxm.springdatajpa.config;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author: guanxiangkai
 * @Description: 配置文件接受类
 * @Data: 2023年03月11日 周六 14时48分36秒
 **/
@Configuration
@RefreshScope
@EnableDiscoveryClient
@EnableConfigurationProperties({Config.class})
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EnableNacosConfig {
}
