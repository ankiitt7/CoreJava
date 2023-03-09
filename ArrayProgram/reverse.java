package ArrayProgram;

import java.util.Arrays;

public class reverse {
public static void main(String[] args) {
	int [] a= {10,20,30,40,50,60};
	System.out.print("Original Array:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.print("After Reverse:");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	
//	int i=0,j=a.length-1,temp;
//	while(i<j)
//	{
//		temp=a[i];
//		a[i]=a[j];
//		a[j]=temp;
//		i++;
//		j--;
//	}
//	System.out.println(Arrays.toString(a));
}
}
