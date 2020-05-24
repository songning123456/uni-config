package com.uni.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author songning
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@EnableDiscoveryClient
public class UniConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniConfigApplication.class, args);
    }

}
