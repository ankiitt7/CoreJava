package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P2 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		try
		{
			FileInputStream fis=new FileInputStream("d:/java.txt");
			System.out.println("FIle is found");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FIle is not found");
		}
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("undefined value");
		}
		System.out.println("Program ends");
	}
}
