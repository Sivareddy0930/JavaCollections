package AllCollection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWithAL {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("reddy");
		al.add("siva");
		al.add("Hello");
		al.add("Hi");
		al.add("Tumu");
		al.add("Venkata");

		//Iterator
//		System.out.println("Iterator");
//		System.out.println(al);
		
		
//		 Iterator<String> it=al.iterator();
//		  while(it.hasNext()) {
//			  System.out.println(it.next());
//		  }
		
		
		// remove using iterator
		 Iterator<String> it=al.iterator();
		  while(it.hasNext()) {
			  String i=it.next();
			  if(i=="Hello"){
		
					 it.remove();// here remove is a iterator method.	
				 
			  }
			  
		  }
		  System.out.println(al);
		
		
		//Using ForEach loop 
		
//		for(String s:al) {
//			if(s=="Hi") {
//				al.remove(s);//ConcurrentModificationException
//			}
//			
//		}
//		
//		System.out.println(al);
//		
	}



}
