package com.paulo.spring.resttemplate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.spring.resttemplate.entities.Message;
import com.paulo.spring.resttemplate.services.MessagesService;

@RestController
@RequestMapping("/messages")
public class MessagesController {

	@Autowired private MessagesService messagesService;
	
	@GetMapping
	public List<Message> getAll(){
		return messagesService.getAll();
	}
	
	@PostMapping
	public Message save() {
		return messagesService.save();
	}
	
}
