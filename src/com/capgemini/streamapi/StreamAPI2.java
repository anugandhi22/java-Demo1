package com.capgemini.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float> list1 = new ArrayList<>();
		
		list1.add(42.2f);	//e
		list1.add(6.2f);	//e
		list1.add(25.3f);
		list1.add(6.9f);	
		list1.add(0.56f);	//e
		list1.add(2.0f);
		
		System.out.println(list1);
		
		
		
		Stream <Float>stream = list1.stream();
		List<Float> newList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(newList);
		
		//System.out.println(list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList()));
		
	}

}