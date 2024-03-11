module co.edu.uniquindio.empresatransportefx.empresatransporteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.empresatransportefx.empresatransporteapp to javafx.fxml;
    exports co.edu.uniquindio.empresatransportefx.empresatransporteapp;
}