package com.gussoft.botica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@EnableR2dbcRepositories
public class BoticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoticaApplication.class, args);
	}

}
