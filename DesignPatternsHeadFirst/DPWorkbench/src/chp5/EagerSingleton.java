package chp5;

/**
 * Use if your application always creates and uses an instance of the Singleton
 * or
 * The overhead of creation and runtime aspects of the Singleton isn't
 * burdensome.
 * 
 */

public class EagerSingleton {
    // This code is guaranteed to be thread safe.
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {
    };

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}
