/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condiments;
import Beverage.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + Whip ";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 2.0;
    }
}
