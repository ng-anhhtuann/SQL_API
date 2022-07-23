package com.project.SQLandAPI;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API connected to MySQL", version = "cui`", description = "Senior Title"))
public class SqLandApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SqLandApiApplication.class, args);
	}
}
