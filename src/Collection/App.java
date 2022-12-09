package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


	class Data
	{
		private String name;

		public Data(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Data [name=" + name + "]";
		}
		
		}


public class App {
	public static void main(String[] args) {
		List<Data> list=new ArrayList<>();
		list.add(new Data("Anuradha"));
		list.add(new Data("Sachin"));
		list.add(new Data("Bhushan"));
		list.add(new Data("Sayali"));
		list.add(new Data("Rohan"));
		list.add(new Data("Sakshi"));

				
		
		Collections.sort(list,(Data o1,Data o2)->{return o1.getName().compareTo(o2.getName());});
		
		for (Data data:list)
		{
			System.out.println(data.getName());
		}
	}
	}
