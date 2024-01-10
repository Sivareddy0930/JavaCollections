package AllCollection.SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class IteratorWithHashset {

	public static void main(String[] args) {
		

		
		Set s=new HashSet();
		
		s.add(200);
		s.add(100);
		s.add(800);
		s.add(500);
//		s.add(12.3456);
		s.add(1000);
		s.add(400);
		
		System.out.println("Iterator method:-");
		System.out.println(s);
		
		Iterator<Integer> i =s.iterator();
		

		
		while (i.hasNext()) {
		    Integer currentValue = i.next();
		    	if(currentValue == null) {
		    		continue;
		    		
		    	}
		    	else if
		    	(currentValue.equals(200)) {
		 		        i.remove();
		 		        }
		}

		System.out.println(s);
		
		
		
	}

}
