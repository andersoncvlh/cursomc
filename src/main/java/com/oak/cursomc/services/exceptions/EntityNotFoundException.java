package com.oak.cursomc.services.exceptions;

public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8732213834054130354L;
	
	public EntityNotFoundException(String message) {
		super(message);
	}
	
	public EntityNotFoundException(String message, Throwable t) {
		super(message, t);
	}

}
