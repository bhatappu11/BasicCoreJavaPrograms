package com.bridgelabz.basiccorejavaprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER N");
		int N = sc.nextInt();
		double nthHarmonic = 1;
		if(N!=0) {
			for (int i = 2; i <= N; i++) {
				System.out.println(i);
				nthHarmonic += (double)1 / i;
			}
			System.out.println("Nth harmonic value is "+nthHarmonic);
		}
		else
			System.err.println("N should be greater than zero");
	}

}
