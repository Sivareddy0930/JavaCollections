package AllCollection.Linkedlist;

import java.util.LinkedList;




public class ReadingElementfromLL {
	
	
	public static void main(String[] args) {
		
			
		
		
		LinkedList<Integer> c=new LinkedList<Integer>();
		
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
		
//		if(c.contains(45000)) {
//			System.out.println(c.indexOf(45000));
//		}
		
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		System.out.println(c.get(0));
			
		// we can perform reading using loops
		
		
	
		
		

	}

}
