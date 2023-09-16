package AllCollection.Linkedlist;


import java.util.*;


public class CreateLLBasedOnDeque {

	public static void main(String[] args) {
		
//		LinkedList l=new LinkedList();
		Deque l=new LinkedList();
		
		l.add(100);
		l.add('S');
		l.add(100);
		l.add(100000.234564); 
		l.add(null);
		l.add("siva"); 
		l.add(true);
		l.add(null); 
		
		
		// we cant access this methods because reference type is Deque.Deque not consist of this methods only List can consist.
//		l.add(1,2.4544);
//		l.set(0,'s');
//		l.get(2)
		System.out.println(l);
		
		
		//---------------------------------
		
//		for(int i=0;i<l.size();i++) {
//			System.out.println(l.pollFirst());
//		}
		
		for(Object o:l) {
			System.out.println(o);
		}
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
