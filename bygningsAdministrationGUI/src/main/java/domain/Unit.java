
package domain;

public abstract class Unit {
    
    private String name;
    
    private int id;
    
    
    public Unit(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString(){
        String txt = (this.name + " " + this.id);
        return txt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
