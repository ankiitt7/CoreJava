package inheritance;

public class Loan extends SavingsAccount{
	int loanNumber;
	double loanAmount;
	public Loan()
	{
		
	}
	Loan(String bName,String ifsc,String cusName,int accNumber,double balance,int loanNumber,double loanAmount)
	{
		super(bName,ifsc,cusName,accNumber,balance);
		this.loanNumber=loanNumber;
		this.loanAmount=loanAmount;
	}
	public void displayLoan()
	{
		super.displaySavingsAccount();
		System.out.println("Loan number is: "+loanNumber);
		System.out.println("Loan ammount is: "+loanAmount);
	}

}
