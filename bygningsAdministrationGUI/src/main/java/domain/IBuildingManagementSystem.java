/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import javafx.collections.ObservableList;

/**
 *
 * @author ancla
 */
public interface IBuildingManagementSystem {   
    /**
     *
     * @return Map containing UUIDs of all buildings in the system along with an associated description (i.e. name)
     * 
     */
    public ObservableList<Building> getBuildingList();
    public ObservableList<Aktuator> getAktuatorList(UUID buildingId);
    public ObservableList<Sensor> getSensorList(UUID buildingId);
    public Map<UUID,String> getBuildingInformation();

    /**
     *
     * @param buildingId Building from which sensors are acquired
     * @return Map containing UUIDs of all sensors in building with buildingId, along with associated description of each sensor (i.e. name)
     */
    public Map<UUID,String> getSensorInformation(UUID buildingId);

    /**
     *
     * @param buildingId Building from which sensors are acquired
     * @return Map containing UUIDs of all actuators in building with buildingId, along with associated description of each actuator (i.e. name)
     */
    public Map<UUID,String> getActuatorInformation(UUID buildingId);
    
    /**
     *
     * @param buildingId Id of building to which sensor should be added.
     * @param isOutSide
     * @param name Name of the new sensor.
     * @return the UUID of the newly created sensor.
     */
    public UUID addTemperatureSensor(UUID buildingId, Boolean isOutSide, String name);

    /**
     *
     * @param buildingId Id of building to which sensor should be added.
     * @param name Name of the new sensor.
     * @return the UUID of the newly created sensor.
     */
    public UUID addCo2Sensor(UUID buildingId, Boolean isOutSide, String name);

    /**
     *
     * @param buildingId id of building from which the sensor should be removed.
     * @param sensorId  id of sensor to remove.
     */
    public void removeSensor(UUID buildingId, UUID sensorId);
    
    /**
     *
     * @param buildingId id of building to which actuator should be added.
     * @param name Name of the new actuator.
     * @return the UUID of the newly created actuator.
     */
    public UUID addVentilationActuator(UUID buildingId, int pctOpn, String name);
    public UUID addTempatureActuator(UUID buildingId, double wt, String name);

    /**
     *
     * @param buildingId id of building from which actuator should be removed.
     * @param actuatorId id of actuator to remove.
     */
    public void removeActuator(UUID buildingId, UUID actuatorId);
    
}
