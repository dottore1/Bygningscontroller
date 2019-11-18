
package javaapplication9;

public class TempatureSensor extends Sensor {
    private double tempatureC;
    
    public TempatureSensor(double tempatureC, boolean isOutside, String name, int id){
        super(isOutside, name, id);
        this.tempatureC = tempatureC;
    }

    public double getTempatureC() {
        return tempatureC;
    }

    public void setTempatureC(double tempatureC) {
        this.tempatureC = tempatureC;
    }

    @Override
    public String toString() {
        return "The tempature in " + TempatureSensor.super.getName() + " is: "  +tempatureC;
    }
    

   
}
