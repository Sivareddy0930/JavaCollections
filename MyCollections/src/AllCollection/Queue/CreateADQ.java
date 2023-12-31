package AllCollection.Queue;

import java.util.*;


public class CreateADQ {

	public static void main(String[] args) {
		Deque adq=new ArrayDeque();
		
		
		//adding
		adq.add(100);
		adq.addFirst(1234);
		adq.addLast(1234.5678);
		
		adq.offer(100);
		adq.offerLast(true);
		adq.offerFirst("Siva");
		
		
		System.out.println(adq);
		
		Deque a=new ArrayDeque();
		
		a.offer('S');
		a.add(true);
		a.add(1234.5678);
		a.offer('S');
		
		adq.addAll(a);
		System.out.println(adq);
		
		//---------------------------
		//Retriving 
		//it just taking data but not deleting.
		//peek,peekFirst,peekLast,getFirst,getlast,element
		System.out.println("Retriving:-");
		System.out.println(adq.element());//Siva
		System.out.println(adq.peek());//Siva
		System.out.println(adq.peekFirst());//Siva
		System.out.println(adq.peekLast());//S
		System.out.println(adq.getFirst());//Siva
		System.out.println(adq.getLast());//S
		
		//------------------------------------------
		
		//Removeing.
		
		
		Deque ad=new ArrayDeque();
		
		
		//adding
		ad.add(1);
		ad.add(2);
		ad.add(3);
		ad.add(4);
		ad.add(5);
		ad.add(6);
		ad.add(7);
		ad.add(6);
		ad.add(8);
		ad.add(6);
		ad.add(5);
		ad.add(8);
		ad.add(9);
		ad.add(10);
		ad.add(11);
		ad.add(12);
		
		
		
		
		System.out.println("removeing:-");
		//remove(Object o),removeAll() -->From Collection inteface.
		//remove(),poll() ----->from Queue to remove head element.
		//removeFirst(),removeLast(),pollFirst(),pollLast()  -->deque.
		//removeFirstOccurence(),removelastOccurenevce() -->deque
		
		System.out.println(ad);
		
		System.out.println(ad.remove(7));//true
		System.out.println(ad.remove());//1
		System.out.println(ad.poll());//2
		System.out.println(ad.removeFirst());//3
		System.out.println(ad.removeLast());//12
		System.out.println(ad.pollFirst());//4
		System.out.println(ad.pollLast());//11
		System.out.println(ad.removeFirstOccurrence(6));//true
		//it return true if task is accomplished.else false.
		System.out.println(ad.removeLastOccurrence(100));//false
		//it return true if task is accomplished.else false.
		
		Deque ad1=new ArrayDeque();
		
		
		//adding
		ad1.add(1);
		ad1.add(2);
		ad1.add(3);
		ad1.add(4);
		ad1.add(100);
		ad1.add(20);
		
		ad.removeAll(ad1);
		
		System.out.println(ad);//[5, 6, 8, 6, 5, 8, 9, 10]
		
	
		
		//Other methods from Collection interface.
		System.out.println("Other methods from Collection interface:-");
		System.out.println(ad.size());//8
		Object arr[]=ad.toArray();
		System.out.println(arr);//Some address.
		
		
		
		
		
		
		
		
		
		
	
	}

}
