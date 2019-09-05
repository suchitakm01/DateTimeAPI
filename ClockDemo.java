package dateTimeApi;

import java.time.Clock;
import java.time.ZoneId;

public class ClockDemo {

	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println("Clock : " + clock.instant());
		
		     
		// Returns time based on system clock zone
		Clock defaultClock = Clock.systemDefaultZone();
		System.out.println("Clock : " + clock.getZone());
		
		System.out.println(clock.millis());
		System.out.println(clock.withZone(ZoneId.of("America/Los_Angeles")));

	}

}
