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
//		a.add(4);
//		a.add(2);
//		a.add(5);
//		a.add(1);
//		a.add(4);
//		a.add(2);
//		a.add(4);
//		a.add(2);
		Collections.reverse(a);
		System.out.println(a);
	}

}
