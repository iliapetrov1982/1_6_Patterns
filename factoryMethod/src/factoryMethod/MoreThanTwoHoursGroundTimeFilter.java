package factoryMethod;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class MoreThanTwoHoursGroundTimeFilter extends AbstractFilter {
    @Override
    public boolean filter(Flight flight) {
        List<Segment> segments = flight.getSegments();
        int nymberOfSegnebts = segments.size();
        if (nymberOfSegnebts > 1) {
            long groundTime = 0;
            for (int i = 0; i < nymberOfSegnebts - 1; i++) {
                LocalDateTime arrival = segments.get(i).getArrivalDate();
                LocalDateTime departure = segments.get(i + 1).getDepartureDate();
                long differenceInHours = ChronoUnit.HOURS.between(arrival, departure);
                groundTime = groundTime +  differenceInHours;
                if (groundTime > 2) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }
}
