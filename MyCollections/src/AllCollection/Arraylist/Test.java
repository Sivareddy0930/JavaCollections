package AllCollection.Arraylist;

public class Test
{
	int i;
	public Test(int a)
	{
		this.i=a;
	}
	public static void main(String[] args) 
	{
		Test a1 = new Test(10);
		Test a2 = new Test(10);

		System.out.println(a1.equals(a2)); 			// content, true
		System.out.println(a1==a2);					// ref, false

	}

}
