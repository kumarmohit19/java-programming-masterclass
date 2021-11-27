package com.advancejava;

public class Passenger {
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", fare=" + fare + "]";
	}

	int id;
	float fare;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public Passenger(int id, float fare) {
		this.id = id;
		this.fare = fare;
	}
}
