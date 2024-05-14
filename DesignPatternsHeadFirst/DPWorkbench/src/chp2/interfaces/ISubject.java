package chp2.interfaces;

public interface ISubject {
    public void registerObserver(IObserver o);

    public void removeObserver(IObserver o);

    public void notifyObservers();
}
