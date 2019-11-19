package javaapplication9;

import java.util.ArrayList;

public class Building extends Unit {

    private ArrayList<Room> roomList;

    public Building(String name, int id) {
        super(name, id);
        roomList = new ArrayList<>();
    }
    
        public void addRoom(Room room) {
            this.roomList.add(room);
            
    }
        
            public void removeRoom(int id) {
        for (Room room : roomList) {
            if (room.getId() == id) {
                roomList.remove(room);
                if (roomList.remove(room) == false) {
                    System.out.println("removal unsuccesfull.");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Building " + super.getName() + " id: " + super.getId();
    }
    
}

