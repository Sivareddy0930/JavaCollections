package CollectionsAndArraysMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysMethodsAll {

	public static void main(String[] args) {
	int a[]= {1,2,4,6,8};
	int b[]= {1,2,4,6,8};
	System.out.println(Arrays.toString(a));
	
	List<Integer> l1=Arrays.asList(Arrays.stream(a).boxed().toArray(Integer[]::new));
	
			System.out.println(l1);
			
			
			
			
			//check two arrays same or not.
			System.out.println(Arrays.equals(a, b));
			
		
			
			int c[]= {1,2,4,6,8,6,1,2,3,4,7,4,2,4};
			Arrays.sort(c);
			System.out.println(Arrays.toString(c));
			
			
			Arrays.fill(c,4);
			
			System.out.println(Arrays.toString(c));
			
			
	}

}
