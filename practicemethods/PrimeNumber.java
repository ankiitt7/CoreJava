package practicemethods;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=2;
		int count=0;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==0)
		{
			System.out.println("Prime No");
		}
		else
		{
			System.out.println("Not a prime no");
		}
	}

}
