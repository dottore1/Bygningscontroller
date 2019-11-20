package domain;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class BuildingManager implements IBuildingManagementSystem {

    private ArrayList<Building> buildingList;

    public BuildingManager() {
        buildingList = new ArrayList<>();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
