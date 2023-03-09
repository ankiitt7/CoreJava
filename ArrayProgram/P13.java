package ArrayProgram;

public class P13 {
public static void main(String[] args) {
	
	//print the array in ascending order
	int [] a= {10,30,24,54,98};
	
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]>a[i+1])
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}

	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}

}
