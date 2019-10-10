package com.kong.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude={ElasticsearchAutoConfiguration.class, RestClientAutoConfiguration.class})
public class Application extends SpringBootServletInitializer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	
	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch(Exception e) {
			LOGGER.error("Failed to start Application :: ", e);
		}
	}
}