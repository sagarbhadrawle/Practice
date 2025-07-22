package com.masai.config;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.masai.CustomOncePerRequestFilter;
import com.masai.RequestValidateFilter;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
@EnableWebSecurity(debug = true)
public class SecurityConfig {

	@Bean
	public SecurityFilterChain masaiSecurityCongig(HttpSecurity http) throws Exception{
		
		http.sessionManagement(sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

		.cors(cors -> {

			cors.configurationSource(new CorsConfigurationSource() {

				@Override
				public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
					CorsConfiguration cfg = new CorsConfiguration();

					cfg.setAllowedOriginPatterns(Collections.singletonList("*"));
					cfg.setAllowedMethods(Collections.singletonList("*"));
					cfg.setAllowCredentials(true);
					cfg.setAllowedHeaders(Collections.singletonList("*"));
					cfg.setExposedHeaders(Arrays.asList("Authorization"));
					return cfg;
				}
			});

		})

		
		
		
		
		
		.authorizeHttpRequests(auth-> {
			
			auth.requestMatchers("/hello","/user").permitAll()
			.anyRequest().authenticated();
		
		})
		.addFilterBefore(new RequestValidateFilter(),BasicAuthenticationFilter.class  )
		.addFilterAfter(new CustomOncePerRequestFilter(),BasicAuthenticationFilter.class )
		.csrf(crsf->crsf.disable())
		.formLogin(Customizer.withDefaults())  // from login is login page, customizer is your login page
		.httpBasic(Customizer.withDefaults());
		
		
		return http.build();
		
	
	}
	
	
}
