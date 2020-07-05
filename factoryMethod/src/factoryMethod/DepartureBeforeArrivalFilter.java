package factoryMethod;

import java.util.List;

public class DepartureBeforeArrivalFilter extends AbstractFilter {
    @Override
    protected boolean filter(Flight flight) {
        List<Segment> segments = flight.getSegments();
        for (Segment segment : segments) {
            if (segment.getDepartureDate().isAfter(segment.getArrivalDate())) {
                return false;
            }
        }
        return true;
    }
}
