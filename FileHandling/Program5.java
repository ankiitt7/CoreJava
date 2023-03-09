package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1=sc.nextLine();
		try {
			FileWriter fw1=new FileWriter("e:\\j2ee.txt");
			fw1.write(s1);
			fw1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
