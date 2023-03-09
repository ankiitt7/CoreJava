package static_keyword;

public class Program7 {
	static int i=8;
	static int j=test();
	public static void main(String[] args) {
		System.out.println("Main method "+i+" "+j);
		int p=test();
		System.out.println(i+" "+j+" "+p);
	}
	public static int test()
	{
      System.out.println("This is test method "+i+" "+j);
      i=12;
      int j=16;
      System.out.println(i+" "+j);
      return i+2*j;
	}

}
