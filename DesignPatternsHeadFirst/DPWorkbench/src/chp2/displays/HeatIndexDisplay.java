// Sharpen Your Pencil - Heat Index display p.62
package chp2.displays;

import chp2.WeatherData;
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

    // data being pushed from observer
    // public void update(float temperature, float humidity, float pressure) {
    // pulling data from subject
    public void update() {
        float temperature = weatherData.getTemperature();
        this.heatIndex = temperature + 1000; // some fake equation for heat
        display();
    }

    public void display() {
        System.out.println("Heat index is " + this.heatIndex);
    }

}
