package AllCollection.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;



public class OtherMethodsOnAL {
	
	
	public static void main(String[] args) {
		
			
		
		
		ArrayList<String> c=new ArrayList<String>();
		
		c.add("siva");
		c.add("100");
		c.add(null);
		c.add(3,"vamsi");
		c.set(2,null);
		
		

		ArrayList<String> d=new ArrayList<String>();
		
		d.add("siva");
		d.add("50000");
		d.add(null);
		d.add("c");
		
		
			//convert AL to Array
		
		Object a[]=c.toArray();
		
		System.out.println(a[1]);//100
		
		//Arrays to List type
		
		List k=Arrays.asList(a);
		System.out.println(k.getClass());
		//------------------------------------------------
		
		//equals()
		
		System.out.println("Equals method :-"+ c.equals(d));//false
		
		//hashcode()	-----> it return hashcode() of the collectionn object.
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		//-----------------------------------------
		//clone()
//		Object z=d.clone();
		ArrayList z=(ArrayList)d.clone();
		System.out.println(z);
		
		
		
		
	
		
		
		

	}

}
