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
	
}
