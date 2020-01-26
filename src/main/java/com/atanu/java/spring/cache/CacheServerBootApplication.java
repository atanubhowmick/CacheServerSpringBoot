package com.atanu.java.spring.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author Atanu Bhowmick
 *
 */

@EnableCaching
@SpringBootApplication
public class CacheServerBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheServerBootApplication.class, args);
	}

}
