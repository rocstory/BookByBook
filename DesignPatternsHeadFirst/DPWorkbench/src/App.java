import chp1.MiniDuckSimulator;
import chp2.WeatherStation;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, Malik!");
        // chp 1
        MiniDuckSimulator duckSimulator = new MiniDuckSimulator();
        duckSimulator.run();

        // chp 2
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.run();

    }
}
