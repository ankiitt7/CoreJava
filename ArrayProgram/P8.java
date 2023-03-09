package ArrayProgram;

public class P8 {

	public static void main(String[] args) {
		
		int [] a= {10,50,60,3,5};
		
		int great=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(great<a[i])
			{
				great=a[i];
			}
		}
		System.out.println(great);
	}
}
