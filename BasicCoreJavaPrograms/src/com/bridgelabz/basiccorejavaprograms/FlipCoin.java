package com.bridgelabz.basiccorejavaprograms;

public class FlipCoin {

	public static void main(String[] args) {
		int numberOfFlips = 20;
		int headsCount = 0;
		for (int index = 0; index < numberOfFlips; index++) {
			if(numberOfFlips <=0)
				System.err.println("Number of flips should be positive number");
			else
				if(Math.random()>0.5)
					headsCount += 1;
		}
		int headsPercentage = (headsCount*100)/numberOfFlips;
		int tailsPercentage = 100 - headsPercentage;
		System.out.println("Heads percentage: "+headsPercentage);
		System.out.println("Tails percentage: "+tailsPercentage);

	}

}
