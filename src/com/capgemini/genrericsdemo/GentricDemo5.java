//Generics Demo 5 Reuse
package com.capgemini.genrericsdemo;

import java.util.ArrayList;
import java.util.List;

class Demo2{
	
	//generic method
	<E>void printListData() {
		
	}
	
	public  <E>void printArrayData(List<Integer> obj1) {
		
		//iteration using for or for-each loop
		for(Integer i: obj1) {
			System.out.println(i);
		}
	}
}

public class GentricDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> object = new ArrayList<>();
		object.add(1);
		object.add(2);
		object.add(3);
		object.add(4);
		object.add(5);
		
		Demo r = new Demo();
		r.printArrayData(object);
		
		
	
		//System.out.println(object);

	}

}
