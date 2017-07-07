package za.co.ktpsolutions.BankAccount;

public class BankAccount {
	
	//Private data members
	private int accountNumber;
	private double accountBalance;
	private double annualInterestRate;
	private Date accountCreationDate;
	
	public BankAccount(){
		SetAccountNumber(0);
		SetAccountBalance(0);
		SetAnnualInterestRate(0);
		accountCreationDate = new Date();
	}
	
	public BankAccount(int accountNumber, double accountBalance, double annualInterestRate){
		SetAccountNumber(accountNumber);
		SetAccountBalance(accountBalance);
		SetAnnualInterestRate(annualInterestRate);
	}
	
	private void SetAccountNumber(int accountNumber){
		try{
			if(accountNumber < 0){
				throw new Exception();
			}else{
				this.accountNumber = accountNumber;
			}
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("Invalid account number in BankAccount object");
		}
	}
	
	private void SetAccountBalance(double accountBalance){
		try{
			if(accountBalance < 0){
				throw new Exception();
			}else{
				this.accountBalance = accountBalance;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Invalid account balance in BankAccount object");
		}
	}
	
	private void SetAnnualInterestRate(double annualInterestRate){
		try{
			if(annualInterestRate < 0){
				throw new Exception();
			}else{
				this.annualInterestRate = annualInterestRate;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Invalid interest rate used in BankAccount object");
		}
	}
	
	public int GetAccountNumber(){
		return this.accountNumber;
	}
	
	public double GetAccountBalance(){
		return this.accountBalance;
	}
	
	public double GetAnnualInterestRate(){
		return this.annualInterestRate;
	}
	
	public Date GetDateCreated(){
		return this.accountCreationDate;
	}
	
	public double GetMonthlyInterestRate(){
		return this.annualInterestRate / 12;
	}
	
	
	
	public String toString(){
		StringBuilder displayString = new StringBuilder();
		displayString.append("Account Number: " + this.accountNumber + "\n");
		displayString.append("Account Balance: R " + this.accountBalance + "\n");
		displayString.append("Annual Interest Rate: " + this.annualInterestRate + "%\n");
		displayString.append("Createion Date: " + this.accountCreationDate.toString() + "\n");
		
		return displayString.toString();
	}
}
