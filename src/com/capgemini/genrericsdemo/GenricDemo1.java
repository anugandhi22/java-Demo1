//Genaric Demo
package com.capgemini.genrericsdemo;
import java.util.LinkedList;
import java.util.List;

class Test1<T>{
	private T myvariable;
	public Test1(T myvariable) 
	{
		this.myvariable = myvariable;
	}
	
	public T getMyvariable()
	{
		return myvariable;
	}
	
	@Override
	public String toString()
	{
		return "Test [myvariable = " + myvariable +"]";
	}
}

public class GenricDemo1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Test1<Object>> obj=new LinkedList<>();
		
		obj.add(new Test1<Object>("Hello"));
		obj.add(new Test1<Object>("All"));
		obj.add(new Test1<Object>(19));
		obj.add(new Test1<Object>('H'));
		
		System.out.println(obj);

	}

}
