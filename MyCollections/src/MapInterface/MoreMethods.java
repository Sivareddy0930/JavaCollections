package MapInterface;

import java.util.HashMap;
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
			
			System.out.println(hs.replace(107,"Kingu"));
			System.out.println(hs.replace(108,"Kingu Koduku"));
			System.out.println(hs);
			
		//----------------
			System.out.println(hs.replace(109,"vasu","subba"));
		
			System.out.println(hs);
			
			
		//isEmpty()
			
			System.out.println(hs.isEmpty());//false
			
		//size()
			System.out.println(hs.size());
			
		//equals()
			System.out.println(hs.);
			
		//clear()
			System.out.println();
			
		
	}

}