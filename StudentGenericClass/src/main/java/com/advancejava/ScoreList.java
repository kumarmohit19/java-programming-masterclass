package com.advancejava;

import java.util.*;
import java.util.ArrayList;

public class ScoreList<E> {
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

	public double averageValues() {
		double avg = 0.0;
		double sum = 0.0;
		int index = 0;
		while (index < list.size()) {
			double marks = Double.parseDouble(getElement(index).toString());
			// System.out.println(marks);
			sum += marks;
			index++;
		}
		avg = sum / list.size();
		return avg;
	}
}
