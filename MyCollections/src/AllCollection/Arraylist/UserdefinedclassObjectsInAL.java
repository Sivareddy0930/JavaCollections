package AllCollection.Arraylist;

import java.util.ArrayList;

class Student{
	
}

public class UserdefinedclassObjectsInAL {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		//All these are UserdefinedclassObjects.
		
		ArrayList al=new ArrayList();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
//		al.add(10000);
		
		System.out.println(al);
		
		//-----------------------------------------------------------------------
		
		// Userdefined Generics
		
		ArrayList<Student> a=new ArrayList<Student>();
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		//it is a student type but we are trying to add  Integer.
//		a.add(10000);----->Error:-Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
								//The method add(int, Student) in the type ArrayList<Student> is not applicable for the arguments (int)
		
		System.out.println(a);

	}

}
