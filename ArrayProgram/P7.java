package ArrayProgram;

public class P7 {
public static void main(String[] args) {
	
	int [] a= {90,20,30,40};
	
	int small=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(small>a[i])
		{
			small=a[i];
		}
		
	}
	System.out.println(small);
}
}
