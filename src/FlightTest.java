import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class FlightTest {

	/**
	 * This is the ArrayList question for AP CS 2008, Question 1
	 * http://apcentral.collegeboard.com/apc/public/repository/ap08_comp_sci_a_frq.pdf
	 * 
	 * <code>
	 * 
	 * 1. Using this information given, create the Trip class in code. 
	 * 2. Make sure the "flights" ArrayList is initialized. 
	 * 3. Create a method "add(Flight f)", that add a Flight to the flights ArrayList.
	 * 4. Create a method "getNumberOfFlights()" that returns the size of the ArrayList. 
	 * 5. Create a method "clear()" that removes all the flights in the ArrayList.
	 * 
	 * </code>
	 * */

	/* This test will check that you have created the Trip class correctly. */
	@Test
	public void testTrip() throws Exception {

		Trip testTrip = new Trip();
		Flight testFlight = new Flight(new Time("06/09/1978 09:00"), new Time("06/09/1978 09:02"));
		testTrip.add(testFlight);
		assertEquals(1, testTrip.getNumberOfFlights());

		Flight testFlight2 = new Flight(new Time("06/09/1978 09:00"), new Time("06/09/1978 09:02"));
		testTrip.add(testFlight2);
		assertEquals(2, testTrip.getNumberOfFlights());

		testTrip.clear();
		assertEquals(0, testTrip.getNumberOfFlights());
	}

	/**
	 * Part A: getDuration() should return the number of minutes from the
	 * departure of the first flight to the arrival of the last flight if there
	 * are one or more flights in the trip; 0, if there are no flights in the
	 * trip.
	 * 
	 * 1. Write your answer on paper.
	 * 
	 * 2. Use the test below to check your answer.
	 */

	@Test
	public void testGetDuration() throws Exception {
		Trip testTrip = new Trip();
		Flight flight1 = new Flight(new Time("06/09/1978 09:00"), new Time("06/09/1978 09:02"));
		Flight flight2 = new Flight(new Time("06/09/1978 09:02"), new Time("06/09/1978 10:30"));
		testTrip.add(flight1);
		testTrip.add(flight2);
		assertEquals(90, testTrip.getDuration());
		testTrip.clear();

		flight1 = new Flight(new Time("06/09/1978 18:00"), new Time("06/09/1978 19:30"));
		flight2 = new Flight(new Time("06/09/1978 19:30"), new Time("06/09/1978 23:00"));
		testTrip.add(flight1);
		testTrip.add(flight2);
		assertEquals(5 * 60, testTrip.getDuration());
	}

	/**
	 * Part B: getShortestLayover() should return the smallest number 
	 * of minutes between the arrival of a flight and the departure of 
	 * the flight immediately after it, if there are two or more 
	 * flights in the trip; -1, if there are fewer than two flights in the trip. 
	 * The departure time for each flight is always later than the arrival time 
	 * of its preceding flight.
	 * 
	 * 1. Write your answer on paper.
	 * 
	 * 2. Use the test below to check your answer.
	 */

	@Test
	public void testGetShortestLayover() throws Exception {
		Flight flight0 = new Flight(new Time("06/09/1978 11:30"), new Time("06/09/1978 12:15"));
		Flight flight1 = new Flight(new Time("06/09/1978 13:15"), new Time("06/09/1978 15:45"));
		Flight flight2 = new Flight(new Time("06/09/1978 16:00"), new Time("06/09/1978 18:45"));
		Flight flight3 = new Flight(new Time("06/09/1978 10:15"), new Time("06/09/1978 23:00"));
		Trip testTrip = new Trip();
		testTrip.add(flight0);
		testTrip.add(flight1);
		testTrip.add(flight2);
		testTrip.add(flight3);
		assertEquals(15, testTrip.getShortestLayover());
	}
}
