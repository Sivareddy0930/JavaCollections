package AllCollection.Arraylist;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToALConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s[]= {"siva","reddy","tumu","venkata"};
			System.out.println(s);//String Array
			
			ArrayList al=new ArrayList(Arrays.asList(s));//asList is a Arrays class Method.
			System.out.println(al);//ArrayList collection
			
			Object[] ss=al.toArray();//toArray is List method 
			
			System.out.println(ss);// AL to Array
			
	}

}
