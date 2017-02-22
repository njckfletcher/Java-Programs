package com.huntermalm.javatools;

public class Arrays {
	
	public static void displayIntArray(int[] intArray) {
		
		for(int i=1; i < intArray.length + 1; i++) {
			System.out.print("|" + intArray[i - 1]);
			
			if(i % 10 == 0) {
				System.out.print("|");
				System.out.println();
			}
			else if(i == intArray.length) {
				System.out.print("|");
				System.out.println();
			}
			
		}
		
	}
	
	public static int sumIntArray(int[] intArray) {
		
		int sum = 0;
		
		for(int i=0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		
		return sum;
	}
	
}
