package PatternPracticee;

public class p2 {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			count++;
			System.out.print(count);
		}
		System.out.println();
	}
}
}
