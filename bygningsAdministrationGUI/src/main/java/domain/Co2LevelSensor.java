package domain;

import java.util.UUID;

public class Co2LevelSensor extends Sensor {

    private double randomCo2Level;
    private boolean isOutSide;
    private double range = 15-35;

    public Co2LevelSensor(boolean isOutside, String name) {
        super(isOutside, name);
        this.isOutSide = isOutSide;
        this.randomCo2Level = (Math.random()*range);
    }

    public double getRandomCo2Level() {
        return randomCo2Level;
    }

    

    @Override
    public String toString() {
        String txt = super.getName() + "has Co2 level of " + this.randomCo2Level + "PPM";
        return txt;
    }

}
