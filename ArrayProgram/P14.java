package ArrayProgram;

public class P14 {
//find highest and second highest
	
	public static void main(String[] args) {
		int [] a= {10,30,24,54,98};
		
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
		System.out.println("Highest element is: "+a[a.length-1]);
		System.out.println("Second highest element is: "+a[a.length-2]);
	}
}
