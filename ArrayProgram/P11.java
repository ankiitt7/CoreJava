package ArrayProgram;

public class P11 {
public static void main(String[] args) {
	//insert the value in the index no 2 and 3
	
		int [] a= {10,30,24,54,98};
		
		int [] temp= new int[a.length+2];
		
		for(int i=0;i<temp.length;i++)
		{
			if(i<2)
				temp[i]=a[i];
			else if(i==2)
				temp[i]=70;
			else if(i==3)
				temp[i]=63;
			else
				temp[i]=a[i-2];
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
}
}
