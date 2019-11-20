
package domain;

import java.util.UUID;

public abstract class Unit {
    
    private String name;
    
    private UUID id;
    
    
    public Unit(String name){
        this.name = name;
        this.id = UUID.randomUUID();
    }
    
    @Override
    public String toString(){
        String txt = (this.name);
        return txt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

   
    
    
    
    
    
}
