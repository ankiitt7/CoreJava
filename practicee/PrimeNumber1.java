package practicee;

public class PrimeNumber1 
{
	public static void main(String[] args) 
	{
		
		for(int i=1;i<=100;i++)
		{
		int n=1;
		int count=0;
		while(n<=i/2)
		{
			if(i%n==0)
			{
				count++;
			}
			n++;
		}
		
			if(count==1)
			{
				System.out.println("prime no :" + i);
			}
		}
	}
}
	



