package com.tyss.capgemini.Inheritance;
import com.tyss.capgemini.methods.Methods;
public class Differentpackagemethodoverridingclass extends Methods {
	
	@Override
	public String printMessage() { // private default protected  public security
		
		return "Differentpackagemethodoverridingclass.printMessage() ";
	}
	@Override
	protected String welcomeMessage() {
		
		return "hello world from Differentpackagemethodoverridingclass.welcomeMessage()";
	}
	
	public static void main(String[] args) {
		 Differentpackagemethodoverridingclass D = new   Differentpackagemethodoverridingclass() ;
		 System.out.println(D.printMessage());
		 System.out.println(D.welcomeMessage());
		
	}
	
	

}
