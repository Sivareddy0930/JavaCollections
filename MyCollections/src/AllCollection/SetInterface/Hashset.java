package AllCollection.SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class Hashset {

	public static void main(String[] args) {

		HashSet<Integer> d=new HashSet<Integer>();//specified generic
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);
		System.out.println(d);
		
		Set<Integer> s=new HashSet<Integer>();
		
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
//		s.add(7);
		
		System.out.println(s);
		
		
		//union
		
//		d.addAll(s);
//		System.out.println(d);
		
		//Intersection
		
//		System.out.println(d.retainAll(s));
//		System.out.println(d);//it give mached elements of d from s.
		
		//difference
//		
//		System.out.println(d.removeAll(s));
//		System.out.println(d);//it give unmatched elements of d.
		
		
		//subset
		
		System.out.println(d.containsAll(s));//true    s is a sub set of d
		
		
		
	}

}
