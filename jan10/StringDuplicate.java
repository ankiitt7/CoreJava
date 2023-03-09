package jan10;

public class StringDuplicate {
public static void main(String[] args) {
	
	String a="aannkkiitt";
	int length=a.length();
	char [] ch=a.toCharArray();
	
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<length;j++)
		{
			if(ch[i]==ch[j])
			{
				ch[i]='@';
			}
		}
	}
	
	for(int i=0;i<length;i++)
	{
		if(ch[i]!='@')
		{
			System.out.print(ch[i]);
		}
	}
	
}
}
