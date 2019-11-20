package sp1.bygningsadministrationgui;

import domain.Aktuator;
import domain.Building;
import domain.Sensor;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class PrimaryController implements Initializable {

    @FXML
    ListView lvBuilding;
    @FXML
    ListView lvAktuator;
    @FXML
    ListView lvSensor;
    @FXML
    

    private ObservableList<Building> olBuilding;
    private ObservableList<Aktuator> olAktuator;
    private ObservableList<Sensor> olSensor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Create OL for building
        olBuilding = FXCollections.observableArrayList();
        lvBuilding.setItems(olBuilding);

        //Create OL for Aktuator
        olAktuator = FXCollections.observableArrayList();
        lvAktuator.setItems(olAktuator);

        //Create OL for Sensor
        olSensor = FXCollections.observableArrayList();
        lvSensor.setItems(olSensor);

    }
    
    public void btnAktAddEventHandler(ActionEvent event){
        
    }

}
