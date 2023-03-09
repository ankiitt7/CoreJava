package Recursion;

public class P1 {
public static void main(String[] args) {
	test(5);
}

public static void test(int n)
{
	if(n>1)
	{
	System.out.println(n);
	test(n-1);
	}
	else
	{
		System.out.println(n);
	}
}
}
