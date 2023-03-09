package Jan16;

import java.util.Scanner;

public class P1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the elements in array:");
	int [] a=new int[5];
	int largest=0;
	int secondlargest=0;
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>largest)
		{
			secondlargest=largest;
			largest=a[i];
		}
		if(a[i]>secondlargest && a[i]<largest)
			{
				secondlargest=a[i];
			}
		
	}
	System.out.println("Largest no is:"+largest);
	System.out.println("Second Largest no is:"+secondlargest);
	

}
}
