package AllCollection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class ReadingElementfromAL {
	
	
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
		System.out.println(c.get(0));	
		System.out.println(c.get(5));
		
		System.out.println(c);
		//-----------------------------------------
		
		
		
		System.out.println(c.isEmpty());
		System.out.println(c.size());
			
		// we can perform reading using loops
		
		
	
		
		

	}

}
