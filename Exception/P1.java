package Exception;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a");
		int a=sc.nextInt();
		System.out.println("ENter b");
		int b=sc.nextInt();
		System.out.println("Main starts");
		System.out.println(23+567-436*2);
		
		try
		{
			System.out.println(a/b);
		}
		catch(NullPointerException e)
		{
			System.out.println("Inside catch block");
			System.out.println("The result is infinity");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is caught");
		}
		catch(Exception e)
		{
			System.out.println("Exception paramtere");
		}
		System.out.println("34+5687");
		System.out.println("Program ends");
	}

}
