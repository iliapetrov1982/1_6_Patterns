package factoryMethod;

import java.time.LocalDateTime;
import java.util.List;

public class DepartureBeforeCurrentTimeFilter extends AbstractFilter {
    @Override
    protected boolean filter(Flight flight) {
        List<Segment> segments = flight.getSegments();
        return LocalDateTime.now().isBefore(segments.get(0).getDepartureDate());
    }
}
