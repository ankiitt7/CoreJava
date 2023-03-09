package Recursionn;

public class Strong {
	static int n=145;
	
	static int sum;
public static void main(String[] args) {
	strong(n);
;
	if(sum==n)
	{
		System.out.println("Strong");
	}
	else
	{
		System.out.println("Not a strong");
	}
}

static int strong(int n)
{
	while(n>0)
	{
	int rem=n%10;
	int f=fact(rem);
	sum=sum+f;
	n=n/10;
	
	}
	return sum;
}
static int fact(int n)
{
	int fact=1;
	if(n==0)
		return 1;
	else if(n>0)
	{
		fact=fact*n*(fact(n-1));
	}
	return fact;
}
}
