package String;

public class P6 {
public static void main(String[] args) {
	String s="My Name is ankit";
	
	char ch[]=s.toCharArray();
	
	String out="";
	
	for(int i=0;i<ch.length;i++)
	{
		String temp="";
		
		while(i<ch.length&&ch[i]!=' ')
		{
			temp=ch[i]+temp;
			i++;
		}
		out=out+temp+" ";
	}
	System.out.println(out);
}
}
