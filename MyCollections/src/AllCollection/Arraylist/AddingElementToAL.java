package AllCollection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class AddingElementToAL {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> d=new ArrayList<Integer>();
		//add(element),add(index,element),set(index,element)
		d.add(2000);
		d.add(null);
		
		
				
		
		
		ArrayList<Integer> c=new ArrayList<Integer>();
		//add(element),add(index,element),set(index,element)
		c.add(100);
		c.add(100);
		c.add(null);
		c.add(100);
		c.add(null);
		c.add(1,5000);
		c.set(2,45000);
		
			
		System.out.println(c);
		System.out.println(d);
		
		c.addAll(d);
		System.out.println(c);
				
		
		

	}

}
