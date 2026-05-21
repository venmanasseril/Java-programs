package encapsulationexamples;

public class BankAccount {
	
	//Private variables (data hiding)
	private String accountHolder;
	private double balance;
	
	//Setter method 
	public void setAccountHolder(String name) {
		accountHolder = name;
	}
	//Setter method
	public void setBalance(double amount) {
		if(amount>0) {
			balance = amount;
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	
	//getter methods
	public String getAccountHolder() {
		return accountHolder;// string type
	}
	//getter method
	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount bankaccount =  new BankAccount();
		bankaccount.setAccountHolder("Anand VL");// call 
		bankaccount.setBalance(10000);
		System.out.println(bankaccount.getAccountHolder());
		System.out.println(bankaccount.getBalance());
	}

}
