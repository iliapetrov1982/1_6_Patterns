package factoryMethod;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flightList = FlightBuilder.createFlights();
        String[] filterNames = {
                "DepartureBeforeCurrentTimeFilter",
                "DepartureBeforeArrivalFilter",
                "MoreThanTwoHoursGroundTimeFilter",
                "SomeFilter"
        };

        for (String filterName : filterNames) {
            System.out.println('\n' + filterName);
            FilterFactory filterFactory = createFilter(filterName);
            Filter filter = filterFactory.createFilter();
            List<Flight> filteredFlights1 = filter.getFilteredFlights(flightList);
            for (Flight flight : filteredFlights1) {
                System.out.println(flight);
            }
        }
    }

    static FilterFactory createFilter(String filterName) {
        switch (filterName) {
            case "DepartureBeforeCurrentTimeFilter":
                return new DepartureBeforeCurrentTimeFilterFactory();
            case "DepartureBeforeArrivalFilter":
                return new DepartureBeforeArrivalFilterFactory();
            case "MoreThanTwoHoursGroundTimeFilter":
                return new MoreThanTwoHoursGroundTimeFilterFactory();
            default:
                throw new RuntimeException(filterName + " doesn't exist");
        }
    }

    static void printFlightList(List<Flight> flights) {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
