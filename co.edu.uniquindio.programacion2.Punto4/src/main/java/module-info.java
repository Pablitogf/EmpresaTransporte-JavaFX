module co.edu.uniquindio.programacion2.punto4.transporteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.transporteapp to javafx.fxml;
    exports co.edu.uniquindio.transporteapp;

    exports co.edu.uniquindio.transporteapp.ViewController;
    opens co.edu.uniquindio.transporteapp.ViewController;
}