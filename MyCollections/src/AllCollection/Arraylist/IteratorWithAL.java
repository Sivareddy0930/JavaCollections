package AllCollection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWithAL {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("reddy");
		al.add("siva");
		al.add("Tumu");
		al.add("Venkata");


		//Iterator
		System.out.println("Iterator");
		 Iterator<String> it=al.iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		
		
	}

}
