package sp1.bygningsadministrationgui;

import domain.Aktuator;
import domain.Building;
import domain.BuildingManager;
import domain.Sensor;
import domain.TempatureAktuator;
import domain.TempatureSensor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    ListView lvBuilding;
    @FXML
    ListView lvAktuator;
    @FXML
    ListView lvSensor;
    @FXML
    TextField txtName;
    @FXML
    TextField txtAktuatorSetting;
    @FXML
    CheckBox chkOutside;

    private ObservableList olBuilding;
    private ObservableList olAktuator;
    private ObservableList olSensor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        BuildingManager bm = new BuildingManager();

        //Create OL for building
        olBuilding = bm.getBuildingList();
        lvBuilding.setItems(olBuilding);

        lvBuilding.getSelectionModel().selectedItemProperty().addListener(e -> {
            Building review = (Building) lvBuilding.getSelectionModel().getSelectedItem();
            if (review == null) {
                return;

            } else {
                //Create OL for Aktuator
                Building SelectedItem = (Building) lvBuilding.getSelectionModel().getSelectedItem();
                olAktuator = bm.getAktuatorList(SelectedItem.getId());
                lvAktuator.setItems(olAktuator);

                //Create OL for Sensor
                olSensor = bm.getSensorList(SelectedItem.getId());
                lvSensor.setItems(olSensor);
            }

        });

    }

    @FXML
    public void btnAktAddEventHandler(ActionEvent event) {
        if (!txtName.getText().equals("")) {
            String name = txtName.getText();
            String setting = txtAktuatorSetting.getText();
            double settingAsDouble = Double.parseDouble(setting);
            //create new object to add
            Aktuator newAkuator = new TempatureAktuator(settingAsDouble, name);
            olAktuator.add(newAkuator);

        }
    }

    @FXML
    public void btnAktDeleteEventHandler(ActionEvent event) {
        Aktuator toRemove = (Aktuator) lvAktuator.getSelectionModel().getSelectedItem();
        olAktuator.remove(toRemove);
    }

    @FXML
    public void btnAktEditEventHandler(ActionEvent event) {

    }

    @FXML
    public void btnSnsAddEventHandler(ActionEvent event) {
        if (!txtName.getText().equals("")) {
            if (chkOutside.isSelected()) {
                String name = txtName.getText();
                Sensor newSensor = new TempatureSensor(false, name);
                olSensor.add(newSensor);
            } else {
                String name = txtName.getText();
                Sensor newSensor2 = new TempatureSensor(true, name);
                olSensor.add(newSensor2);
            }

        } else {
            System.out.println("Missing name.");
        }
    }

    @FXML
    public void btnSnsDeleteEventHandler(ActionEvent event) {
        Sensor snsToRemove = (Sensor) lvSensor.getSelectionModel().getSelectedItem();
        olSensor.remove(snsToRemove);
    }

    @FXML
    public void btnSnsEditEventHandler(ActionEvent event) {

    }

    @FXML
    public void btnAddBuildingEventHandler(ActionEvent event) {
        if (!txtName.getText().equals("")) {
            String name = txtName.getText();
            Building building = new Building(name);
            olBuilding.add(building);
            setEmpty();
        }
    }

    @FXML
    public void btnBuildingDeleteEventHandler() {
        Building toRemove = (Building) lvBuilding.getSelectionModel().getSelectedItem();
        olBuilding.remove(toRemove);

    }

    @FXML
    public void btnBuildingEditEventHandler() {

    }

    public void setEmpty() {
        txtName.setText("");
        txtAktuatorSetting.setText("");
    }

}
