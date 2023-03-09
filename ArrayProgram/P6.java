package ArrayProgram;

public class P6 {
	public static void main(String[] args) {
		int [] a= {10,20,30,40};
		int count=0;
		
		for(int x: a)
		{
			count++;
			System.out.println(x);
		}
		System.out.println(count);
	}
}
