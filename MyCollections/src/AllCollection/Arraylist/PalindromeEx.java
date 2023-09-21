package AllCollection.Arraylist;

public class PalindromeEx
{
	public static void palindromeTest(String str)
	{
		String st = str.toLowerCase();
		StringBuilder sb = new StringBuilder(st);
					sb.reverse();
					
					if(st.contentEquals(sb))
						System.out.println("The given string,"+ st +" is palindrome,");
					else
						System.out.println("Given string,"+ st +" is not palindrome");
	}
	
	
	public static void palindromeTst(String st)
	{
		String str = "";
		
		for(int i=st.length()-1; i>=0; i--)
		{
			str += st.charAt(i);
		}
			
		if(str.equals(st))
			System.out.println("Palindrome");
		else
			System.out.println("Not an palindrome");
	}
	public static void main(String[] args) 
	{
//		palindromeTest("String");
//		palindromeTest("Malayalam");
		palindromeTst("malayalam");
	}

}
