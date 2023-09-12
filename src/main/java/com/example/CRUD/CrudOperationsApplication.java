package com.example.CRUD;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class CrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationsApplication.class, args);
	}

}
