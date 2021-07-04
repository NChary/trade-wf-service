package com.trade.wf.exception;

public class CustomerNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -7922956903570453603L;

	public CustomerNotFoundException(String message) {
		super(message);
	}
}
