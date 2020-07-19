package adapter.classadapter;

import adapter.classadapter.fs.FahrenheitSensor;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Adapter(new FSAdapter());
        sensor.adjust();
        System.out.println("Celsius temperature = " + sensor.getTemperature());

    }
}
