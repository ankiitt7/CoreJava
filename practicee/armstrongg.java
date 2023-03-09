package practicee;

public class armstrongg {

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
	for(;b>0;b--)
	{
		pow=pow*a;
	}
	return pow;
}
public static void main(String[] args) {
	
	int n=153;
	int c=count(n);
	int sum=0;
	int temp=n;
	while(n>0)
	{
		int r=n%10;
		int p=pow(r,c);
		sum=sum+p;
		n=n/10;
	}
	if(sum==temp)
	{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("Not a armstrong number");
	}
	
}
}
