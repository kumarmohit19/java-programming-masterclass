package code.numbers;

import java.util.*;

public class NumberFinder {
	public boolean isKeith(int x) {
		// Store all digits of x in a vector "terms"
		// Also find number of digits and store in "n".
		ArrayList<Integer> terms = new ArrayList<Integer>();
		int temp = x, n = 0; // n is number of digits in x
		while (temp > 0) {
			terms.add(temp % 10);
			temp = temp / 10;
			n++;
		}

		// To get digits in right order (from MSB to
		// LSB)
		Collections.reverse(terms);

		// Keep finding next terms of a sequence generated
		// using digits of x until we either reach x or a
		// number greater than x
		int next_term = 0, i = n;
		while (next_term < x) {
			next_term = 0;

			// Next term is sum of previous n terms
			for (int j = 1; j <= n; j++)
				next_term += terms.get(i - j);

			terms.add(next_term);
			i++;
		}

		/*
		 * When the control comes out of the while loop, either the next_term is
		 * equal to the number or greater than it. If next_term is equal to x,
		 * then x is a Keith number, else not
		 */
		// if(x==7){
		// return false;
		// }

		return (next_term == x);

	}

}