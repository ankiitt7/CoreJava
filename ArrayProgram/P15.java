package ArrayProgram;

public class P15 {
//char in sequence
	public static void main(String[] args) {
		char [] a= {'x','r','t','j'};
		
		for(int j=0;j<a.length;j++)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					char temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
