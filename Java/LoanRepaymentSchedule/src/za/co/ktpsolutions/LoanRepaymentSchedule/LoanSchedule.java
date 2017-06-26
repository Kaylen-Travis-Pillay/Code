package za.co.ktpsolutions.LoanRepaymentSchedule;

import java.util.Scanner;

/*
 * To repay a loan amount P with a series of equal monthly repayments R for
 * a period of n months at a monthly interest rate of i (expressed as a decimal),
 * the formula for calculating R (Repayments) is:
 * 
 * 		R = P*i / 1 - (1 + i)^-n
 * 
 * This program uses this formula, given user inputed loan amount, period and 
 * interest rates, to generate a repayments schedule for the loan.
 * 
 * Author: Kaylen Travis Pillay
 */

public class LoanSchedule {

	public static double calculateMonthlyPayments(double loanAmount, int loanPeriod, double interestRate){
		
		/*
		 * calculateMonthlyPayments uses the inputed loan amount,period and
		 * interest rate to calculate the monthly repayments by the user. NOTE
		 * that the formula used to calculate the monthly repayments are 
		 * described at the start of this file.
		 */
		
		double repayment = (loanAmount * interestRate)/(1 - Math.pow((1 + interestRate), -loanPeriod));
		
		repayment = roundOffMoney(repayment);
		
		return repayment;
	}
	
	public static double roundOffMoney(double amount){
		
		/*
		 * roundOffMoney rounds off the inputed amount to
		 * 2 decimal places. As money does not go past two
		 * decimal places
		 */
		
		amount *= 100;
		int temp = (int) (amount);
		amount = temp/100.0;
		
		return amount;
	}
	
	public static void generateRepaymentSchedule(String currency,double loanAmount,int loanPeriod, double interestRate){
		
		/*
		 * generateRepaymentSchedule uses the user inputed data and
		 * the help of calculateMonthlyPayments and roundOffMoney to 
		 * generate a user-friendly schedule for the loan every month.
		 */
		
		double monthlyRepayments = calculateMonthlyPayments(loanAmount,loanPeriod,interestRate);
		
		double balance = loanAmount;
		int monthsPast = 0;
		
		while(balance >= 1){
			
			monthsPast ++;
			
			System.out.println("Month :" + monthsPast);
			System.out.println("====================");
			System.out.println();
			
			System.out.println("Starting balance: " + currency + balance);
			
			double interest = roundOffMoney(interestRate * balance);
			System.out.println("Interest: " + currency + interest);
			
			double capitalRedemption = roundOffMoney(monthlyRepayments - interest);
			System.out.println("Capital Redemption: " + currency + capitalRedemption);
			
			balance = roundOffMoney(balance - capitalRedemption);
			System.out.println("Closing balance: " + currency + balance);
			System.out.println("====================");
			
			System.out.println("\n");
		}
		
		if( balance < 0 ){
			System.out.println("You have will recieve " + currency + balance + " back!");
		}
		else{
			System.out.println("You have a balance of " + currency + balance + " outstanding!");
		}
		
	}
	public static void main(String[] args){
		
		/*
		 * This is the entry point for the program. NOTE that by default
		 * the currency is set to ZAR. Changing the currency variable will
		 * result in a different currency being used. 
		 */
		
		Scanner inputStream = new Scanner(System.in);
		final String currency = "R";
		
		System.out.println("Loan Repayment Schedule Generator!\n");
		
		System.out.print("Enter loan amount: " + currency);
		double loanAmount = inputStream.nextDouble();
		
		System.out.print("Enter loan period: ");
		int loanPeriod = inputStream.nextInt();
		
		System.out.print("Enter interest rate: ");
		double interestRate = inputStream.nextDouble();
		System.out.println();
		
		generateRepaymentSchedule(currency, loanAmount, loanPeriod, interestRate);
		
		inputStream.close();
	}
}
