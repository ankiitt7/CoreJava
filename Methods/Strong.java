package Methods;

public class Strong {
	public static int findfact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
}
	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
			int f=findfact(rem);
			sum=sum+f;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a strong number");
		}
	}
}
