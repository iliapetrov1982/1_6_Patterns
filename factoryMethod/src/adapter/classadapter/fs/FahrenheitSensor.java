package adapter.classadapter.fs;

public class FahrenheitSensor {
    public double getFahrenheitTemperature() {
        double temp = 32.0;
        return temp;

    }

    protected void adjust(double d) {
        System.out.println("some adjustment: " + d);
    }
}
