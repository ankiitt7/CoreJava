package ArrayProgram;

public class P12 {
public static void main(String[] args) {
	//delete the array element from index no 2
	
	int [] a= {10,30,24,54,98};
	
	int [] temp= new int[a.length-1];
	
	for(int i=0;i<temp.length;i++)
	{
		if(i<2)
			temp[i]=a[i];
		else
			temp[i]=a[i+1];
	}
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}
}

