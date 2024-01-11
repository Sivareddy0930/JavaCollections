package MapInterface;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapPractice {


		public static void main(String[] args) {
			Map<String,String> h1=new HashMap<>();
			
			h1.put("emp1","siva");
			h1.put("emp2","vamsi");
			h1.put("emp3","vasu");
			h1.put("emp4","Naveen");
			h1.put("emp5","subba");
			h1.put("emp6","koti");
			h1.put("emp7","gopi");
			h1.put(null,"aunny");
			h1.put("New1","bunny");
			h1.put("emp8","cunny");
			h1.put("new2","dunny");
			h1.put(null,null);
			
			System.out.println(h1);
			
			
			System.out.println(h1.size());//11
			System.out.println(h1.isEmpty());//false
			System.out.println(h1.hashCode());
			
			System.out.println(h1.get("emp1"));//siva
			System.out.println(h1.get("new2"));//dunny
			System.out.println(h1.get("emp100"));//null
			System.out.println(h1.get("Naveen"));//null
			System.out.println(h1.get(null));//null
			
			h1.remove("New1");
			System.out.println(h1);
			
			h1.replace("emp8","zunny");
			System.out.println(h1);
			
			Collection c=h1.values();
			System.out.println(c);
			
			Set s=h1.keySet();
			System.out.println(s);
			
			Set<Map.Entry<String, String>> e=h1.entrySet();
			System.out.println(e);
			
			for (Entry<String, String> entry : e) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
			
			System.out.println("--------------------------------------");
			
			Iterator<Map.Entry<String,String>> iterat=e.iterator();
			
			while (iterat.hasNext()) {
				
				Map.Entry<String, String> p=iterat.next();
				
				System.out.println(p.getKey()+":"+p.getValue());
				
			}
			

		}


}
