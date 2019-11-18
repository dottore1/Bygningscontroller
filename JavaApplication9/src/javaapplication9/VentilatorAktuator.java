package javaapplication9;

public class VentilatorAktuator extends Aktuator {

    private int percentopen;
    private boolean isOpen;

    public VentilatorAktuator(int pctopn, String name, int id) {
        super(name, id);
        this.percentopen = pctopn;
        this.isOpen = false;
    }

    public int getPercentopen() {
        return percentopen;
    }

    public void setPercentopen(int percentopen) {
        if (percentopen < 0) {
            System.out.println("That hurts :)");
        } else if (percentopen > 100) {
            System.out.println("that hurts too!!!!!");
        } else {
            this.percentopen = percentopen;
        }
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return super.getName() + " is " + this.percentopen + "% open";
    }

}
