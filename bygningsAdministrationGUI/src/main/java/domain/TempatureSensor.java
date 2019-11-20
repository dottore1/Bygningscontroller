
package domain;



public class TempatureSensor extends Sensor {
    private double randomTemp;
    private boolean isOutSide;
    private double range = 15-35;
    
    public TempatureSensor(boolean isOutside, String name){
        super(isOutside, name);
        this.randomTemp = (Math.random()*range);
        this.isOutSide = isOutSide;
    }

    public double getRandomTemp() {
        return randomTemp;
    }

    public void setTempatureC(double tempatureC) {
        this.randomTemp = tempatureC;
    }

    @Override
    public String toString() {
        return "The tempature in " + TempatureSensor.super.getName() + " is: "  +randomTemp;
    }
    

   
}
