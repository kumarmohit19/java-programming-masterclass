package com.advancejava;

public class StudentClass {

	public String getQuery(String studentData, String query) {
		String result = "";
		// int count=0;

		String queryNum = query.substring(0, 1);
		if (queryNum.equals("1")) {
			String check = query.substring(2, query.length());
			for (String name : studentData.split(" ")) {
				if (name.substring(0, 1).equalsIgnoreCase(check)) {
					result += name + "\n";
				}
			}
		}
		if (queryNum.equals("2")) {
			StudentList<String> studlist = new StudentList<String>();
			for (String name : studentData.split(" ")) {
				studlist.addElement(name);
			}
			String[] list = query.split(",");
			String[] samplelist = list[1].split(" ");
			result = studlist.bloodGroupOf(samplelist, list[2]);
		}
		if (queryNum.equals("3")) {
			StudentList<Integer> studlist = new StudentList<Integer>();
			for (String score : studentData.split(" ")) {
				studlist.addElement(Integer.parseInt(score));
			}
			int count = studlist.thresholdScore(Integer.parseInt(query.substring(2, query.length())));
			result = count + " students scored " + Integer.parseInt(query.substring(2, query.length())) + " above";
		}
		if (queryNum.equals("4") || queryNum.equals("5")) {
			ScoreList<Double> scorelist = new ScoreList<Double>();
			for (String score : studentData.split(" ")) {
				scorelist.addElement(Double.parseDouble(score));
			}
			result = String.format("%.2f", scorelist.averageValues());
		}
		return result;
	}

}
