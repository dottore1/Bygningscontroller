package domain;

import java.util.ArrayList;

public class BuildingManager {

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

    public void removeBuilding(int id) {
        for (Building building : buildingList) {
            if (building.getId() == id) {
                buildingList.remove(building);
                if (buildingList.remove(building) == false) {
                    System.out.println("removal unsuccesfull.");
                }
            }
        }
    }
}
