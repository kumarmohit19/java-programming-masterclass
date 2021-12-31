package com.problem;

import java.io.*;
import java.math.*;
import java.util.*;

class Result {

	/*
	 * Complete the 'calculateGrade' function below.
	 *
	 * The function is expected to return a STRING_ARRAY. The function accepts
	 * 2D_INTEGER_ARRAY students_marks as parameter.
	 */

	public static String[] calculateGrade(int[][] students_marks) {
		String[] grades = new String[students_marks.length];
		int subjects = students_marks[0].length;
		for (int i = 0; i < grades.length; i++) {
			int score = 0;
			for (int j = 0; j < subjects; j++) {
				score += students_marks[i][j];
			}
			grades[i] = calculator(score / subjects);
		}

		return grades;
	}

	static String calculator(int score) {
		String grade = "";
		if (score >= 90) {
			grade = "A+";
		} else if (score >= 80 && score < 90) {
			grade = "A";
		} else if (score >= 70 && score < 80) {
			grade = "B";
		} else if (score >= 60 && score < 70) {
			grade = "C";
		} else if (score >= 50 && score < 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int students_marksRows = Integer.parseInt(sc.next().trim());
		int students_marksColumns = Integer.parseInt(sc.next().trim());

		int[][] students_marks = new int[students_marksRows][students_marksColumns];
		for (int i = 0; i < students_marksRows; i++) {
			for (int j = 0; j < students_marksColumns; j++) {
				students_marks[i][j] = Integer.parseInt(sc.next().trim());
			}
		}

		String[] result = Result.calculateGrade(students_marks);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			bufferedWriter.write(result[i] + "\n");
		}
		sc.close();
		bufferedWriter.close();
	}
}
