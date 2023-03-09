package Practice;
import java.util.Scanner;
public class Program9 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the base:");
			int b=sc.nextInt();
			System.out.println("Enter the exp:");
			int e=sc.nextInt();
			int pow=1;
			while(e>0)
			{
				pow=b*pow;
				e--;
			}
			System.out.println(pow);
		}

	}