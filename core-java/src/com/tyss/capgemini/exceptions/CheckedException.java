package com.tyss.capgemini.exceptions;

import java.io.FileReader;
import java.util.Properties;

public class CheckedException {
	public static void main(String[] args) {
		Properties properties = new Properties();

		try {
			//properties.load(new FileReader("application.properties"));
			properties.load(new FileReader("application.properties"));
			System.out.println(properties.getProperty("name"));
		} catch (Exception e) {
			System.out.println("Exception caught in try..");
			e.printStackTrace();

		} finally {
			System.out.println("Code in finally block..");
		}

	}
}
