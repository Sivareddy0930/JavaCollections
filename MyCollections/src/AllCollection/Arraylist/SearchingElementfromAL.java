package AllCollection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class SearchingElementfromAL {
	
	
	public static void main(String[] args) {
		
			
		
		
		ArrayList<Integer> c=new ArrayList<Integer>();
		
		c.add(100);
		c.add(100);
		c.add(null);
		c.add(100);
		c.add(null);
		c.add(1,5000);
		c.set(2,45000);
		System.out.println(c);
		
		
	
		System.out.println(c.contains(100));
		
		
		//------------------------------------------------------
		ArrayList<Integer> d=new ArrayList<Integer>();
		
		d.add(2934);
		d.add(100);
		
		System.out.println(c.containsAll(d));
		
		//---------------------------------------
		
		System.out.println(c.indexOf(null));//it return first occurrence of null
		System.out.println(c.lastIndexOf(null));
		System.out.println(c.subList(2, 4));
		
		
		
	
		
		

	}

}
