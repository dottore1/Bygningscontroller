package domain;

import domain.Aktuator;
import domain.Building;
import domain.Sensor;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;

public class BuildingManager implements IBuildingManagementSystem {

    private ObservableList<Building> buildingList;
    private Map<UUID, String> buildingsMap;
    private Map<UUID, String> aktuatorsMap;
    private Map<UUID, String> sensorsMap;
    public BuildingManager() {
        buildingList =  FXCollections.observableArrayList();
    }

    public ObservableList<Building> getBuildingList() {
        return buildingList;
    }

    public Map<UUID, String> getBuildingsMap() {
        return buildingsMap;
    }

    public Map<UUID, String> getAktuatorsMap() {
        return aktuatorsMap;
    }

    public Map<UUID, String> getSensorsMap() {
        return sensorsMap;
    }
    
    

    /*
   public void createBuilding(String name, int id){
       Building building = new Building(name, id);
       buildingList.add(building);
   }
   
   public void createRoom(String name, int id, Building building){
      Room room = new Room(name, id);
      building.addRoom(room);
       
   }
   public void createTempatureAktuator(String name, int id, Room room){
       Aktuator aktuator = new TempatureAktuator(0, name, id);
       room.addAktuator(aktuator);
   }
   
     public void createVentilatorAktuator(String name, int id, Room room){
       Aktuator aktuator = new VentilatorAktuator(0, name, id);
       room.addAktuator(aktuator);
     }
     */
    public void addBuilding(Building building) {
        this.buildingList.add(building);
    }

    public void removeBuilding(UUID id) {
        for (Building building : buildingList) {
            if (building.getId().equals(id)) {
                buildingList.remove(building);
                if (buildingList.remove(building) == false) {
                    System.out.println("removal unsuccesfull.");
                }
            }
        }
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        for (Building building : buildingList) {
            this.buildingsMap.put(building.getId(), building.getName());
        }
        return buildingsMap;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        for (Building building : buildingList) {
            if (building.getId().equals(buildingId)) {
                for (Sensor sensor : building.getSensorList()) {
                    this.sensorsMap.put(sensor.getId(), sensor.getName());
                }
            }
        }
        return this.sensorsMap;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        for (Building building : buildingList) {
            if (building.getId().equals(buildingId)) {
                for (Aktuator aktuator : building.getAktuatorList()) {
                    this.sensorsMap.put(aktuator.getId(), aktuator.getName());
                }
            }
        }
        return this.aktuatorsMap;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, Boolean isOutSide, String name) {
        TempatureSensor tempatureSensor = null;
        for (Building building : buildingList) {
            if (building.getId().equals(buildingId)) {
                building.addSensor(tempatureSensor = new TempatureSensor(isOutSide, name));

            }
        }
        return tempatureSensor.getId();
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, Boolean isOutSide, String name) {
        Co2LevelSensor co2LevelSensor = null;
        for (Building building : buildingList) {
            if (building.getId().equals(buildingId)) {
                building.addSensor(co2LevelSensor = new Co2LevelSensor(false, name));

            }
        }
        return co2LevelSensor.getId();
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {

        for (Building building : buildingList) {
            if (building.getId().equals(buildingId)) {
                for (Sensor sensor : building.getSensorList()) {
                    if (sensor.getId().equals(sensorId)) {
                        building.getSensorList().remove(sensor);
                    }
                    else{
                        System.out.println("removal unsucessful");
                    }
                }

            }
        }

    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, int pctOpn, String name) {
        VentilatorAktuator ventilatorAktuator = null;
        for (Building building : buildingList) {
            if (building.getId().equals(buildingId)) {
                building.addAktuator(ventilatorAktuator = new VentilatorAktuator(pctOpn, name));

            }
        }
        return ventilatorAktuator.getId();
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        for (Building building : buildingList) {
            if (building.getId().equals(buildingId)) {
                for (Aktuator aktuator : building.getAktuatorList()) {
                    if (aktuator.getId().equals(actuatorId)) {
                        building.getSensorList().remove(aktuator);
                    }
                    else{
                        System.out.println("removal unsucessful");
                    }
                }

            }
        }
    }

    @Override
    public UUID addTempatureActuator(UUID buildingId, double wt, String name) {
        TempatureAktuator tempatureAktuator = null;
        for (Building building : buildingList) {
            if (building.getId().equals(buildingId)) {
                building.addAktuator(tempatureAktuator = new TempatureAktuator(wt, name));

            }
        }
        return tempatureAktuator.getId();
        
    }

    @Override
    public ObservableList<Aktuator> getAktuatorList(UUID buildingId) {
        ObservableList<Aktuator> aktuatorList = null;
        for(Building building: buildingList){
            if(building.getId().equals(buildingId)){
                aktuatorList = building.getAktuatorList();
            }
        }
        return aktuatorList;
    }

    @Override
    public ObservableList<Sensor> getSensorList(UUID buildingId) {
        ObservableList<Sensor> sensorList = null;
        for(Building building: buildingList){
            if(building.getId().equals(buildingId)){
                sensorList = building.getSensorList();
            }
        }
        return sensorList;
    }

}
