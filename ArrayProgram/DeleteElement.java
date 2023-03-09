package ArrayProgram;

import java.util.Scanner;

public class DeleteElement {
public static void main(String[] args) {
	int [] a= {10,20,30,40,50};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter element to delete:");
	int n=sc.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==n)
		{
		continue;	
		}
		System.out.println(a[i]);
	}
	
}
}
