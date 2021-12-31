package com.problem;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner sc = new Scanner(System.in); // System.in is a standard input
												// stream.
		int a = sc.nextInt();
		int b = sc.nextInt();
		Parent obj;
		Parent.endElement = b;
		Parent.startElement = a;
		obj = new ChildOne();
		String prime = obj.filter();
		System.out.println(prime);
		obj = new ChildTwo();
		String happy = obj.filter();
		System.out.println(happy);
	}
}

class Parent {
	public static int startElement;
	public static int endElement;

	String filter() {
		return null;
	}
}

class ChildOne extends Parent {
	String filter() {
		String result = "";
		for (int i = startElement; i <= endElement; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				result += Integer.toString(i) + " ";
			}
		}
		return result;
	}
}

class ChildTwo extends Parent {
	String filter() {
		String evalValue = "";
		for (int i = startElement; i <= endElement; i++) {
			int result = i;
			while (result != 1 && result != 4) {
				result = calculate(result);
			}
			if (result == 1) {
				evalValue += Integer.toString(i) + " ";
			}
		}
		return evalValue;
	}

	int calculate(int value) {
		int sum = 0;
		while (value > 0) {
			int remainder = value % 10;
			sum += remainder * remainder;
			value = value / 10;
		}
		return sum;
	}
}