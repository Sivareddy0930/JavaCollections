package AllCollection.SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class IteratorWithHashset {

	public static void main(String[] args) {
		

		
		Set s=new HashSet();
		
		s.add(200);
		s.add("Reddy");
		s.add(true);
		s.add(null);
//		s.add(12.3456);
		s.add(1234.1234);
		
		System.out.println("Iterator method:-");
		System.out.println(s);
		Iterator i =s.iterator();
		
//		while (i.hasNext()) {
//		    Object currentValue = i.next();
//
//		    if (currentValue.equals((Object) 200)) {
//		        i.remove();//if your set consist of null value .we get error because we cannot perform operations like equal()on null values
//		        }
//		}
		
		while (i.hasNext()) {
		    Object currentValue = i.next();
		    	if(currentValue == null) {
		    		continue;
		    		
		    	}
		    	else if
		    	(currentValue.equals((Object) 200)) {
		 		        i.remove();//if your set consist of null value .we get error because we cannot perform operations like equal()on null values
		 		        }
		}

		System.out.println(s);
		
		
		
	}

}
