/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp1.bygningsadministrationgui;

import domain.Aktuator;
import domain.Building;
import domain.BuildingManager;
import domain.Room;
import domain.Sensor;
import domain.TempatureAktuator;
import domain.TempatureSensor;
import domain.VentilatorAktuator;
import static javafx.application.Application.launch;

/**
 *
 * @author marku
 */
public class Main {
    
    public static void main(String[] args) {
        BuildingManager bm = new BuildingManager();
        Building bdg = new Building("Vest");
        Room room = new Room("Small");
        Room room1 = new Room("medium");
        Aktuator ta = new TempatureAktuator(20, "ta Room 0");
        Aktuator va = new VentilatorAktuator(20, "ta Room 0");
        Sensor ts = new TempatureSensor(20, false, "ta Room 0");
        
        bm.addBuilding(bdg);
        bdg.addRoom(room);
        bdg.addRoom(room1);
        room.addAktuator(va);
        room.addAktuator(ta);
        room.addSensor(ts);
        for(Aktuator aktuator: room.getAktuatorList()){
            System.out.println(aktuator);
        }
        room.removeAktuator(va.getId());
        for(Aktuator aktuator: room.getAktuatorList()){
            System.out.println(aktuator);
        }
        App.load(args);
        
    }
    
}
