package com.bridgelabz.basiccorejavaprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int numberToCheck;
		System.out.println("Enter number to check");
		Scanner sc = new Scanner(System.in);
		numberToCheck = sc.nextInt();
		if(numberToCheck % 2 == 0)
			System.out.println("Number is EVEN");
		else
			System.out.println("Number is ODD");

	}

}
