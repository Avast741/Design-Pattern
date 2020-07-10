/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
public class ConditionsMonitor implements IObserver {
    @Override
    public void update(double pressure, double temperature, double humidity) {
        System.out.println("The Pressure is " + pressure);
        System.out.println("The Temperature is " + temperature);
        System.out.println("The Humidity is " + humidity + "\n\n");
    }
}
