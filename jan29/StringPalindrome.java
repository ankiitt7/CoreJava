package jan29;

public class StringPalindrome {
	public static void main(String[] args) {
		String s="Dad";
		int length=s.length();
		String rev="";
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindome");
		}
		
		
		
	}

}
