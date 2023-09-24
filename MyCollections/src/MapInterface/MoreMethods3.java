package MapInterface;

import java.util.Collection;
import java.util.*;
import java.util.HashMap;
import java.util.Set;
public class MoreMethods3 {

	public static void main(String[] args) {
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		
		hs.put("Siva",100000);
		hs.put("vamsi",110000);
		hs.put("vasu",200000);
		hs.put("Naveen",20000000);
		hs.put("gopi",null);
		hs.put("srinu",101000);
		hs.put("Gopi krishna Shima",10000202);
		hs.put(null,null);
		hs.put(null,2000);
		hs.put("vasu",null);

		hs.put("Siva",1010000);
		
		System.out.println(hs);
		
		
		//find only keys 
			//keySet()
			
		Set s=hs.keySet();
			System.out.println(s);
			
			List l=new ArrayList(s);
//			Queue l=new PriorityQueue(s);//PriorityQueue dont allow null values.
			
			System.out.println(l);
		
			
			//Find values.
			//values()
				
			Collection c=hs.values();
			
			List a=new ArrayList(c);
			
			
			System.out.println(c);
			System.out.println(a);
			
			
			//entrySet()
			Set n=hs.entrySet();
			System.out.println(n);
			
			Collection ll=new LinkedList(n);
			System.out.println(ll);
		

	}

}
