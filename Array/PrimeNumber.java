package Array;

import java.util.ArrayList;

public class PrimeNumber {
public static void main(String[] args) {
	ArrayList <Integer> a1=new ArrayList <Integer>();
	a1.add(55);
	a1.add(31);
	a1.add(23);
	a1.add(45);
	a1.add(57);
	a1.add(87);
	a1.add(78);
	a1.add(78);
	
	System.out.println(a1);
	
	ArrayList <Integer> a2=new ArrayList <Integer>();
	
	for(Integer x:a1)
	{
		if(checkPrime(x))
		{
			a2.add(x);
		}
}
	System.out.println(a2);
}

public static boolean checkPrime(int n)
{
	int count=0;
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	
}
}
