package com.rbtxm.springdatajpa.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: guanxiangkai
 * @Description: 配置文件接受类
 * @Data: 2023年03月11日 周六 14时48分36秒
 **/
@Data
@ConfigurationProperties(prefix = "s.xss")
public class XssProperties {
}
