import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class Time {

	private Date date;

	/**
	 * @return difference, in minutes, between this time and other; difference
	 *         is negative if other is earlier than this time
	 */
	public int minutesUntil(Time other) {
		long differenceInMilliseconds = this.date.getTime() - other.date.getTime();
		int differenceInMinutes = (int) (differenceInMilliseconds / 1000 / 60);
		return Math.abs(differenceInMinutes);
	}

	public Time(String dateAsString) {
		String format = "MM/dd/yyyy hh:mm";
		SimpleDateFormat dateFormatter = new SimpleDateFormat(format);

		try {
			this.date = dateFormatter.parse(dateAsString);
		} catch (ParseException e) {
			System.err.println("Couldn't understand date: " + dateAsString);
		}
	}
}
