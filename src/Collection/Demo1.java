package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	float price;
	
	public Product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class Demo1 {
public static void main(String[] args) {
		
		List<Product> ProductList=new ArrayList<Product>();
		
		//Adding Products
		
		ProductList.add(new Product(1,"HP Laptop",25000f));
		ProductList.add(new Product(2,"Dell Laptop",31000f));
		ProductList.add(new Product(3,"Lenovo Laptop",45000f));
		ProductList.add(new Product(4,"Apple Laptop",80000f));
		ProductList.add(new Product(5,"Asus Laptop",50000f));
		ProductList.add(new Product(6,"Boat HeadPhone",2000f));
		
		
		List<Float> productList2=ProductList.stream().filter(p->p.price>30000) //filtering data
		                    .map(p->p.price)       //fetching price
		                    .collect(Collectors.toList());
		
		System.out.println(productList2);
	}

}