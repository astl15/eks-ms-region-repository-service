package com.astl.esk.ms.regionrepositoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RegionRepositoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegionRepositoryServiceApplication.class, args);
	}

}
