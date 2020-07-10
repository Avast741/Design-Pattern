/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
public class MainClass {
    public static void main(String[] args) {
        ConditionsMonitor conditionsMonitor = new ConditionsMonitor();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver((IObserver) conditionsMonitor);

        // A change in any values in subject leads to observer triggering updateValue method
        // and printing updated values.
        weatherStation.setPressure(24.0);
        weatherStation.setTemperature(17.0);
        weatherStation.setHumidity(120.0);
    }
}