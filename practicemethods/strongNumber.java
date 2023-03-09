package practicemethods;
import java.util.Scanner;
public class strongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			int f=findFactorial(r);
			sum=sum+f;
			n=n/10;
			}
		if(sum==temp)
		{
			System.out.println("Strong No");
		}
		else
		{
			System.out.println("Not a Strong No");
		}
	}
		static int findFactorial(int n)
		{
			int fact=1;
			while(n>0)
			{
				fact=fact*n;
				n--;
			}
			return fact;
			}
}
