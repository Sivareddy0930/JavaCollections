package AllCollection.Linkedlist;


import java.util.Collections;
import java.util.LinkedList;


public class OthersCreateLL {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		
		Collections.reverse(l);
		System.out.println(l);
		
		
	}

}
