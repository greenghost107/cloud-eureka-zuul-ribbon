package com.michael.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableEurekaClient
@EnableOAuth2Sso
//will enable configuration for an OAuth2 client in a web application that uses Spring Security and wants to use 
//the Authorization Code Grant from our auth-service and create a WebSecurityConfigurerAdapter with all paths secured
@EnableFeignClients
//scans for interfaces that declare they as feign clients
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAccountServiceApplication.class, args);
	}

}
