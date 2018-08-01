package com.marcosbarbero.wd.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.annotation.PostConstruct;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

	@Value("${password}")
	String password;

	@PostConstruct
	private void postConstruct() {

		System.out.println("My password is: " + password);

	}
}
