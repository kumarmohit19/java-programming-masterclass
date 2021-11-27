package com.advancejava;

import java.util.*;
import java.util.stream.Collectors;
import static java.lang.Math.*;  

public class LambdaFn {

	public List<Long> functionalProgramming(List<String> listOfIntegers) {
		// stream()
		// filter()
		// map()
		List<Long> outputList = listOfIntegers.stream().map(Long::parseLong).filter(LambdaFn::isNarcissistic)
				.collect(Collectors.toList());

		return outputList;
	}

	// Returns true if n is a Narcissistic number, else false
	static boolean isNarcissistic(long number) {
		//count the number of digits
		int power= countDigits(number);
		
		//assigning the value of n in the variable n  
		long n = number;  
		
		//stores the sum   
		long sum= 0;
		
		while(n > 0){
			long lastDigit= n % 10;
			sum += (long) pow(lastDigit, power);
			n= n/10;
		}
		//System.out.println(sum+" "+number+" "+(sum==number));
		return sum==number;
		
	}
	
	// function counts the number of digits
	static int countDigits(long number) {
		if (number == 0)
			return 0;
		return 1 + countDigits(number / 10);
	} 
}