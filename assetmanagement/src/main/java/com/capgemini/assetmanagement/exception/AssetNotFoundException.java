package com.capgemini.assetmanagement.exception;

@SuppressWarnings("serial")
public class AssetNotFoundException extends Exception {
	String message;

	public AssetNotFoundException(String message) {

		super(message);
	}
}
