package com.paramkansagra.springBootProject1;

import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProject1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject1Application.class, args);
	}

	// This is tight coupling and
	RazorPaymentService paymentService = new RazorPaymentService();

	// This runs just after the application context is set and everything is good to go
	@Override
	public void run(String @NonNull ... args) throws Exception {
		paymentService.pay();
	}
}
