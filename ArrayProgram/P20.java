package ArrayProgram;

public class P20 {
//missing element
	
	public static void main(String[] args) {
		int [] a= {10,12,15,19};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.println(j);
			}
		}
	}
}
