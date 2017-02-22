package com.huntermalm.math.apps;

import com.huntermalm.javatools.Arrays;
import com.huntermalm.math.Math;

public class Runner {
	public static void main(String[] args) {
		
		//Arrays.displayIntArray(Math.fibSeqUpTo(5000));
		
		System.out.println(Math.sum(Math.fibSeqUpTo(4000000), "even"));
	
	}
}
