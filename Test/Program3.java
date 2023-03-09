package Test;
import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
	
		for(int k=1;k<=2;k++)
		{
			 n=n+n;
		}
		System.out.println(n);
		
	}
	
	
}
