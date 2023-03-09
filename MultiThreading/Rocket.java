package MultiThreading;

public class Rocket implements Runnable{
	public void run()
	{
		System.out.println("===============================");
		System.out.println("Run method is implemented");
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		System.out.println("Thread priority is: "+Thread.currentThread().getPriority());
		System.out.println("Current thread is terminated");
		
	}

}
