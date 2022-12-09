package com.capgemini.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPI4 {

	public static void main(String[] args) {
		
		
		//list of +ve and -ve numbers
		List<Integer> numbers = Arrays.asList(4, 6, -8, 9, 22, 567, 787 , -73);
		float sum = numbers.stream().reduce(0, (a1, a2) -> a1/a2);
		System.out.println(sum);
	}

}
