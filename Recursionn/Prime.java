package Recursionn;

public class Prime {
	static int i=2;
	public static void main(String[] args) {
		if(isPrime(11))
		System.out.println("Prime");
		else
			System.out.println("Not a prime");
	}
	
	public static boolean isPrime(int n)
	{
		if(i==n/2+1)
			return true;
		
		if(n%i==0)
			return false;
		i++;
		return isPrime(n);
	}
}
