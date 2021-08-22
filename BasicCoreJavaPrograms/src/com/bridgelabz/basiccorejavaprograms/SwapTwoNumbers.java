package com.bridgelabz.basiccorejavaprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int numberOne,numberTwo,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		numberOne = sc.nextInt();
		numberTwo = sc.nextInt();
		System.out.println("Before swapping: "+numberOne+" "+numberTwo);
		temp = numberOne;
		numberOne = numberTwo;
		numberTwo = temp;
		System.out.println("After swapping: "+numberOne+" "+numberTwo);

	}

}
