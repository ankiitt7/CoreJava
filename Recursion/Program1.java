package Recursion;

public class Program1 { 
public static void main(String[] args) {
	PrintNum(5);
}
	static void PrintNum(int n)
	{
		if(n>0)
		{
			System.out.println(n);
			PrintNum(n-1);
			
		}
		
	}
}
