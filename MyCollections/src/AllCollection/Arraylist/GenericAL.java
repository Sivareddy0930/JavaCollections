package AllCollection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class GenericAL {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> c=new ArrayList<Integer>();
		//add(),add(index,element),set(index,element)
		c.add(100);
		c.add(null);
		c.add(100);
		c.add(null);
		c.add(1,5000);//just adding 
		c.set(2,45000);// replacing happend.
		
		
				
		System.out.println(c);
		
		
		
		
		
		

	}

}
