package factoryMethod;

public class DepartureBeforeCurrentTimeFilterFactory implements FilterFactory {
    @Override
    public Filter createFilter() {
        return new DepartureBeforeCurrentTimeFilter();
    }
}
