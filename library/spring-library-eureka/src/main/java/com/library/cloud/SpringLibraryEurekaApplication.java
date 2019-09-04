package com.library.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringLibraryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLibraryEurekaApplication.class, args);
	}

}
