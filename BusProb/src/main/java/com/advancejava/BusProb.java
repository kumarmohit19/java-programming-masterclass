package com.advancejava;

import java.util.List;
import java.util.ArrayList;

public class BusProb {

	public String output(int capacity, int stops, List<String> listOfPassengers, String query) {
		String output = "";
		int totalIn = 0;
		int totalOut = 0;
		List<Passenger> onBoardedPassengers = new ArrayList<Passenger>();
		List<Passenger> offBoardedPassengers = new ArrayList<Passenger>();
		for (int stopNo = 0; stopNo < stops; stopNo++) {

			// splitting passenger string into individual passenger string
			String[] passengers = listOfPassengers.get(stopNo).split(" ");

			// getting current passengers count in the bus
			for (String passenger : passengers) {
				if (passenger.substring(0, 1).equals("+")) {
					totalIn++;
				} else {
					totalOut++;
				}
			}

			// System.out.println("currentCapacity-> "+(totalIn-totalOut));

			// calculating fare according to current count
			float fare = calFare(capacity, totalIn - totalOut);

			for (String passenger : passengers) {
				String check = passenger.substring(0, 1);
				int id = Integer.parseInt(passenger.substring(1, passenger.length()));

				if (check.equals("+")) {
					Passenger newPasseger = new Passenger(id, fare);
					// System.out.println(newPasseger);
					onBoardedPassengers.add(newPasseger);
				} else {
					Passenger newPasseger = new Passenger(id, fare);
					// System.out.println(newPasseger);
					offBoardedPassengers.add(newPasseger);
				}
			}
		}

		int quesNo = Integer.parseInt(query.substring(0, 1));

		switch (quesNo) {
		case 1:
			return totalIn + " passengers got on the bus and " + totalOut + " passengers got out of the bus";
		case 2:
			float fareMin = (float) capacity * 1.0f;
			int minCount = 0;
			float fareMid = (float) (1.3 * capacity);
			int midCount = 0;
			float fareMax = (float) (1.6 * capacity);
			int maxCount = 0;
			for (Passenger passanger : onBoardedPassengers) {
				if (passanger.getFare() == fareMin) {
					minCount++;
				} else if (passanger.getFare() == fareMid) {
					midCount++;
				} else if (passanger.getFare() == fareMax) {
					maxCount++;
				}
			}
			// System.out.println(onBoardedPassengers);
			// System.out.println(offBoardedPassengers);
			return maxCount + " passengers traveled with a fare of " + fareMax + ", " + midCount
					+ " passengers traveled with a fare of " + fareMid + " and " + minCount
					+ " passengers traveled with a fare of " + fareMin;
		case 3:
			int passengerIdForFare = Integer.parseInt(query.substring(3, query.length()));
			float fare = 0.0f;
			for (Passenger passanger : onBoardedPassengers) {
				if (passanger.getId() == passengerIdForFare) {
					fare += passanger.getFare();
				}
			}
			return "Passenger " + passengerIdForFare + " spent a total fare of " + fare;
		case 4:
			int goingOutPassengerId = Integer.parseInt(query.substring(3, query.length()));
			int count = 0;
			for (Passenger passanger : onBoardedPassengers) {
				if (passanger.getId() == goingOutPassengerId) {
					count++;
				}
			}
			return "Passenger " + goingOutPassengerId + " has got on the bus for " + count + " times";
		case 5:
			Integer passengerIdForAvailiabilty = Integer.parseInt(query.substring(3, query.length()));
			boolean check = false;
			int countIn = 0;
			int countOut = 0;
			for (Passenger passanger : onBoardedPassengers) {
				if (passanger.getId() == passengerIdForAvailiabilty) {
					countIn++;
				}
			}
			for (Passenger passanger : offBoardedPassengers) {
				if (passanger.getId() == passengerIdForAvailiabilty) {
					countOut++;
				}
			}
			if (countIn != countOut) {
				check = true;
			}
			if (check) {
				return "Passenger " + passengerIdForAvailiabilty + " was inside the bus at the end of the trip";
			} else {
				return "Passenger " + passengerIdForAvailiabilty + " was not inside the bus at the end of the trip";
			}
		}

		return output;
	}

	static float calFare(int capacity, int countOfPass) {
		float fare = 0.0f;

		if (countOfPass <= Math.ceil((float) capacity / 4)) {
			fare = (float) (1.6 * capacity);
		} else if (countOfPass > Math.ceil((float) capacity / 4) && countOfPass <= Math.ceil((float) capacity / 2)) {
			fare = (float) (1.3 * capacity);
		} else if (countOfPass > Math.ceil((float) capacity / 2)) {
			fare = (float) capacity * 1.0f;
		}

		return fare;
	}
}
