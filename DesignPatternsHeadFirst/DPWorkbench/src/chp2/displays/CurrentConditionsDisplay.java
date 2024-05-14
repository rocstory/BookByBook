package chp2.displays;

import chp2.WeatherData;
import chp2.interfaces.IDisplayElement;
import chp2.interfaces.IObserver;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // public void update(float temperature, float humidity, float pressure) {
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
