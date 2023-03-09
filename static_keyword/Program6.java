package static_keyword;

public class Program6 {
	static int i=12;
	static int j;
	public static void main(String[] args) {
		System.out.println("Main method "+i+" "+j);
		test();
		System.out.println(i+" "+j);
	}
	public static void test()
	{
      System.out.println("This is test method "+i+" "+j);
      i=38;
      int j=45;
      System.out.println(i+" "+j);
	}

}
