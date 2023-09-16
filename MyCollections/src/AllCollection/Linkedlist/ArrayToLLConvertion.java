package AllCollection.Linkedlist;
import java.util.LinkedList;
import java.util.Arrays;
public class ArrayToLLConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s[]= {"siva","reddy","tumu","venkata"};
			System.out.println(s);//String Array
			
			LinkedList al=new LinkedList(Arrays.asList(s));//asList is a Arrays class Method.
			System.out.println(al);//ArrayList collection
			
			Object[] ss=al.toArray();//toArray is List method 
			
			System.out.println(ss);// AL to Array
			
			
			
			
	}

}
