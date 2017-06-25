package za.co.ktpsolutions.PerfectNumber;

import java.util.ArrayList;

/*
 * A positive integer is called a perfect number if it is equal to the
 * sum of all positive divisors, including 1 but excluding itself. This
 * program displays all the perfect numbers between the range of 1 and
 * 10000.
 * 
 * Author: Kaylen Travis Pillay
 */

public class PerfectNumbers {

	public static ArrayList<Integer> getDivisors(int Number){
		
		/*
		 * getDivisors() takes in an integer and returns an 
		 * ArrayList that contains all of the divisors of the
		 * inputed integer, excluding the number itself.
		 */
		
		ArrayList<Integer> divisorArray = new ArrayList<Integer>();
		
		for( int i = 1; i < Number - 1; i++){
			
			if(Number % i == 0){
				divisorArray.add(i);
			}
		}
		
		return divisorArray;
	}
	
	public static boolean isPerfectNumber(int Number){
		
		/*
		 * isPerfectNumber() takes in an integer and returns a
		 * true if the integer is a perfect number and false if
		 * the inputed number is not a perfect number.
		 */
		
		ArrayList<Integer> divisorArray = getDivisors(Number);
		int sumOfDivisors = 0;
		
		for( int i = 0; i < divisorArray.size(); i++){
			
			sumOfDivisors += divisorArray.get(i);
		}
		
		if(sumOfDivisors == Number){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args){
		
		/*
		 * This is the entry point for the program. The program
		 * was designed to meet the requirements of a question that
		 * asks for all perfect numbers between 1 and 10000, however
		 * changing the upperBound variable will allow you to adjust 
		 * the range.
		 */
		
		int upperBound = 10000;
		
		for( int i = 1; i <= upperBound; i++){
			
			if(isPerfectNumber(i)){
				System.out.print(i + " = ");
				ArrayList<Integer> displayDivisors = getDivisors(i);
				
				for( int j = 0; j < displayDivisors.size(); j++){
					
					if(j == displayDivisors.size() - 1){
						System.out.print(displayDivisors.get(j));
					}
					else{
						System.out.print(displayDivisors.get(j) + " + ");
					}
				}
				
				System.out.println(" is a perfect number.");
			}
		}
	}
}
