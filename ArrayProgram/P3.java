package ArrayProgram;

public class P3 {
public static void main(String[] args) {
	
	int [] a= {10,20,5,6,7,46};
	
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i]%2==0)
//		{
//			System.out.print(a[i]+" ");
//		}
//	}
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			sum=sum+a[i];
			
		}
		
	}
	System.out.println(sum);
}
}
