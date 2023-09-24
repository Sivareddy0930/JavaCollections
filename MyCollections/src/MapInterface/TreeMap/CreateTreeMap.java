package MapInterface.TreeMap;

import java.util.*;


public class CreateTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap s=new TreeMap();
		//Hetrogenous data is allowed when we use comparatoer() object in constuctor .
		//Here we are not useing any any comprator() so default sorting will applied .
		//And for default sorting same kind of data or keys  is required .so keys must be Homogenous while we using default sorting order. But values can be Hetrogenous also.
				
		s.put(1,"100");
		s.put(4,'S');
		s.put(2, 1.34f);
		s.put(5,true);
		s.put(3,123456);
		
		System.out.println(s);//{1=100, 2=1.34, 3=123456, 4=S, 5=true}
		

	}

}
