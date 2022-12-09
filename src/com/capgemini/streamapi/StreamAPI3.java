package com.capgemini.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String country[] = {"India", "USA", "UK", "Russia", "Japan", "France"};
		
		Stream<String> NewCountry = Stream.of(country);
		
		NewCountry.forEach(e->{
			System.out.println(e);
		});
		
	//	List<String> filteredList = country.stream().filter(i -> i.startsWith("U")).collect(Collectors.toList()));
		
		//map
		
		List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> newNumbers = numbers.stream().map(i -> i*i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		//for-each loop
		newNumbers.forEach(e->{
			System.out.println(e);
		});
		
		//::operator (short-	
		newNumbers.stream().forEach(System.out::println);
		
		//sorted
		System.out.println("Sorted numbers");
		numbers.stream().sorted().forEach(System.out::println);
		
		//country.stream().sorted().forEach(System.out::println);
		
		//min and max
		//max method
		Integer maxnum = numbers.stream().max((x, y)->x.compareTo(y)).get();
		System.out.println(maxnum);
		
		
	}

}
