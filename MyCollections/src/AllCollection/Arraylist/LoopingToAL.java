package AllCollection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopingToAL {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add("siva");
		al.add(20.4);
		al.add('d');

		//for loop
		System.out.println("For loop");
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		System.out.println("While loop");
		//while loop
		int j=0;
		while(j<=al.size()-1) {
			System.out.println(al.get(j));
			j++;
		}
		
		System.out.println("do-While loop");
		//do-while
		
		int k=0;
		do {
			System.out.println(al.get(k));
			k++;
		}while(k<=al.size()-1);
		
		//for-each
		System.out.println("for-each loop");
		
		for(Object value:al) {
			System.out.println(value);
		}
		//Iterator
		System.out.println("Iterator");
		 Iterator it=al.iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		
		
	}

}
