package Notes.chapter02;

import chp2.WeatherData;
import chp2.interfaces.IDisplayElement;
import chp2.interfaces.IObserver;

// public class codeMagnets {
//     public static void main(String[] args) throws Exception {

//     }
// }

// This is the Observer class
public class ForecastDisplay implements IObserver, IDisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        // display code here
    }

    // we are pulling data from subject
    public void update() {
        lastPressure = currentPressure;
        display();
    }

}