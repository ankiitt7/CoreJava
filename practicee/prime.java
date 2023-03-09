package practicee;

public class prime {
public static void main(String[] args) {
	int n=13;
	int i=2;
	int count=0;
	while(i<n/2)
	{
		if(n%i==0)
		{
			count++;
		}
		i++;
		if(count==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
}
}
