package ArrayProgram;

import java.util.Scanner;

public class P5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int [] a=new int[5];
	System.out.println("Enter the number you want to add in array:");
	
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
