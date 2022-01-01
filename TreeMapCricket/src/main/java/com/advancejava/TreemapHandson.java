package com.advancejava;

import java.util.*;

class TreemapHandson {

	public TreeMap<Integer, String> createPlayerPositionMap(String cricketDataset) {
		TreeMap<Integer, String> cppm = new TreeMap<Integer, String>();
		for (String broken : cricketDataset.split("\\|")) {
			String temp[] = broken.split(",");
			cppm.put(Integer.parseInt(temp[0]), temp[1]);
		}
		return cppm;

	}

	public TreeMap<String, Integer> createPlayerScoreMap(String cricketDataset) {
		TreeMap<String, Integer> cpsm = new TreeMap<String, Integer>();
		for (String broken : cricketDataset.split("\\|")) {
			String temp[] = broken.split(",");
			cpsm.put(temp[1], Integer.parseInt(temp[2]));
		}
		return cpsm;
	}

	public TreeMap<?, ?> createMatchesMap(String cricketDataset) {
		TreeMap<?, ?> exp = new TreeMap<>();
		return exp;
	}

	public String getQuery(String cricketDataset, String query) {
		String[] brake = query.split(" ");
		TreemapHandson th = new TreemapHandson();
		// TreeMap<Integer,String> cppm =
		// th.createPlayerPositionMap(cricketDataset);
		// TreeMap<String,Integer> cpsm =
		// th.createPlayerScoreMap(cricketDataset);
		// TreeMap<String,Integer> cmm= th.createMatchesMap(cricketDataset);
		if (Integer.parseInt(brake[0]) == 1) {
			TreeMap<Integer, String> cppm = th.createPlayerPositionMap(cricketDataset);
			String res = "";
			int start = Integer.parseInt(brake[1]);
			int end = Integer.parseInt(brake[2]);
			for (int pos : cppm.keySet()) {
				for (int i = start; i <= end; i++) {
					if (pos == i) {
						res += pos + " " + cppm.get(pos) + "\n";
					}
				}
			}
			return res;
		}
		if (Integer.parseInt(brake[0]) == 2) {
			TreeMap<Integer, String> cppm = th.createPlayerPositionMap(cricketDataset);
			TreeMap<String, Integer> cpsm = th.createPlayerScoreMap(cricketDataset);
			String res = "";
			String[] name = new String[10];
			int count = 0;
			int limit = Integer.parseInt(brake[1]);
			// int end = Integer.parseInt(brake[2]);
			for (String pname : cpsm.keySet()) {
				if (cpsm.get(pname) > limit) {
					name[count++] = pname;
				}
			}
			for (int pos : cppm.keySet()) {
				for (String pname : name) {
					if (cppm.get(pos).equalsIgnoreCase(pname)) {
						res += pos + " " + cppm.get(pos) + "\n";
					}
				}
			}
			return res;
		}
		if (Integer.parseInt(brake[0]) == 3) {
			String res = "The Efficient Opener is ";
			TreeMap<?, ?> cmm = th.createMatchesMap(cricketDataset);
			// List<String,Integer> wholeData = new Array<String,Integer>();
			TreeMap<String, Integer> scorer = new TreeMap<String, Integer>();
			for (String broken : cricketDataset.split("\n")) {
				TreeMap<Integer, String> play = th.createPlayerPositionMap(broken);
				TreeMap<String, Integer> match = th.createPlayerScoreMap(broken);
				for (int keys : play.keySet()) {
					if (keys == 1) {
						int score = 0;
						if (scorer.containsKey(play.get(keys))) {
							score = scorer.get(play.get(keys));
						}
						score += match.get(play.get(keys));
						scorer.put(play.get(keys), score);
					}
				}
			}
			String maxScorerName = "";
			int max = 0;
			for (String keys2 : scorer.keySet()) {

				if (scorer.get(keys2) > max) {
					// System.out.println(keys2+" "+scorer.get(keys2));
					max = scorer.get(keys2);
					maxScorerName = keys2;
				}
			}
			return res + maxScorerName;
		} else
			return null;
	}

}