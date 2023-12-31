package AllCollection.SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class Hashset2 {

	public static void main(String[] args) {
		
//		Set a=new HashSet();
		Set x=new HashSet(100,0.95f);
		HashSet<Integer> d=new HashSet<Integer>();//specified generic
		HashSet a=new HashSet();
		
		
		//adding
		
		a.add(100);
		a.add("Siva");
		a.add('S');
		a.add(100);
		a.add(null);
		a.add(12.3456);
		a.add(100);
		a.add(null);
		
		System.out.println(a);
		
		Set s=new HashSet();
		
		s.add(200);
		s.add("Reddy");
		s.add(true);
		s.add(null);
//		s.add(12.3456);
		s.add(1234.1234);
		
		a.addAll(s);
		System.out.println(a);
		
		//reading
		System.out.println(s.contains("Reddy"));
		System.out.println(a.containsAll(s));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		//removing
		
		System.out.println(a.remove(12.3456));
		System.out.println(a.removeAll(s));
		
		//Other methods.
		HashSet k=(HashSet)a.clone();
		System.out.println("Cloned set"+k);
		
		System.out.println(a.equals(k));
		
		System.out.println(a.retainAll(s));
		System.out.println(a);
		
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
		Object o[]= s.toArray();
		System.out.println(o);//Some Address.
		
		//looping 
		
		for(Object g:s) {
			System.out.println(g);
			
		}
		System.out.println("Iterator method:-");
		System.out.println(s);
		Iterator i =s.iterator();
		
		while(i.hasNext()) {
			//System.out.println(i.next());
			
			
			
			if(i.next() == (Object)200) {
				i.remove();
				
			}
		}
		System.out.println(s);
		
		
		
	}

}
