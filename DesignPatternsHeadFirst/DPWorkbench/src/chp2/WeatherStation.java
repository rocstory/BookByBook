package chp2;

import chp2.displays.CurrentConditionsDisplay;
import chp2.displays.HeatIndexDisplay;

public class WeatherStation {
    public void run() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // left out the other displays for the sake of time and I got lazy...

        HeatIndexDisplay heatIndex = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        // SwingObverserverExample example = new SwingObverserverExample();
        // example.go();
    }
}
