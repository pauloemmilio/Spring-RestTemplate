package com.paulo.spring.resttemplate.services;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.paulo.spring.resttemplate.entities.Message;

@Service
public class MessagesService {

	private static final String BASE_URL = "https://mensagens-api.herokuapp.com/mensagens";

	public List<Message> getAll() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Message[]> response = restTemplate.getForEntity(BASE_URL, Message[].class);
		Message[] message = response.getBody();
		return Arrays.asList(message);
	}

	public Message save() {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Message> request = new HttpEntity<>(new Message("New message at: " + LocalDateTime.now().toString()));
		Message message = restTemplate.postForObject(BASE_URL, request, Message.class);
		return message;
	}
}
