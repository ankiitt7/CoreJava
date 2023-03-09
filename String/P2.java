package String;

public class P2 {
public static void main(String[] args) {
	
	//methods of String
	
	String s1="Mohan";  					//length
	System.out.println(s1.length());
	
	System.out.println(s1.charAt(0));		//index or char
	
	String s2="   Mohan is my son";			//convert string in char array
	char[] p=s2.toCharArray();
	for(char c:p)
	{
		System.out.print(c);
	}
	System.out.println();
	
	
	System.out.println(s2.trim());			//trim to remove space from start and end
	
	String s3=" ";
	System.out.println(s3.isEmpty());	//to check string is empty or not
	
	System.out.println(s3.isBlank()); 	//return true if length is zero
	
	String s4="mohan";
	System.out.println(s1.equals(s4)); //to compare the String content
	
	System.out.println(s1.equalsIgnoreCase(s4));	//compare content without considering case
	
	String s5=new String("Monday").intern();	//intern is used create one object when content is same
	String s6=new String("Monday").intern();
	
	System.out.println(s1.concat(s2));  //used to attach string with another
	
	System.out.println(s1.toUpperCase()); 		//used for UpperCase
	
	System.out.println(s1.toLowerCase());  		//used for LowerCase
	
	System.out.println(s1.compareTo(s4));	//difference between ASCII value of character
	
	System.out.println(s1.compareToIgnoreCase(s4)); 	//difference between letters without considering case sensitivity
	
	System.out.println(s2.indexOf('z',8)); //index of char in String after a certain index value and if not available then return -1
	
	System.out.println(s2.indexOf("son")); //index of particular String inside a String
	
	System.out.println(s2.indexOf("son", 17)); //index of particular String in String after a certain index value and if not available then return -1
	
	
}
}
