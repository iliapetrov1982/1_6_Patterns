package factoryMethod;

public class MoreThanTwoHoursGroundTimeFilterFactory implements FilterFactory {
    @Override
    public Filter createFilter() {
        return new MoreThanTwoHoursGroundTimeFilter();
    }
}
