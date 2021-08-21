package com.bridgelabz.basiccorejavaprograms;

public class PowerOfTwo {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int twoPowerN = 1;
		if(N>=0 && N<31) {
			for (int power = 1; power <= N; power++) {
				twoPowerN =  twoPowerN * 2;
				System.out.println("2^"+power+" = "+twoPowerN);
			}

		}
		else
			System.err.println("Given value of N is beyond limit");
	}

}
