package com.freetek.freetekeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FreetekEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreetekEurekaApplication.class, args);
    }

}
