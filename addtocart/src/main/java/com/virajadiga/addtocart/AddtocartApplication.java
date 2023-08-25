package com.virajadiga.addtocart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AddtocartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddtocartApplication.class, args);
	}

}
