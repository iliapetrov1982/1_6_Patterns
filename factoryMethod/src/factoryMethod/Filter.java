package factoryMethod;

import java.util.List;

public interface Filter {
    List<Flight> getFilteredFlights(List<Flight> flights);
}
