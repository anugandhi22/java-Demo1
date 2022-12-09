package com.capgemini.exception_handling;

public class TryCatch {

	public static void main(String[] args) {
		int numOne = 5;
		int numTwo = 500;
		
		try {
			System.out.println(numOne/numTwo);
		}
		catch(ArithmeticException e){
			System.out.println("Don't div with zero");
			//e.printStackTrace();
		}

	}

}