package MapInterface;

import java.util.Collection;
import java.util.*;
import java.util.HashMap;
import java.util.Set;
public class MoreMethods2 {

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
		
		//putIfAbsent()
		
		hs.putIfAbsent("Siva", 200000);
		hs.putIfAbsent("Reddy",50000);
		
		System.out.println(hs);
		
		//remove()
			System.out.println(hs.remove(null));
			System.out.println(hs.remove("gopi"));
			System.out.println(hs.remove("Naveen",20000000));
			System.out.println(hs);
			
			
		//find only keys 
			//keySet()
			
		Set s=hs.keySet();
			System.out.println(s);
			
		
			//Find values.
			//values()
				
			Collection c=hs.values();
//			Set a=(Set)hs.values();
			
			System.out.println(c);
//			System.out.println(a);
			
			
			//entrySet()
			Set n=hs.entrySet();
			System.out.println(n);
		
			System.out.println("--------------------------------------------------");
			//iterator()
			
			Iterator i=n.iterator();		
			while(i.hasNext()) {
//				System.out.println(i.next());
				Map.Entry<String, Integer> p=(Map.Entry)i.next();
				
//				System.out.println(p.getKey()+" "+p.getValue());
				
				//p.setValue(2000);//it will change all the values.because it applying every key in loop.
				
				if((p.getKey()).equals("Siva")) {
					p.setValue(200000);
				}
				
				System.out.println(p.getKey()+" "+p.getValue());
				
			}
		
			
			
			
			//for-each
//			for(Object o:n) {
//				System.out.println(o);
//			}
			
			
			for(Map.Entry<String, Integer> o:hs.entrySet()) {
				System.out.println(o);
			}
		
			//clear()
			hs.clear();
				System.out.println(hs);
	}

}
