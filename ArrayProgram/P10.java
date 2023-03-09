package ArrayProgram;

public class P10 {
public static void main(String[] args) {
	
	//insert the value in the index no 2
	
	int [] a= {10,30,24,54,98};
	
	int [] temp= new int[a.length+1];
	
	for(int i=0;i<temp.length;i++)
	{
		if(i<2)
			temp[i]=a[i];
		else if(i==2)
			temp[i]=70;
		else
			temp[i]=a[i-1];
	}
	for(int i=0;i<temp.length;i++)
	{
		System.out.println(temp[i]);
	}
}
}
