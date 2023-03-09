package ArrayProgram;

public class P16 {
//ascending order by method
	public static void main(String[] args) {
		int [] a= {23,43,45,25,75,32};
		
		int [] r=sortArray(a);
		
		for(int i=0;i<r.length;i++)
		{
			System.out.println(r[i]);
		}
	}
	
	public static int[] sortArray(int [] a)
	{
		for(int j=0;j<a.length;j++)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		return a;
		
	}
}
