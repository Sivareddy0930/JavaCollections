package MapInterface;

import java.util.Collection;
import java.util.*;
import java.util.HashMap;
import java.util.Set;
public class Looping {

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
		
			
			//entrySet()
		
		
			Set<Map.Entry<String, Integer>> n=hs.entrySet(); // ==>Here entrys store in set in form of <Map.Entry<String, Integer>> 
				
//		Set n=hs.entrySet();
			System.out.println(n);
			
		
		
			System.out.println("--------------------------------------------------");

		
			
			
			
			//for-each
			for(Object o:n) {
				System.out.println(o);
			}
			
			
			for(Map.Entry<String, Integer> o:n) {
				System.out.println(o);
			}
		
			
	}

}
