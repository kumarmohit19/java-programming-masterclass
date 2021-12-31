package com.adjancejava;

public class SelfFinance {

	public String result(String allMarks) {
		double CGPA = 0.00;
		String[] sections = allMarks.split("\\|");
		String[] subjects = sections[0].split(",");
		int subCount = subjects.length;
		String[] Sports = sections[1].split(",");
		// String[] Sports = sections[2].split(",");

		double netScore = 0.00;
		for (String temp : subjects) {
			String[] t = temp.split(" ");
			netScore += grade(Double.parseDouble(t[0])) * Double.parseDouble(t[1]);
		}
		// if(NCC[0].equalsIgnoreCase("1")){
		// netScore += grade(Integer.parseInt(NCC[1]))*Integer.parseInt(NCC[2]);
		// subCount++;
		// }
		if (Sports[0].equalsIgnoreCase("1")) {
			netScore += grade(Double.parseDouble(Sports[1])) * Double.parseDouble(Sports[2]);
			subCount++;
		}
		double credPointMax = subCount * 5.00;
		CGPA = netScore / credPointMax;
		// if(CGPA==10.0){return String.format("%.4f%n", CGPA);}
		return String.format("%.2f", CGPA);

	}

	double grade(double score) {
		double grade = 0.00;
		if (score <= 100 && score >= 75) {
			grade = 9.00 + ((score - 75.00) / 25.00);
		} else if (score <= 74 && score >= 60) {
			grade = 8.00 + ((score - 60.00) / 15.00);
		} else if (score <= 59 && score >= 50) {
			grade = 7.00 + ((score - 50.00) / 10.00);
		} else if (score <= 49 && score >= 40) {
			grade = 6.00 + ((score - 40.00) / 10.00);
		} else {
			grade = 0.00;
		}
		// System.out.println(score+ " " +grade);
		String res = String.format("%.1f", grade);
		return Double.parseDouble(res);
	}
}
