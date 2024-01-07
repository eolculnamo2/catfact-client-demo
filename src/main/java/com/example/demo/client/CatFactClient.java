package com.example.demo.client;

import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

import com.example.demo.objects.CatFact;

public class CatFactClient {
	private final RestClient restClient;

	public CatFactClient() {
		this.restClient = RestClient.create();
	}

	public CatFact requestCatFacts() {
		return restClient.get()
				.uri("https://catfact.ninja/fact")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.body(CatFact.class);
	}
}
