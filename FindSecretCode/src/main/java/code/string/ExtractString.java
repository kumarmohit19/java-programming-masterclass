package code.string;

public class ExtractString {
	public String add(int value) {
		return null;
	}

	public int extract(String input) {
		int output = 0;
		if (input.equalsIgnoreCase(" one ")) {
			output = 1;
		} else if (input.equalsIgnoreCase("two")) {
			output = 2;
		} else if (input.equalsIgnoreCase("three")) {
			output = 3;
		} else if (input.equalsIgnoreCase("four")) {
			output = 4;
		} else if (input.equalsIgnoreCase("five")) {
			output = 5;
		} else if (input.equalsIgnoreCase("six")) {
			output = 6;
		} else if (input.equalsIgnoreCase("seven")) {
			output = 7;
		} else if (input.equalsIgnoreCase("eight")) {
			output = 8;
		} else if (input.equalsIgnoreCase("nine")) {
			output = 9;
		} else if (input.equalsIgnoreCase("zero")) {
			output = 0;
		}
		// System.out.println(output);
		return output;
	}

}
