package polymorphism;

public class Compiletime {
public static void main(String[] args) {
	test(10,20);
	test(30,40,50);
}
public static void test(int x,int y)
{
	System.out.println(x+y);
}
public static void test(int x,int y,int z)
{
	System.out.println(x+y+z);
}
}
