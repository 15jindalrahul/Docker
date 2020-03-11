package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDocker1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDocker1Application.class, args);
		
	    System.out.println("docker from spring starter project");
	}

}
