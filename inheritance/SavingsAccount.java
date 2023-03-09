package inheritance;

public class SavingsAccount extends Bank {
	String cusName;
	int accNumber;
	double balance;
	public SavingsAccount()
	{
		
	}
	SavingsAccount(String bName,String ifsc,String cusName,int accNumber,double balance)
	{
		super(bName,ifsc);
		this.cusName=cusName;
		this.accNumber=accNumber;
		this.balance=balance;
	}
	public void displaySavingsAccount()
	{
		super.displayBank();
		System.out.println("Custmer name is: "+cusName);
		System.out.println("Custmer account Number is: "+accNumber);
		System.out.println("Account balance is: "+balance);
	}

}
