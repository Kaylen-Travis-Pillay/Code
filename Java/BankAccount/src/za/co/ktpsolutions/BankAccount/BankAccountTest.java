package za.co.ktpsolutions.BankAccount;

/**
 * 
 * @author Kaylen-Travis-Pillay
 *
 */
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount testAccount = new BankAccount(12345, 20000, 5.5);
		System.out.println("Initial account setup:");
		System.out.println("======================");
		System.out.println(testAccount);
		
		System.out.println("Withdrawal of R 2500:");
		System.out.println("=====================");
		if (testAccount.Withdraw(2500)) {
			System.out.println(testAccount);
		}else {
			System.out.println("Unable to withdraw amount, insufficient funds");
		}
		
		System.out.println("Deposit of R 3500:");
		System.out.println("==================");
		testAccount.Deposit(3500);
		System.out.println(testAccount);
		System.out.println("Monthly interest rate: " +testAccount.GetMonthlyInterestRate() + "%");
		
	}

}
