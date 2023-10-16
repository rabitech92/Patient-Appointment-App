package com.appoinment.health.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class SpringdocConfig {
	
	@Bean
	public OpenAPI baseOpenAPI() {
		return new OpenAPI().info(new Info().title("Spring Doc").version("3.1.2").description("Spring doc"));
		
	}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
