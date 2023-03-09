package inheritance;

public class Bank {
		String bName;
		String ifsc;
		Bank()
		{
			
		}
		Bank(String bName,String ifsc)
		{
			this.bName=bName;
			this.ifsc=ifsc;
		}
		public void displayBank()
		{
			System.out.println("Bank name is: "+bName);
			System.out.println("Bank ifsc is: "+ifsc);
		}
}
