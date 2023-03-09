package ArrayProgram;

import java.util.Scanner;

public class DeleteElementt {
public static void main(String[] args) {
	int [] array= {10,20,30,40,50};
	System.out.println("Enter the index you want to remove");
	Scanner sc=new Scanner(System.in);
	int index=sc.nextInt();
	for(int i=index;i<array.length-1;i++)
	{
		array[i]=array[i+1];
	}
	for(int i=0;i<array.length-1;i++)
	{
		System.out.print(array[i]+" ");
	}
	
}
}
