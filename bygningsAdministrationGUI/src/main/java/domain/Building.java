package domain;

import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit {

    private ArrayList<Room> roomList;

    public Building(String name) {
        super(name);
        roomList = new ArrayList<>();
    }
    
        public void addRoom(Room room) {
            this.roomList.add(room);
            
    }
        
            public void removeRoom(UUID id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                roomList.remove(room);
                if (roomList.remove(room) == false) {
                    System.out.println("removal unsuccesfull.");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Building: " + super.getName();
    }
    
}

