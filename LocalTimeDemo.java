package dateTimeApi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
	public static void main(String[] args) {
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println(LocalTime.now(Clock.systemDefaultZone()));
		System.out.println(LocalTime.ofSecondOfDay(7453l));
		System.out.println(LocalTime.of(20,8,29));
		System.out.println(LocalTime.parse("15:49:50.316", DateTimeFormatter.ISO_LOCAL_TIME));
	}
}
