package com.yexuejc.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 分布式配置中心(Spring Cloud Config)
 *
 * @version 1.0.0
 * @ClassName: ConfigApplication
 * @Description: 服务配置中心 -> @EnableConfigServer 开启配置服务
 * @author: maxf
 * @date: 2018/5/11 16:52
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
