package adapter.object;

public class Adapter extends Sensor {
    private FahrenheitSensor fahrenheitSensor;

    public Adapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperature() {
        return (fahrenheitSensor.getFahrenheitTemperature() - 32.0) * 5.0 / 9.0;
    }
}
