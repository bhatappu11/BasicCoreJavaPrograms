package com.bridgelabz.basiccorejavaprograms;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int numberOne = 10, numberTwo = 98, numberThree = 78;
		if(numberOne >= numberTwo && numberOne >= numberThree)
				System.out.println("number "+numberOne+" is largest");
		else if(numberTwo >= numberOne && numberTwo >= numberThree)
				System.out.println("number "+numberTwo+" is largest");
		else
			System.out.println("number "+numberThree+" is largest");
		

	}

}
