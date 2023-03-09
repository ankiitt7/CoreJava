package CustomException;

import java.util.Scanner;

public class Exam {
public static void main(String[] args) {
	System.out.println("Enter your marks:");
	Scanner sc=new Scanner(System.in);
	int marks=sc.nextInt();
	try
	{
		if(marks<40)
		{
			throw new FailedException("You failed in exam");
		}
		else
		{
			System.out.println("You passed the exam");
		}
	}
	catch(FailedException e)
	{
		e.printStackTrace();
	}
}
}
