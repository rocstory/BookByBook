package chp5;

public class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton() {
    }

    // synchronized keyword forces every thread to wait its turn before it can enter
    // the method.
    public static synchronized SynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }

    // other functions
}
