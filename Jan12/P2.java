package Jan12;

public class P2 {
	
	static int fact=1;
public static void main(String[] args) {
	factorial(3);
}
	 public static void factorial(int n){
		 
	       if(n>0){
	        fact=fact*n;
	        factorial(n-1);
	       }else{
	        System.out.println(fact);
	       }
	       
	 }      
}
