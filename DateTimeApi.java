package dateTimeApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateTimeApi {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		// 2019-08-21

		LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);
		System.out.println(dateOfBirth);
		// 2010-01-14

		LocalDate previousYear = date.minus(1, ChronoUnit.YEARS);
		System.out.println("Date before 1 year : " + previousYear);
		// Date before 1 year : 2018-08-29

		LocalDate nextYear = date.plus(1, ChronoUnit.YEARS);
		System.out.println("Date after 1 year : " + nextYear);
		// Date after 1 year : 2020-08-29

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd + "-" + mm + "-" + yy);
		// 21-8-2019

		LocalTime time = LocalTime.now();
		System.out.println(time);
		// 10:17:02.845

		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.println(h + ":" + m + ":" + s + ":" + n);
		// 10:17:2:845000000

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		// 2019-08-21T10:17:02.845
				
		System.out.println("After six months:" + ldt.plusMonths(6));
		// After six months:2020-02-21T10:17:02.845

		System.out.println("Before six months:" + ldt.minusMonths(6));
		// Before six months:2019-02-21T10:17:02.845

		LocalDate tomorrow = date.plus(1, ChronoUnit.DAYS);
		if (tomorrow.isAfter(date)) {
			System.out.println("Tomorrow comes after today");
		}
		LocalDate yesterday = date.minus(1, ChronoUnit.DAYS);
		if (yesterday.isBefore(date)) {
			System.out.println("Yesterday is day before today");
		}

		LocalDateTime dt1 = LocalDateTime.of(1995, 04, 28, 12, 45);
		System.out.println(dt1);
		// 1995-04-28T12:45

		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		// Asia/Calcutta

		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);
		// 2019-08-20T21:47:02.845-07:00[America/Los_Angeles]

		LocalDate today = LocalDate.now();
		LocalDate independenceDay = LocalDate.of(1947, 8, 15);
		Period p = Period.between(independenceDay, today);
		System.out.println("We got independence since "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
		// We got independence since 72 years 0 months 6 days

		// How to get current timestamp in Java 8
		Instant timestamp = Instant.now();
		System.out.println("The value of this instant " + timestamp);
		//

		// How to parse/format date
		String someDate = "20140116";
		LocalDate formatted = LocalDate.parse(someDate, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("Date generated from String "+someDate+" is "+formatted);
		//Date generated from String 20140116 is 2014-01-16

		// How to parse date in Java using custom formatting
		String goodFriday = "Apr 18 2014";
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
			LocalDate holiday = LocalDate.parse(goodFriday, formatter);
			System.out.println("Successfully parsed String "+goodFriday+", date is "+holiday);
		} catch (DateTimeParseException ex) {
			System.out.printf("%s is not parsable!%n", goodFriday);
			ex.printStackTrace();
		}
		//Successfully parsed String Apr 18 2014, date is 2014-04-18
	}

}
