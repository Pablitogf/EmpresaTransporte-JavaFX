package co.edu.uniquindio.programacion2.punto4.transporteapp.Controller;


import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.programacion2.punto4.transporteapp.Factory.ModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class EmpresaController {
    ModelFactory modelFactory;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleGroup TipoDevehiculo;

    @FXML
    private Button btnFinalizar;

    @FXML
    private RadioButton rbVehiculoCarga;

    @FXML
    private RadioButton rbVehiculoTransporte1;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNumEjes;

    @FXML
    private TextField txtNumMaxPasajeros;

    @FXML
    private TextField txttipoVehiculo;

    @FXML
    void onAgregar(ActionEvent event) {
        agregarNuevoAsociado();

    }

    private void agregarNuevoAsociado() {
        //modelFactory.crearVehiclo()
    }

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();
    }
}
