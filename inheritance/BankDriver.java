package inheritance;

public class BankDriver {
	public static void main(String[] args) {
		Bank b1=new Bank("ICICI","ICIC00023");
		b1.displayBank();
		System.out.println("==========================================");
		SavingsAccount s1= new SavingsAccount("HDFC","HDFC0034","MOHAN",11000007,2353465.67);
		s1.displaySavingsAccount();
		System.out.println("=============================================");
		Loan l1=new Loan("CITI","CITI0034","SOHAN",9900007,235567765.67,11000011,32534667.45);
		l1.displayLoan();
	}

}
