package Practice;

public class Program8 {
	public static void main(String[] args) {
		int base=2;
		int exp=3;
		int pow=1;
		while(exp>0)
		{
			pow=base*pow;
			exp--;
		}
		System.out.println(pow);
	}

}
