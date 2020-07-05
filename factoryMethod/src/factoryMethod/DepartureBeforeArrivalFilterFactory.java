package factoryMethod;

public class DepartureBeforeArrivalFilterFactory implements FilterFactory {
    @Override
    public Filter createFilter() {
        return new DepartureBeforeArrivalFilter();
    }
}
