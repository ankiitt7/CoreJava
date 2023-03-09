package Test;

public class Program4 {       
	static int digSum(int num)  
	{    
	int sum = 0;  
	  
	while (num > 0 || sum > 9 )  
	{  
	if (num == 0)   
	{  
	num = sum;  
	sum = 0;  
	}  
	sum = sum + num % 10;  
	
	num = num / 10;  
	}   
	return sum;  
	}  
	
	
	public static void main(String args[])  
	{  
	int num = 9875;  
	System.out.println("The super digit is: "+digSum(num));  
	}  
	}  

