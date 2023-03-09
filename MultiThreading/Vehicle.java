package MultiThreading;

public class Vehicle extends Thread{
	public void run()
	{
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		System.out.println("Thread id is: "+Thread.currentThread().getId());
		System.out.println("Run method starts");
		System.out.println("Inside run method");
		System.out.println("HIIIIIIII");
		System.out.println("HELOOOOOOOO");
		System.out.println("Run method ends");
		System.out.println("==================");
	}
	

}
