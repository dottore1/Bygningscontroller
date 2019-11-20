module sp1.bygningsadministrationgui {
    requires javafx.controls;
    requires javafx.fxml;

    opens sp1.bygningsadministrationgui to javafx.fxml;
    exports sp1.bygningsadministrationgui;
}