package chp5;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//
// dont run this code... it doesn't work.

// public class DCLSingleton {
//     // volatile - ensures that multiple threads handle the uniqueInstance
    
// 	private volatile static DCLSingleton uniqueInstance;
 
// 	private DCLSingleton() {}

    
 
// 	public static Singleton getInstance() {
// 		if (uniqueInstance == null) {
// 			synchronized (Singleton.class) {
// 				if (uniqueInstance == null) {
// 					uniqueInstance = new Singleton();
// 				}
// 			}
// 		}
// 		return uniqueInstance;
// 	}
// }
