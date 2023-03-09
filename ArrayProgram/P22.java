package ArrayProgram;

public class P22 {
public static void main(String[] args) {
	
	//LCM
	int [] a= {4,8,2,11};
	int j;
	for(j=1;;j++)
	{
		if(j%a[0]==0 && j%a[1]==0 && j%a[2]==0 && j%a[3]==0)
		{
			break;
		}
	}
	System.out.println("LCM is:"+j);
}
}
