package com.bridgelabz.basiccorejavaprograms;

import java.util.Scanner;

public class Factorisation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int number = sc.nextInt();
		for(int i = 2; i*i<= number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	}

}
