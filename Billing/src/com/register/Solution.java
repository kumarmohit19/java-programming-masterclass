package com.register;

import java.io.*;
import java.util.*;

class Register {

	private static Register register = null;

	/*
	 * Complete the 'getTotalBill' function below.
	 *
	 * The function is expected to return a STRING. The function accepts MAP
	 * itemDetails as parameter.
	 */
	public static Register getInstance() {
		if (register == null) {
			register = new Register();
		}
		return register;
	}

	public String getTotalBill(Map<String, Integer> itemDetails) {
		Double bill = 0.0;
		Map<String, Double> details = new HashMap<String, Double>();
		details.put("apple", 2.0);
		details.put("orange", 1.5);
		details.put("mango", 1.2);
		details.put("grape", 1.0);

		for (String item : itemDetails.keySet()) {
			for (String fruit : details.keySet()) {
				if (fruit.equalsIgnoreCase(item)) {
					bill += itemDetails.get(item) * details.get(fruit);
				}
			}
		}

		return Double.toString(bill);

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {

		Scanner readInput = new Scanner(System.in);
		String[] input = readInput.nextLine().split(" ");
		Map<String, Integer> myItems = new HashMap<String, Integer>();
		for (int i = 0; i < input.length; i += 2) {
			myItems.put(input[i], Integer.parseInt(input[i + 1]));
		}
		Register regObj = Register.getInstance();
		System.out.println(regObj.getTotalBill(myItems));
		readInput.close();

	}
}