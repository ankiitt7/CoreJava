package Recursionn;

public class Fact {
	static int fact=1;
public static void main(String[] args) {
	System.out.println(fact(3));

}

static int fact(int n)
{
	if(n==0)
		return 1;
	else if(n>0)
	{
		fact=fact*n*(fact(n-1));
	}
	return fact;
}
}
