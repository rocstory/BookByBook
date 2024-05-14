package chp2.interfaces;

public interface IObserver {
    // for pushing data from subject to observer
    // public void update(float temp, float humidity, float pressure);

    // pulling data
    public void update();
}
