/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

public abstract class Sensor extends Unit {

    private boolean isOutside;

    public Sensor(boolean isOutside, String name, int id) {
        super(name, id);
        this.isOutside = isOutside;
    }
}
