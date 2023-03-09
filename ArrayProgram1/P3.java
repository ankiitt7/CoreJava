package ArrayProgram1;

import java.util.Scanner;

public class P3 {
public static void main(String[] args) {
	int [] a= {10,20,30,40,50};
	int [] temp=new int[a.length+1];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter index you want to insert a value");
	int insert=sc.nextInt();
	System.out.println("Enter value");
	int value=sc.nextInt();
	
	for(int i=0;i<temp.length;i++)
	{
		if(i<insert)
		{
			temp[i]=a[i];
		}
		else if(i==insert)
		{
			temp[i]=value;
		}
		else
		{
			temp[i]=a[i-1];
		}
	}
	
	for(int i=0;i<temp.length;i++)
	{
		System.out.print(temp[i]+" ");
	}
}
}
