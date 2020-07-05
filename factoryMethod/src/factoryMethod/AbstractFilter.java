package factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFilter implements Filter {
    @Override
    public List<Flight> getFilteredFlights(List<Flight> flights) {
        List<Flight> filteredFlights = new ArrayList<>();
        for (Flight flight : flights) {
            List<Segment> segments = flight.getSegments();
            if (filter(flight)) {
                filteredFlights.add(flight);
            }
        }
        return filteredFlights;
    }

    protected abstract boolean filter(Flight flight);
}
