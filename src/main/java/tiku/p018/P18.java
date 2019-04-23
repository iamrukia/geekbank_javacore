package tiku.p018;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class P18 {
    public static void main(String[] args) {
        ZonedDateTime departure = ZonedDateTime.of(2019, 4, 19, 3, 0, 0, 0, ZoneId.of("UTC+7"));
        ZonedDateTime arrival = ZonedDateTime.of(2019, 4, 19, 9, 0, 0, 0, ZoneId.of("UTC+5"));

        long hrs = ChronoUnit.HOURS.between(departure, arrival);
        System.out.println("takes: " + hrs);
    }
}
