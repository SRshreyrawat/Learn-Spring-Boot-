package com.example.Beans;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansApplication implements org.springframework.boot.CommandLineRunner {

	
	private final Apple apple;

	public BeansApplication(Apple apple) {
		this.apple = apple;
	}

	public static void main(String[] args) {
		SpringApplication.run(BeansApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		apple.getdata();
	}

}
