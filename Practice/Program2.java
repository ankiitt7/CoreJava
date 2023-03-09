package Practice;
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1, count=0;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				System.out.println(i);
				count++;
			}
		i++;
		}
		System.out.println("Total factors are:"+count);
		}


}
