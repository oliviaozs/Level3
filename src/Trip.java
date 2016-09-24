import java.util.ArrayList;

public class Trip {
	ArrayList<Flight> flights;

	public Trip() {
		flights = new ArrayList<Flight>();
	}

	public void add(Flight f) {
		flights.add(f);
	}

	public int getNumberOfFlights() {
		return flights.size();
	}

	public void clear() {
		flights.clear();
	}

	public int getDuration() {
		if (flights.isEmpty())
			return 0;
		return flights.get(flights.size() - 1).getArrivalTime().minutesUntil(flights.get(0).getDepartureTime());
	}

	public int getShortestLayover() {
		if (flights.size() < 2)
			return -1;
		int shortLayover = flights.get(0).getArrivalTime().minutesUntil(flights.get(1).getDepartureTime());
		int index = 1;
		while (index < flights.size()-1) {
			int nextLayover = flights.get(index).getArrivalTime().minutesUntil(flights.get(++index).getDepartureTime());
			if (nextLayover < shortLayover) {
				shortLayover = nextLayover;
			}
		}
		return shortLayover;
	}
}