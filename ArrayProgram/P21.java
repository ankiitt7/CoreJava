package ArrayProgram;

public class P21 {
public static void main(String[] args) {
	
	//prime from the array
	
	int [] a= {3,6,7,9,5,11};
	
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		int j=2;
		while(j<=a[i]/2)
		{
			if(a[i]%j==0)
			{
				count++;
			}
			j++;
		}
		
		if(count==0)
		{
			System.out.println(a[i]);
		}
	}
}
}

