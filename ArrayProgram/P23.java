package ArrayProgram;

public class P23 {
public static void main(String[] args) {
	
	int [] a= {4,8,2,11};
	
	int j;
	for(j=1;;j++)
	{
		for(int i=0;i<a.length;i++)
		{
			int temp=j%a[i];
		}
		System.out.println();
	}
	
}
}
