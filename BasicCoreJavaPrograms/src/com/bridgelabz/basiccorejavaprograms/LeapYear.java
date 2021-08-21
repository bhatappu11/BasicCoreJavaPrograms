package com.bridgelabz.basiccorejavaprograms;

public class LeapYear {

	public static void main(String[] args) {
		int yearToCheck = 2002;
		boolean isLeapYear = false;
		if(Integer.toString(yearToCheck).length()==4) {	
			if((yearToCheck % 400 == 0) || (yearToCheck % 4 == 0 && yearToCheck % 100 !=0))
					isLeapYear = true;
			else
					isLeapYear = false;
		}
		else
			System.err.println("Year must be 4 digit number");
		
		System.out.println(yearToCheck+" is leap year? "+ isLeapYear); 
	}

}
