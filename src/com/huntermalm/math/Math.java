package com.huntermalm.math;

public class Math {
	
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
	
}
