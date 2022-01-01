package com.advancejava;

import java.util.*;
import java.lang.*;

public class Library {

	String bookName;
	String author;

	Library() {
	}

	public String getAuthor() {
		return author;
	}

	public String getBookName() {
		return bookName;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 83 * hash + Objects.hashCode(this.bookName);
		hash = 83 * hash + Objects.hashCode(this.author);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Library other = (Library) obj;
		if (!Objects.equals(this.bookName, other.bookName)) {
			return false;
		}
		if (!Objects.equals(this.author, other.author)) {
			return false;
		}
		return true;
	}

	Library(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public HashMap<Integer, Library> createLibraryMap(String booksInLibrary) {
		HashMap<Integer, Library> library = new HashMap<Integer, Library>();
		// String[] broken = booksInLibrary.split("|");
		for (String broken : booksInLibrary.split("\\|")) {
			// System.out.print(broken);
			String[] temp2 = broken.split(",");
			Library lib = new Library(temp2[1], temp2[2]);
			library.put(Integer.parseInt(temp2[0]), lib);
		}
		return library;
	}

	public HashMap<Integer, Integer> createUserMap(String borrowedUsers) {
		HashMap<Integer, Integer> userDetail = new HashMap<Integer, Integer>();
		// String[] broken = borrowedUsers.split("\\|");
		for (String broken : borrowedUsers.split("\\|")) {
			String[] temp = broken.split(",");
			userDetail.put(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
		}
		return userDetail;
	}

	public String getQuery(String booksInLibrary, String borrowedUsers, String query) {
		Library lib = new Library();
		HashMap<Integer, Library> library = lib.createLibraryMap(booksInLibrary);
		HashMap<Integer, Integer> userDetail = lib.createUserMap(borrowedUsers);
		String[] broken = query.split(",");
		if (Integer.parseInt(broken[0]) == 1) {
			Library lib1 = new Library();
			int countIn = 0, countOut = 0;
			boolean available = false;
			int user = 0;
			for (int temp : library.keySet()) {
				if (temp == Integer.parseInt(broken[1])) {
					countIn++;
					lib1 = library.get(temp);
				}
			}
			for (int temp : userDetail.keySet()) {
				if (temp == Integer.parseInt(broken[1])) {
					countIn--;
					countOut++;
					user = userDetail.get(temp);
					// lib1 = library.get(temp);
				}
			}
			if (countIn != 0) {
				available = true;
			}
			if (available) {
				return "It is available\nAuthor is " + lib1.getAuthor() + "\n";
			} else {
				return "No Stock\nIt is owned by " + user + "\n";
			}
		}
		if (Integer.parseInt(broken[0]) == 3) {
			int countIn = 0, countOut = 0, count = 0;
			int[] id = new int[10];
			for (int temp : library.keySet()) {
				Library libTemp = library.get(temp);
				if (libTemp.getBookName().equalsIgnoreCase(broken[1])) {
					countIn++;
					id[count++] = temp;
				}
			}
			for (int ids : userDetail.keySet()) {
				for (int any : id)
					if (ids == any) {
						countIn--;
						countOut++;
					}
			}
			return countOut + " out\n" + countIn + " in\n";
		}
		if (Integer.parseInt(broken[0]) == 2) {
			String res = "";
			int count = 0;
			int[] id = new int[5];
			for (int temp : userDetail.keySet()) {
				if (userDetail.get(temp) == Integer.parseInt(broken[1])) {
					id[count++] = temp;
				}
			}
			// System.out.println(id);
			for (int temp : library.keySet()) {
				for (int any : id) {
					if (temp == any) {
						Library libTemp = library.get(temp);
						res += temp + " " + libTemp.getBookName() + "\n";
					}
				}
			}
			return res;
		}
		if (Integer.parseInt(broken[0]) == 4) {
			String res = "";
			for (int temp : library.keySet()) {
				Library libTemp = library.get(temp);
				if (libTemp.getAuthor().equalsIgnoreCase(broken[1])) {
					res += libTemp.getBookName() + "\n";
				}
			}
			return res;
		}
		if (Integer.parseInt(broken[0]) == 5) {
			String res = "";
			for (int temp : library.keySet()) {
				Library libTemp = library.get(temp);
				if (libTemp.getBookName().toLowerCase().contains(broken[1].toLowerCase())) {
					res += temp + " " + libTemp.getBookName() + "\n";
				}
			}
			return res;
		} else
			return null;
	}
}