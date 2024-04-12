package ru.gb.my_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyServerApplication {
    public static void main(String[] args) {

        SpringApplication.run(MyServerApplication.class, args);
    }
}
