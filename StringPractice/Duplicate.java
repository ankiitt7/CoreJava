package StringPractice;

public class Duplicate {
public static void main(String[] args) {
	
	String str="aabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcc";
	char [] c=str.toCharArray();
	
	for(int i=0;i<c.length;i++)
	{
		for(int j=i+1;j<c.length;j++)
		{
			if(c[i]==c[j])
			{
				c[i]='@';
			}
		}
	}
	
	for(int i=0;i<c.length;i++)
	{
		if(c[i]!='@')
		{
			System.out.print(c[i]);
		}
	}
}
}
