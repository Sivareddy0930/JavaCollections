package MapInterface;

import java.util.HashMap;
import java.util.TreeMap;
public class MoreMethods {

	public static void main(String[] args) {
		HashMap hs=new HashMap();
		
		hs.put(101, "Siva");
		hs.put(102,"vamsi");
		hs.put(103, "vasu");
		hs.put(104, "Naveen");
		hs.put(105,"gopi");
		hs.put(106, "srinu");
		hs.put(105,"Gopi krishna Shima");
		hs.put(null,null);
		hs.put(107, "Siva");
		hs.put(108, null);
		hs.put(109, "vasu");

		hs.put(null, "Siva");//this replace the line 16 because same key .
		
		System.out.println(hs);
		
		

		
		
			
		//replace()
			
			System.out.println(hs.replace(107,"Kingu"));//Siva
			System.out.println(hs.replace(108,"Kingu Koduku"));//null
			System.out.println(hs);
			
		//----------------
			System.out.println(hs.replace(109,"vasu","subba"));//true
		
			System.out.println(hs);
			
			
		//isEmpty()
			
			System.out.println(hs.isEmpty());//false
			
		//size()
			System.out.println(hs.size());//10
			
		//equals()
			System.out.println();
			
		//hashCode()
		
			System.out.println(hs.hashCode());//-2002619463
		//clone()
			
			HashMap hs1=(HashMap)hs.clone();
			
		//equals()
			System.out.println(hs.equals(hs1));//true
			
		//convertion
			TreeMap t=new TreeMap();
				t.put(1,"Siva");
				t.put(2,"ok");
			HashMap j=new HashMap(t);
			System.out.println("To HashMap:"+j);
	}

}
