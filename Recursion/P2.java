package Recursion;

public class P2 {
public static void main(String[] args) {
	System.out.println(sum(20,30));
	System.out.println(sum(sum(20,30),sum(30,40)));
	
}

public static int sum(int x,int y)
{
	int z=x+y;
	return z;
}
}
