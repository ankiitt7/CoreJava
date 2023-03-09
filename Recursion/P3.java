package Recursion;

public class P3 {
public static void main(String[] args) {
	System.out.println(test(5));
}

public static String test(int n)
{
	if(n>0) {
	return n+" "+test(n-1);
	}
	else
	{
		return n+" ";
	}
}
}
