package com.example.rest.favoritos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestFavoritosApplication {

	public static void main(String[] args) {
		SpringApplication.from(FavoritosApplication::main).with(TestFavoritosApplication.class).run(args);
	}

}
