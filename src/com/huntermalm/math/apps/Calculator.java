package com.huntermalm.math.apps;

import java.util.Scanner;
import com.huntermalm.math.Math;
import com.huntermalm.javatools.Arrays;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("What would you like to do: ");
			String rawCommand = input.nextLine();
			
			parseCommand(rawCommand);
		}
		
	}
	
	public static void parseCommand(String rawCommand) {
		
		char[] rawChars = rawCommand.toCharArray();
		
		boolean calculated = false;
		
		while(!calculated) {
			boolean hasParentheses = checkForParentheses(rawChars);
			boolean hasOperator;
		}
		
		
		
	}
	
	public static boolean checkForParentheses(char[] rawChars) {
		
		boolean hasOpenPar = false;
		boolean hasClosePar = false;
		
		for(int i=0; i < rawChars.length; i++) {
			if(rawChars[i] == '(') {
				hasOpenPar = true;
			}
			else if(rawChars[i] == ')') {
				hasClosePar = true;
			}
		}
		
		if(hasOpenPar && hasClosePar) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean checkForOperator(char[] rawChars) {
		
		
		
	}
	
}
