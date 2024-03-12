module co.edu.uniquindio.programacion2.punto4.transporteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.programacion2.punto4.transporteapp to javafx.fxml;
    exports co.edu.uniquindio.programacion2.punto4.transporteapp;
}