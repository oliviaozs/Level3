class Flight {

	Time arrivalTime;
	Time departureTime;

	public Flight(Time departureTime, Time arrivalTime) {
		super();
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

}
