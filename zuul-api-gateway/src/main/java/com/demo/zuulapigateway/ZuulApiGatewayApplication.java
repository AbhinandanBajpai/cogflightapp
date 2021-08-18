package com.demo.zuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}
	
	  @Bean
      public CorsFilter corsFilter() {
          final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
          final CorsConfiguration config = new CorsConfiguration();
          config.setAllowCredentials(true);
          config.addAllowedOrigin("*");
          config.addAllowedHeader("*");
          config.addAllowedMethod("GET");
          config.addAllowedMethod("POST");
          config.addAllowedMethod("DELETE");
          config.addAllowedMethod("PUT");
          config.setMaxAge(18000L);
          source.registerCorsConfiguration("/**", config);
          return new CorsFilter(source);
      }

}
