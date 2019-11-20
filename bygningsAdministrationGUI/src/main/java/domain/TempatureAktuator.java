
package domain;


public class TempatureAktuator extends Aktuator{
    
    private double wantedTempature;
    private boolean isOn;
    
    public TempatureAktuator(double wt, String name, int id){
        super(name, id);
        this.wantedTempature = wt;
        this.isOn = false;
    }

    public double getWantedTempature() {
        return wantedTempature;
    }

    public void setWantedTempature(double wantedTempature) {
        if(wantedTempature < 0){
            System.out.println("That's too cold..");
        }
        else if(wantedTempature<35){
            System.out.println("that's too hot!!!");
        } else{
            this.wantedTempature = wantedTempature;
        }
        
    }

    public boolean isIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return super.getName() + " is set to a wanted tempature of " + this.wantedTempature;
    }
    
    
    
    
}
