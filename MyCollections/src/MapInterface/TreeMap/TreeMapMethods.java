package MapInterface.TreeMap;

import java.util.*;


public class TreeMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap s=new TreeMap();
		
		s.put(1,"100");
		s.put(4,'S');
		s.put(2, 1.34f);
		s.put(5,true);
		s.put(6,123456);
		s.put(8,"100");
		s.put(7,null);
		s.put(9,null);
		s.put(10,false);
		s.put(0,"0k");
		s.put(11,"200");
		//s.put(null,"0k");//NPE
		
		System.out.println(s);
		
			
			System.out.println(s.firstKey());
			System.out.println(s.lastKey());
			System.out.println(s.headMap(5));
			System.out.println(s.tailMap(5));
			System.out.println(s.subMap(4,9));
			
			
		

	}

}
