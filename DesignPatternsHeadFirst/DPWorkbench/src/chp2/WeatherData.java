package chp2;

import chp2.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

import chp2.interfaces.IObserver;

public class WeatherData implements ISubject {
    private List<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<IObserver>();
    }

    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            // pushing data to all observers
            // observer.update(temperature, humidity, pressure);

            // pulling the values
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

}
