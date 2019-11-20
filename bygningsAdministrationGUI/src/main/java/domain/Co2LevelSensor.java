package domain;

import java.util.UUID;

public class Co2LevelSensor extends Sensor {

    private double co2Level;

    public Co2LevelSensor(double co2Level, boolean isOutside, String name) {
        super(isOutside, name);
        this.co2Level = co2Level;
    }

    public double getCo2Level() {
        return co2Level;
    }

    public void setCo2Level(double co2Level) {
        this.co2Level = co2Level;
    }

    @Override
    public String toString() {
        String txt = super.getName() + "has Co2 level of " + this.co2Level + "PPM";
        return txt;
    }

}
