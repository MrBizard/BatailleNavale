module jut.adr.bataillenavale {
    requires javafx.controls;
    requires javafx.fxml;


    opens jut.adr.bataillenavale to javafx.fxml;
    exports jut.adr.bataillenavale;
}