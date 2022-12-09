//Generics Demo 4 
//Reusing of the code
package com.capgemini.genrericsdemo;

import java.util.ArrayList;
import java.util.List;

class Demo{
	public <E>void printListData(){
		
	}
	public <E>void printArrayData(List<E> obj1){
		for(E i : obj1) {
			System.out.println(i);
		}
	}
}

public class GentricDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj = new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		
		Demo d1 = new Demo();
		d1.printArrayData(obj);
		
		List<String>obj2 = new ArrayList<>();
		
		obj2.add("Hello");
		obj2.add("Everyone");
		obj2.add("Best");
		obj2.add("Training");
		obj2.add("From");
		obj2.add("TNSIF");
		
		d1.printArrayData(obj2);
		
		List<Float> obj3 = new ArrayList<>();
		obj3.add(44.66f);
		obj3.add(445.77f);
		
		d1.printArrayData(obj3);

	}

}