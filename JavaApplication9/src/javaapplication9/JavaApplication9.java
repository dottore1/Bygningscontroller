/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Nichlas
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuildingManager bm = new BuildingManager();
        Building bdg = new Building("Vest", 00);
        Room room = new Room("Small", 00);
        Room room1 = new Room("medium", 01);
        Aktuator ta = new TempatureAktuator(20, "ta Room 0", 00);
        Aktuator va = new VentilatorAktuator(20, "ta Room 0", 00);
        Sensor ts = new TempatureSensor(20, false, "ta Room 0", 00);
        
        bm.addBuilding(bdg);
        bdg.addRoom(room);
        bdg.addRoom(room1);
        room.addAktuator(va);
        room.addAktuator(ta);
        room.addSensor(ts);
        
        
        
    }

}
