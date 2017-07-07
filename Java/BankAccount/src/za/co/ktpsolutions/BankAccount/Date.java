package za.co.ktpsolutions.BankAccount;

import java.util.Calendar;

public class Date {

	//Private Data Members
	private int day;
	private int month;
	private int year;
	
	public Date(){
		/*
		 * This is a default constructor for the Date class.
		 * By default the Date is set to the date that the object
		 * was created.
		 */
		day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		month = Calendar.getInstance().get(Calendar.MONTH);
		year = Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public Date(int day, int month, int year){
		this.SetYear(year);
		this.SetMonth(month);
		this.SetDay(day);
	}
	
	public void SetDay(int day){
		try{
			if(isLeapYear(this.year) && this.month == 2){
				//Year set is a leap year
				
				if(day > 29 || day < 1){
					throw new Exception();
				}else{
					this.day = day;
				}
				
			}else if (month == 2){
				//Year set is not leap
				
				if(day > 28 || day < 1){
					throw new Exception();
				}else{
					this.day = day;
				}
			}else{
				if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
					if(day < 1 || day > 31){
						throw new Exception();
					}else{
						this.day = day;
					}
				}else{
					if(day < 1 || day > 30){
						throw new Exception();
					}else{
						this.day = day;
					}
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Invalid day used in Date object");
		}
	}
	
	public void SetMonth(int month){
		try{
			if(month < 1 || month > 12){
				throw new Exception();
			}else{
				this.month = month; 
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Invalid month used in Date object");
		}
	}
	
	public void SetYear(int year){
		try{
			if(year < 1800 || year > 2055){
				throw new Exception();
			}else{
				this.year = year;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Invalid year used in Date object: Date cannot exceed or preceed 2055 or 1800 repectivly");
		}
	}
	
	public int GetDay(){
		return this.day;
	}
	
	public int GetMonth(){
		return this.month;
	}
	
	public int GetYear(){
		return this.year;
	}
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	private static boolean isLeapYear(int year){
		//This method checks whether the year is leap or not.
		
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}else{
			return false;
		}
	}
}
