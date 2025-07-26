package com.masai.config;


import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@org.springframework.context.annotation.Configuration
@EnableWebSecurity
public class Configuration {
	
	@Bean
	public SecurityFilterChain anymethod(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(
				auth->auth.requestMatchers(HttpMethod.POST,"/customers").permitAll().anyRequest().authenticated()
				)
		.csrf(c->c.disable())
		.httpBasic(Customizer.withDefaults())
		.formLogin(Customizer.withDefaults());
		
		
		
		return http.build();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
}
