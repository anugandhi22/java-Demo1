//Generics Demo 2
package com.capgemini.genrericsdemo;

import java.util.LinkedList;
import java.util.List;

class Test<T>{
	private T obj;
	
	public Test(T obj) {
		this.obj = obj;
		
	}
	
	public T getObj() {
		return obj;
	}
	
	@Override
	public String toString() {
		return "Test [obj = " + obj + "]";
	}
}

public class GenricDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj = new LinkedList();
		
		obj.add(10);
		obj.add(1);
		obj.add(8);
		
		
		System.out.println(obj);

	}

}