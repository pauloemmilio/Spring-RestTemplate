package com.paulo.spring.resttemplate.entities;

public class Message {

	private Long id;
	private String texto;
	
	public Message() {}

	public Message(String texto) {
		this.texto = texto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
