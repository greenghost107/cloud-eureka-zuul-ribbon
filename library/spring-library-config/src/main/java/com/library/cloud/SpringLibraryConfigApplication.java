package com.library.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringLibraryConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLibraryConfigApplication.class, args);
	}

}
