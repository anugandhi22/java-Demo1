package com.capgemini.exception_handling;

public class Throws {
	
	static void disp()throws ArithmeticException{
		throw new ArithmeticException("This is my error");
	}

	public static void main(String[] args) {
		
		try {
			disp();
		}
		catch(ArithmeticException e) {
			System.out.println("Recatching my error");
		}

	}

}
