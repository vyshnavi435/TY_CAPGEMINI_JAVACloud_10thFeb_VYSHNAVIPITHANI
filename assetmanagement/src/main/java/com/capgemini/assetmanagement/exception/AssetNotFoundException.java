package com.capgemini.assetmanagement.exception;

@SuppressWarnings("serial")
public class AssetNotFoundException extends Exception {

	public AssetNotFoundException(String message) {

		super("Invaled asset");
	}
}
