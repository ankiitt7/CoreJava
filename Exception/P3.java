package Exception;

public class P3 {
	public static void main(String[] args) {
		try
		{
			checkEligiblity(15);
		}
		catch(Exception e)
		{
			System.out.println("You are underAge");
			System.out.println(e);
			System.out.println("==============");
			
			e.printStackTrace();
		}
	}
	public static void checkEligiblity(int age)
	{
		if(age>=18)
		{
			System.out.println("You ar eligible to vote");
		}
		else
		{
			throw new ArithmeticException();
		}
	}
}
