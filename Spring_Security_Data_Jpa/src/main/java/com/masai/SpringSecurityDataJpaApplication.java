package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "REST API", version = "1.1"),
security = {
	@SecurityRequirement(name = "basicAuth"), 
	@SecurityRequirement(name = "bearerToken")
	}, 
servers = {
	@Server(url = "/", description = "Default Server URL")
    	}
)
@SecuritySchemes({
@SecurityScheme(name = "basicAuth", type = SecuritySchemeType.HTTP, scheme = "basic"),
@SecurityScheme(name = "bearerToken", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT")
})
public class SpringjwtswaggerappApplication {

public static void main(String[] args) {
	SpringApplication.run(SpringjwtswaggerappApplication.class, args);
}

}



@SpringBootApplication
public class SpringSecurityDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDataJpaApplication.class, args);
	}

}
