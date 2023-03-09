package jan29;

public class DuplicateString {
public static void main(String[] args) {
	String str="aaaaaaaaaaaaaaaaaaaabbbghcc";
	char [] c=str.toCharArray();
	int length=c.length;
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<length;j++)
		{
			if(c[i]==c[j])
			{
				c[i]='@';
			}
		}
	}
	for(int i=0;i<length;i++)
	{
		if(c[i]!='@')
		{
			System.out.print(c[i]);
		}
	}
}
}
