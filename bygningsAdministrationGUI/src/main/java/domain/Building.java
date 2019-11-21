package domain;

import java.util.ArrayList;
import java.util.UUID;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Building extends Unit {

    private ObservableList<Aktuator> aktuatorList;
    private ObservableList<Sensor> sensorList;

    public Building(String name) {
        super(name);
        aktuatorList = FXCollections.observableArrayList();
        sensorList = FXCollections.observableArrayList();
    }

    public ObservableList<Aktuator> getAktuatorList() {
        return aktuatorList;
    }

    public ObservableList<Sensor> getSensorList() {
        return sensorList;
    }

    public void addAktuator(Aktuator aktuator) {
        if (aktuator instanceof TempatureAktuator) {
            this.aktuatorList.add(aktuator);

        } else if (aktuator instanceof VentilatorAktuator) {
            this.aktuatorList.add(aktuator);
        } else {
            System.out.println("This is not a valid Aktuator..");
        }

    }

    public void addSensor(Sensor sensor) {
        if (sensor instanceof TempatureSensor) {
            this.sensorList.add(sensor);

        } else if (sensor instanceof Co2LevelSensor) {
            this.sensorList.add(sensor);
        } else {
            System.out.println("This is not a valid sensor..");
        }

    }

    public void removeAktuator(UUID id) {
        for (Aktuator aktuator : aktuatorList) {
            if (aktuator.getId().equals(id)) {
                aktuatorList.remove(aktuator);
                if (aktuatorList.remove(aktuator) == false) {
                    System.out.println("removal unsuccesfull.");
                }
            }
        }
    }
    
        public void removeSensor(UUID id) {
        for (Sensor sensor : sensorList) {
            if (sensor.getId().equals(id)) {
                sensorList.remove(sensor);
                if (sensorList.remove(sensor) == false) {
                    System.out.println("removal unsuccesfull.");
                }
            }
        }
    }
        public UUID getId(){
            return super.getId();
        }
        
        @Override
        public String toString(){
            String txt = "Building: " + super.getName();
            return txt;
        }

}
