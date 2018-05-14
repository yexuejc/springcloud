package com.yexuejc.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 *
 * @version 1.0.0
 * @ClassName: EurekaApplication
 * @Description: 服务注册中心 -> @EnableEurekaServer 开启服务注册中心
 * @author: maxf
 * @date: 2018/5/11 16:34
 */
@SpringBootApplication

@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
