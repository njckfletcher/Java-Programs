package com.huntermalm.math;

import java.lang.Math;

public class Calculate {
	
	public static int[] multiplesOf(int num, int start, int end) {
		
		int count = 0;
		
		for(int i=start; i <= end; i++) {
			if(i % num == 0) {
			count++;	
			}
		}
		
		int[] multiples= new int[count];
		count = 0;
		
		for(int i=start; i <= end; i++) {
			if(i % num == 0) {
			multiples[count] = i;
			count++;
			}
		}
		
		return multiples;
		
	}
	
	public static int sumMultiples(int num1, int num2, int start, int end) {
		
		int sum = 0;
		
		for(int i=start; i <= end; i++) {
			if(i % num1 == 0 || i % num2 == 0) {
				sum += i;
			}
		}
		
		return sum;
		
	}
	
	public static int[] commonMultiples(int num1, int num2, int start, int end) {
		
		int count = 0;
		
		for(int i=start; i <= end; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				count++;
			}
		}
		
		int[] multiples = new int[count];
		count = 0;
		
		for(int i=start; i <= end; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				multiples[count] = i;
				count++;
			}
		}
		
		return multiples;
		
	}
	
	public static int add(int num1, int num2) {
		
		return num1 + num2;
		
	}
	
	public static int[] fibSeqRange(int range) {
		
		int previousNum = 0;
		int num = 1;
		
		int[] sequence = new int[range];
		
		for(int i=0; i < range; i++) {
			int st_num = num;
			//int st_pnum = previousNum;
			sequence[i] = num;
			if(num != 1) {
				num += previousNum;
				previousNum = st_num;
			}
			else {
				previousNum = num;
				num += previousNum;
			}
		}
		
		return sequence;
		
	}
	
	public static int[] fibSeqUpTo(int max) {
		
		int previousNum = 0;
		//int num = 1;
		int count = 0;
		
		for(int i=1; i <= max;) {
			int st_num = i;
			if(i != 1) {
				i += previousNum;
				previousNum = st_num;
			}
			else {
				previousNum = i;
				i += previousNum;
			}
			count++;
		}
		
		int[] sequence = new int[count];
		count = 0;
		
		for(int i=1; i <= max;) {
			int st_num = i;
			sequence[count] = i;
			if(i != 1) {
				i += previousNum;
				previousNum = st_num;
			}
			else {
				previousNum = i;
				i += previousNum;
			}
			count++;
		}
		
		return sequence;
		
	}
	
	public static int sum(int[] intArray) {
		
		int sum = 0;
		
		for(int i=0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		
		return sum;
	}
	
	public static int sum(int[] intArray, String parity) {
		
		int sum = 0;
		
		if(parity == "even") {
			for(int i=0; i < intArray.length; i++) {
				if(intArray[i] % 2 == 0) {
					sum += intArray[i];
				}
			}
		}
		else if(parity == "odd") {
			for(int i=0; i < intArray.length; i++) {
				if(intArray[i] % 2 != 0) {
					sum += intArray[i];
				}
			}
		}
		
		
		return sum;
		
	}
	
	public static int[] factors(int num) {
		
		int count = 0;
		
		for(int i=1; i <= num / 2; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		int[] factors = new int[count + 1];
		count = 0;
		
		for(int i=1; i <= num / 2; i++) {
			if(num % i == 0) {
				factors[count] = i;
				count++;
			}
		}
		
		// Attach original num to factors because it IS a factor (1 * num = num)
		factors[count] = num;
		
		return factors;
		
	}
	
	public static int[] primes(int[] intArray) {
		
		int count = 0;
		
		for(int i=0; i < intArray.length; i++) {
			if(isPrime(intArray[i])) {
				count++;
			}
		}
		
		int[] primes = new int[count];
		count = 0;
		
		for(int i=0; i < intArray.length; i++) {
			if(isPrime(intArray[i])) {
				primes[count] = intArray[i];
				count++;
			}
		}
		
		return primes;
		
	}
	
	public static boolean isPrime(int num) {
		
		// check if num is 1
		if(num == 1) return false;
		
	    // check if num is a multiple of 2
	    if(num % 2 == 0) return false;
	    
	    // if not, then just check the odds
	    for(int i=3; i * i <= num; i += 2) {
	        if(num % i == 0) return false;
	    }
	    
	    return true;
	    
	}
	
	public static int max(int[] intArray) {
		
		int max = 0;
		
		for(int i=0; i < intArray.length; i++) {
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		
		return max;
		
	}
	
	public static boolean isParity(int num, String parity) {
		
		if(parity == "even") {
			if(num % 2 == 0) {
				return true;
			}
		}
		else if(parity == "odd") {
			if(num % 2 != 0) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public static int binToDec(String bin) {
		
		int dec = 0;
		int count = 0;
		
		for(int j=bin.length()-1; j >= 0; j--) {
			if(bin.charAt(count) == '1') {
				dec += Math.pow(2, j);
			}
			count++;
		}
		
		return dec;
		
	}
	
	public static String decToBin(int dec) {
		
		return Integer.toBinaryString(dec);
		
	}
	
	public static double root(int num, int n) {
		
		return Math.pow(num, 1.0/n);
		
	}
	
	public static double logB(int base, int num) {
		
		return Math.log10(num)/Math.log10(base);
		
	}
	
}
