package Jan31;

public class Armstrong {
public static void main(String[] args) {
	for(int i=1;i<=1000;i++)
	{
	int n=i;
	int temp=n;
	int sum=0;
	int c=count(n);
	while(n>0)
	{
		int rem=n%10;
		int p=pow(rem,c);
		sum=sum+p;
		n=n/10;
	}
	if(sum==temp)
	{
		System.out.println("Armstrong:"+temp);
	}
//	else
//	{
//		System.out.println("Not armstrong");
//	}
}
}
public static int count(int n)
{
	int count=0;
	while(n>0)
	{
		count++;
		n=n/10;
	}
	return count;
}

public static int pow(int a,int b)
{
	int pow=1;
	while(b>0)
	{
		pow=pow*a;
		b--;
	}
	return pow;
}
}
