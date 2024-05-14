// Sharpen Your Pencil - Heat Index display p.62
package chp2;

import chp2.interfaces.IDisplayElement;
import chp2.interfaces.IObserver;

public class HeatIndexDisplay implements IDisplayElement, IObserver {

    private float heatIndex;

    // dont forget to register this observer
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.heatIndex = 0;
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    public void update(float temperature, float humidity, float pressure) {
        this.heatIndex = temperature + 1000; // add humidity equation here
        display();
    }

    public void display() {
        System.out.println("Heat index is " + this.heatIndex);
    }

}
