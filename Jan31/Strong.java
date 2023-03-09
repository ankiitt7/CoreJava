package Jan31;

public class Strong {
public static void main(String[] args) {
	for(int i=1;i<=1000;i++)
	{
	int n=i;
	int temp=n;
	int sum=0;
	while(n>0)
	{
		int rem=n%10;
		fact(rem);
		sum=sum+fact(rem);
		n=n/10;
		
	}
	if(sum==temp)
	{
		System.out.println(temp+":Strong Number");
	}
//	else
//	{
//		System.out.println(temp+":Not a strong number");
//	}
}
}
public static int fact(int rem)
{
	int fact=1;
	while(rem>0)
	{
		fact=fact*rem;
		rem--;
	}
	return fact;
}
}
