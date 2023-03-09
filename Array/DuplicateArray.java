package Array;

public class DuplicateArray {
public static void main(String[] args) {
	
	int [] a= {10,20,30,10,30,60,70};

	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				a[i]=-1;
			}
		}
	}
	System.out.println();
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=-1)
		{
			System.out.print(a[i]+" ");
		}
	}
}
}
