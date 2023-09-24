package CollectionsAndArraysMethods;

import java.util.*;


public class CollectionsMethods {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(4);
		a.add(2);
		a.add(3);
		a.add(6);
		a.add(4);
		a.add(2);
		a.add(5);
		a.add(3);
		a.add(1);
//		a.add(4.444);
//		a.add('a');
//		a.add('A');
//
//		a.add('Z');

		
		System.out.println(a);
		
		
		//fill()
		
//		Collections.fill(a, 100);//it replace all elements with specified element.
//		System.out.println(a);//[100, 100, 100, 100, 100]
		
		
		//frequency()
		
		System.out.println(Collections.frequency(a,1));//finds the value repetition.
		
		//max()
		
		System.out.println(Collections.max(a));
		
		//min()
		
		System.out.println(Collections.min(a));
		
		//replaceAll()
		
		Collections.replaceAll(a, 3, 100);
		System.out.println("replaceAll:"+a);//it replace all 3 with 100.
		
		//reverse()
		
		Collections.reverse(a);
		System.out.println("reverse:"+a);
		
		//shuffle()
			
			Collections.shuffle(a);
			System.out.println("shuffle:"+a);
			
		//sort()
			Collections.sort(a);
			System.out.println("sort:"+a);
			
			//swap()
			Collections.swap(a, 2, 9);
			System.out.println("swap:"+a);
	}

}
