package AllCollection.Queue;

import java.util.*;


public class LoopingThroughADQ {

	public static void main(String[] args) {
		ArrayDeque adq=new ArrayDeque();
		
		
		//adding
		adq.add(100);
		adq.addFirst(1234);
		adq.addLast(1234.5678);
		
		adq.offer(100);
		adq.offerLast(true);
		adq.offerFirst("Siva");
		
		System.out.println(adq);
		
		
//		for(int i=0;i<adq.size();i++) {
//			System.out.println(adq.poll());
//		}
//		
//		for(Object o:adq) {
//			System.out.println(o);
//		}
//		
//		Iterator it=adq.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		while(!adq.isEmpty()) {
			
				System.out.println(adq.poll());
				
				
			}

		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
