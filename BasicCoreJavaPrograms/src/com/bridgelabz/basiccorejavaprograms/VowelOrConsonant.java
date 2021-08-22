package com.bridgelabz.basiccorejavaprograms;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char alphabetToCheck;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character to check");
		alphabetToCheck = sc.next().charAt(0);
		if(alphabetToCheck == 'a' || alphabetToCheck == 'e' || alphabetToCheck == 'i' || alphabetToCheck == 'o' || alphabetToCheck == 'u')
			System.out.println("Alphabet is a vowel");
		else
			System.out.println("Alphabet is a consonant");
	}

}
