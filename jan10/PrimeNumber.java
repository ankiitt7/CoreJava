package jan10;

public class PrimeNumber {
public static void main(String[] args) {
	
	for(int n=1;n<=100;n++)
	{
		int i=1;
		int count=0;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			count++;
		}
		i++;
	}
	if(count==1)
	{
		System.out.println(n+":Prime number");
	}
	
	}
	
	}
	
}


