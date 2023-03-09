package Practice;
import java.util.Scanner;
public class Program6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
			if(rev==temp)
			{
				System.out.println("Palindrone No");
			}
			else
			{
				System.out.println("not a palindrone no");
			}
		}
	}


