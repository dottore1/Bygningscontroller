/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.UUID;

public abstract class Sensor extends Unit {

    private boolean isOutside;

    public Sensor(boolean isOutside, String name) {
        super(name);
        this.isOutside = isOutside;
    }
}
