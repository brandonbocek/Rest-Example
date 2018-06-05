package org.brandon.messenger.exception;

public class DataNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -632826661536343936L;
	
	public DataNotFoundException(String message){
		super(message);
	}
}
