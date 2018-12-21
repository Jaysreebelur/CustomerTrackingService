package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
public class MySpringApplication {

	public static void main(String[] args) {
		System.out.println("In Springboot app");
		SpringApplication.run(MySpringApplication.class, args);
	}
}
