package com.capgemini.encapsulation;

class Encap{
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap Ob = new Encap();
		Ob.setAge(22);
		 System.out.println("The age of the person is: "+ Ob.getAge());

	}

}

