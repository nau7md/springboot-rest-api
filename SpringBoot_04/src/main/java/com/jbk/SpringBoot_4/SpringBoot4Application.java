package com.jbk.SpringBoot_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.jbk" })
public class SpringBoot4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot4Application.class, args);

	}

}
