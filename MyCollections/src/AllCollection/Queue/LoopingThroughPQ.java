package AllCollection.Queue;

import java.util.*;


public class LoopingThroughPQ {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		
		
		//adding
		q.add(100);
		q.offer(200);
		q.offer(300);
		q.offer(200);
		q.offer(400);
		q.offer(500);
		
		
		
		
//		
//		for(int i=0;i<q.size();i++) {
//			System.out.println(q.[i]);
//		}
//		int j=0;
		while(!q.isEmpty()) {
		
			System.out.println(q.poll());
			
			
		}
		
		for(Object o:q) {
			System.out.println(o);
		}
		
		Iterator it=q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
