/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp1.bygningsadministrationgui;

import domain.Aktuator;
import domain.Building;
import domain.BuildingManager;

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
        
        Aktuator ta = new TempatureAktuator(20, "ta Room 0");
        Aktuator va = new VentilatorAktuator(20, "ta Room 0");
        Sensor ts = new TempatureSensor(false, "ta Room 0");
        
        bm.addBuilding(bdg);
       
        App.load(args);
        
    }
    
}
