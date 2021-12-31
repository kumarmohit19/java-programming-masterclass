package com.advancejava;

import java.util.*;
import java.util.ArrayList;

public class StudentList<E> {
	ArrayList list1;
	List<E> list = new ArrayList<E>();

	public void addElement(E element) {
		list.add(element);
	}

	public void removeElement(int index) {
		list.remove(index);
	}

	public E getElement(int index) {
		return list.get(index);
	}

	public String beginsWith(String sample) {
		String result = "";
		return result;
	}

	public String bloodGroupOf(String[] sampleList, String sample) {
		int index = 0;
		String result = "";
		for (String blood : sampleList) {
			if (blood.equals(sample)) {
				result += getElement(index) + "\n";
			}
			index++;
		}
		return result;
	}

	public int thresholdScore(int score) {
		// System.out.println(score);
		int result = 0;
		int index = 0;
		while (index < list.size()) {
			int iscore = Integer.parseInt(getElement(index).toString());
			// System.out.println(iscore);
			if (iscore >= score) {
				result++;
			}
			index++;
		}
		return result;
	}

}
