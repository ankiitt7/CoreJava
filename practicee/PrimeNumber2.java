package practicee;
import java.util.*;
public class PrimeNumber2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=sc.nextInt();
	int i=2, count=0;
	while(i<n/2)
	{
		if(n%i==0)
		{
			count++;
		}
		i++;
	}
	if(count==0)
	{
		System.out.println("this is prime number: "+n);
	}
	else
	{
		System.out.println("this is not a prime number: "+n);
	}
}


}
