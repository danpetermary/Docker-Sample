package com.stackroute.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan (basePackages="com.stackroute.demo")
@SpringBootApplication
public class DockerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSampleApplication.class, args);
	}

}
