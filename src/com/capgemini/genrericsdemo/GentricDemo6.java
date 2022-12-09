//Generics Demo6
//Bound demo

package com.capgemini.genrericsdemo;

class Data<K extends String, V extends String>{
	
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKe() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Datas[key=" + key + "value = " + value + "]";
		
	}
	
	public<E extends String, N extends Integer> void display(E element, N number) {
		System.out.println("Element: " + element + " \nNumber is " + number );
	}
}

public class GentricDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<String, String>obj = new Data<String, String>("Sam", "abc");
		obj.display("Anuradha", 24);

	}

}
