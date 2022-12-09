package com.capgemini.predicate;

import java.util.function.IntPredicate;

public class Predicate1 {

	public static void main(String[] args) {
		
		
		IntPredicate obj = i -> i > 18; 
		IntPredicate obj1 = i -> i < 60; 
			System.out.println(obj.and(obj1).test(65));	
	}

}
