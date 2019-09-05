package dateTimeApi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateDemo {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now(ZoneId.of("America/Los_Angeles")));
		System.out.println(LocalDate.now(Clock.systemDefaultZone()));
		System.out.println(LocalDate.ofEpochDay(76547453l));
		System.out.println(LocalDate.of(2019,8,29));
		System.out.println("Date after 3 days is "+LocalDate.now().plusDays(3));
		System.out.println("Date before 3 days is "+LocalDate.now().minusDays(3));
		System.out.println("Is current year a leap year? : "+LocalDate.now().isLeapYear());
		
	}

}
