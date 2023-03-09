package ArrayProgram;

import java.util.Scanner;

public class GreatestSmallest {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int size=sc.nextInt();
int a []=new int[size];
for(int i=0;i<a.length;i++)
{
	System.out.println("Enter the array element:");
	a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
System.out.println();
int greatest=a[0];
int smallest=a[0];
for(int i=0;i<a.length;i++)
{
	if(a[i]>greatest)
	{
		greatest=a[i];
	}
		
	else if(a[i]<smallest)
	{
	 smallest=a[i];
	}
	
	
	
}
System.out.println("Greatest is:"+greatest);
System.out.println("Smallest is:"+smallest);
}
}
