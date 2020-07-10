/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
public interface IObserver {
    void update(double pressure, double temperature, double humidity);
}