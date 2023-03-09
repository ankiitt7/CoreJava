package ArrayProgram;

import java.util.Arrays;

public class P31 {
public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	int n=3;
	System.out.println("Original Array:"+Arrays.toString(a));
	for(int i=0;i<n;i++)
	{
		int j,last;
		last=a[a.length-1];
		
		for(j=a.length-1;j>0;j--)
		{
			a[j]=a[j-1];
		}
		a[0]=last;
	}
	System.out.println();
	
	System.out.println("Array after right rotation:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
