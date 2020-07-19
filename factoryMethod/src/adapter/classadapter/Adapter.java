package adapter.classadapter;

import adapter.classadapter.fs.FahrenheitSensor;

public class Adapter extends Sensor {
    private FSAdapter fahrenheitSensor;

    public Adapter(FSAdapter fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperature() {
        return (fahrenheitSensor.getFahrenheitTemperature() - 32.0) * 5.0 / 9.0;
    }

    @Override
    public void adjust() {
        fahrenheitSensor.adjust(10.1);
    }
}
