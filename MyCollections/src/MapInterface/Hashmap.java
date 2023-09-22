package MapInterface;

import java.util.HashMap;
public class Hashmap {

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
		hs.put(null, "Siva");//this replace the line 16 because same key .
		
		
		System.out.println(hs);
		
		
		HashMap hs1=new HashMap();
		
		hs1.put(109, "Siva");
		hs1.put(110,"vamsi");
		hs1.put(111, "vasu");
		hs1.put(112, "Naveen");
		hs1.put(null,"Siva Reddy tumu");
		hs1.put(106, "Srinu");
		hs.putAll(hs1);
		System.out.println(hs);

	}

}
