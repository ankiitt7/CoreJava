package ArrayProgram;

public class P19 {
//remove duplicate
	public static void main(String[] args) {
		int [] a= {10,20,30,10,20,10,80,90,455,20};
		int [] temp=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					temp[j]=-1;
				}
			}
			
			if(temp[i]!=-1 && count==1)
			{
				System.out.println(a[i]);
			}
		}
	}
}
