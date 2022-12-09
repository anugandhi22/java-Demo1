package Construct;

class Person{
	//Data members of the class	
	int id;
	String name;
	/**
	 * @param id
	 * @param name
	 */
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class ParaContruct {

	public static void main(String[] args) {
		
		Person Anu = new Person(12, "Anuradha");
		System.out.println("My Name is : "+ Anu.name +"\nRoll No. is : "+ Anu.id);

	}

}

