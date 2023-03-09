package ArrayProgram;

public class P9 {
public static void main(String[] args) {
	
	//reverse an array
	
	int [] a= {20,30,40,50,12,13};
	
	int [] temp= new int[a.length];
	
	for(int i=0;i<a.length;i++)
	{
		temp[i]=a[a.length-1-i];
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(temp[i]+" ");
	}
	
}
}
