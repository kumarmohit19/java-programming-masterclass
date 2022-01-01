package com.advancejava;

import java.util.*;

public class Hashset {
	public static String getOut(int numberOfMatches, String squads, int squad1, int squad2) {
		String res = "";
		HashMap<String, Integer> players = new HashMap<String, Integer>();
		ArrayList<HashSet<String>> matches = new ArrayList<HashSet<String>>();
		for (String Tmatches : squads.split("#")) {
			HashSet<String> tempSquad = new HashSet<String>();
			String[] temp = Tmatches.split(" ");
			for (int i = 0; i < temp.length; i++) {
				tempSquad.add(temp[i]);

			}
			matches.add(tempSquad);
		}
		for (HashSet<String> temp : matches) {
			for (String play : temp) {
				int attendance = 0;
				if (players.containsKey(play)) {
					attendance = players.get(play);
				}
				attendance += 1;
				players.put(play, attendance);
			}
		}
		String inAllMatches = "";
		for (String atten : players.keySet()) {
			if (players.get(atten) == numberOfMatches) {
				inAllMatches += atten + " ";
			}
		}
		HashSet<String> ofSquad1 = matches.get(--squad2);
		for (String player1 : matches.get(--squad1)) {
			if (ofSquad1.contains(player1)) {
				ofSquad1.remove(player1);
			}
		}
		String inselectMatch = "";
		for (String player : ofSquad1) {
			inselectMatch += player + " ";
		}
		res = inAllMatches + ", " + inselectMatch;
		return res;
	}

}