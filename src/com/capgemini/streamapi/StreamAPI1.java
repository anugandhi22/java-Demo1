package com.capgemini.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do not use this type of data
		/*List<Integer> list = List.of(2, 4, 6);	//of method, no limit //immutable type
		System.out.println(list);*/
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(35);
		list.add(61);
		list.add(17);
		list.add(190);
		list.add(16);
		list.add(352);
		list.add(618);
		list.add(171);
		list.add(1906);
		
		
		//System.out.println(list);
		
		//without stream API
		
		List<Integer> listEven = new ArrayList<>();
		for(Integer i: list) {
			if(i % 2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println("Original list: " + list);
		System.out.println("Even list: " +listEven);
		
		//using stream api
		//Stream<Integer> stream = new List<Integer>
		Stream <Integer>stream = list.stream();
		List<Integer> newList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(newList);
		
		//alternative method
		List<Integer> newList1 = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(newList1);
		
		//shortest method
		System.out.println(list.stream().filter(i -> i%2 == 0).collect(Collectors.toList()));
		
		//condition of >30
		System.out.println(list.stream().filter(i -> i > 30).collect(Collectors.toList()));

		List<Integer> stream2 = list.stream().filter(i -> i > 30).collect(Collectors.toList());

		//Stream<Integer> stream1 = list.stream();
		stream2.forEach(e->{
			System.out.println(e);
		});
		
	}

	
//double, float 
//string: names starting from particular letter
//stream.(string)
}