package jan10;

public class ArrayDuplicate {
public static void main(String[] args) {
	
	int [] a= {10,20,30,40,40,50,5050,50};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
			System.out.println(a[i]);
			}
		}
	}
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i]!=-1)
//		{
//			System.out.println(a[i]);
//		}
//		
//	}
	
	
}
}
