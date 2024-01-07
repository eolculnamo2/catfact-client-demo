package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.client.CatFactClient;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		CatFactClient catFactClient = new CatFactClient();
		var fact = catFactClient.requestCatFacts();
		System.out.println("fact " + fact.getFact());
		System.out.println("length " + fact.getLength());
	}

}
