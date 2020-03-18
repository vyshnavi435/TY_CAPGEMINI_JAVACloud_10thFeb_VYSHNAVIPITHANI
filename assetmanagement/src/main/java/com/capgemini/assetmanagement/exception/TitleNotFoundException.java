package com.capgemini.assetmanagement.exception;

@SuppressWarnings("serial")
public class TitleNotFoundException extends RuntimeException {
	String message;
	public TitleNotFoundException() {
		
		this.message="Title  Mismatch Exception";
	}
		
		@Override
		public String getMessage() {
			return message;
		}

	}


