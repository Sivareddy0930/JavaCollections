package AllCollection.Queue;

import java.util.*;


public class CreatePQ {

	public static void main(String[] args) {
		Queue pq=new PriorityQueue();
		pq.add(100);
		pq.offer(100);
		pq.add(1234);
		pq.offer(101001);
//		pq.add(null);
//		pq.add(null);
		pq.offer("Siva");
		pq.add(1234.5678);
		pq.offer('S');
		pq.add(true);
//		pq.add(null);
//		pq.offer(null);
		pq.add(1234.5678);
		pq.offer('S');
		System.out.println(pq);
		
		Queue p=new PriorityQueue();
		p.add(100);
		p.offer(100000);
		p.add(9765);
		p.offer(1234);
		
		pq.addAll(p);
		System.out.println(pq);
		
		//-------------------------
		
		//Retriving data 
		
		
		System.out.println(pq.element());//100
		System.out.println(pq.peek());//100
		
		
		
		//---------------
//		retrive from empty queue
		Queue q=new PriorityQueue();
		
		System.out.println(q.peek());//null
		//System.out.println(q.element());//NoSuchElementException
		
		//removeing elements
		System.out.println("Removeing:-");
		System.out.println(pq.remove());//Queue method to remove first head element.
		System.out.println(pq.remove(1000));//Collection method based on element.
		System.out.println(pq.removeAll(p));
		System.out.println(pq.poll());//Queue method to remove first head element.
		
		
		
		
		
	
	}

}
