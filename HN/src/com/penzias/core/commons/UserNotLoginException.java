package com.penzias.core.commons;

@SuppressWarnings("serial")
public class UserNotLoginException extends Exception {

	public UserNotLoginException(){
		this("用户无权访问");
	}
	
	public UserNotLoginException(String message){
		super(message);
	}
}
