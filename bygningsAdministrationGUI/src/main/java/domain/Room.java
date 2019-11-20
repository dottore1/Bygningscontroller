package domain;

import java.util.ArrayList;

public class Room extends Unit {

    private ArrayList<Aktuator> aktuatorList;
    private ArrayList<Sensor> sensorList;

    public Room(String name, int id) {
        super(name, id);
        aktuatorList = new ArrayList<>();
        sensorList = new ArrayList<>();
    }

    public ArrayList<Aktuator> getAktuatorList() {
        return aktuatorList;
    }

    public ArrayList<Sensor> getSensorList() {
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

    public void removeAktuator(int id) {
        for (Aktuator aktuator : aktuatorList) {
            if (aktuator.getId() == id) {
                aktuatorList.remove(aktuator);
                if (aktuatorList.remove(aktuator) == false) {
                    System.out.println("removal unsuccesfull.");
                }
            }
        }
    }
    
        public void removeSensor(int id) {
        for (Sensor sensor : sensorList) {
            if (sensor.getId() == id) {
                sensorList.remove(sensor);
                if (sensorList.remove(sensor) == false) {
                    System.out.println("removal unsuccesfull.");
                }
            }
        }
    }
        
        @Override
        public String toString(){
            String txt = "Room: " + super.getName() + " id: " + super.getId();
            return txt;
        }

}
