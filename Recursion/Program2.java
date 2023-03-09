package Recursion;

public class Program2 {

	static int findsum(int n)
	{
		if(n==1)
		{
			return n;
		}
		
		else
		{
		return n+findsum(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(findsum(5));
	}
}
