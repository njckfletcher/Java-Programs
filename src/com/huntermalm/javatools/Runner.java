package com.huntermalm.javatools;

import com.huntermalm.math.Calculate;

public class Runner {
	public static void main(String[] args) {
		
		System.out.println("5 + 2 = " + Calculate.add(5, 2));
		
		System.out.println();
		
		System.out.println("The binary '1000' in decimal = " + Calculate.binToDec("1000"));
		
		System.out.println();
		
		System.out.println("The decimal value '316' in binary = " + Calculate.decToBin(316));
		
		System.out.println();
		
		System.out.println("Is '12' odd? " + Calculate.isParity(12, "odd"));
		
		System.out.println();
		
		System.out.println("Is '29' a prime number? " + Calculate.isPrime(29));
		
		System.out.println();
		
		System.out.println("The log of '12' with base 2 = " + Calculate.logB(2, 12));

		System.out.println();
		
		int[] numbers = {2, 13, 52, 29};
		System.out.println("The largest number between 2, 13, 52, and 29 = " + Calculate.max(numbers));
		
		System.out.println();
		
		System.out.println("The 4th root of 81 = " + Calculate.root(81, 4));
		
		System.out.println();
		
		System.out.println("The sum of 2, 13, 52, and 29 = " + Calculate.sum(numbers));
		
		System.out.println();
		
		System.out.println("The sum of the even numbers of 2, 13, 52, 29 = " + Calculate.sum(numbers, "even"));
		
		System.out.println();
		
		System.out.println("The multiples of 7 between 42-89 are:");
		Arrays.displayIntArray((Calculate.multiplesOf(7, 42, 89)));
		
		System.out.println();
		
		System.out.println("The sum of the multiples of 3 and 5 = " + Calculate.sumMultiples(3, 5, 1, 15));
		
		System.out.println();
		
		System.out.println("The common multiples of 3 and 5 between 1-100 are:");
		Arrays.displayIntArray((Calculate.commonMultiples(3, 5, 1, 100)));
		
		System.out.println();
		
		System.out.println("The factors of 35 are:");
		Arrays.displayIntArray(Calculate.factors(35));
		
		System.out.println();
		
		System.out.println("The first 13 numbers in the fibonacci sequences are:");
		Arrays.displayIntArray(Calculate.fibSeqRange(13));
		
		System.out.println();
		
		System.out.println("The numbers in the fibonacci sequence up to 50000 are:");
		Arrays.displayIntArray(Calculate.fibSeqUpTo(50000));
		
		System.out.println();
		
		System.out.println("The prime numbers out of 2, 13, 52, and 29 are:");
		Arrays.displayIntArray(Calculate.primes(numbers));
		
	}
}
