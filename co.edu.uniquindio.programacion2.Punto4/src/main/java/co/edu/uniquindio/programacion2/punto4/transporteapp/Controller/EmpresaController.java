package co.edu.uniquindio.programacion2.punto4.transporteapp.Controller;


import co.edu.uniquindio.programacion2.punto4.transporteapp.Factory.ModelFactory;
import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Propietario;
import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Builder.VehiculoCargaBuilder;
import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Builder.VehiculoTransporteBuilder;
import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Vehiculo;
import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.VehiculoTransporte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class EmpresaController {
    ModelFactory modelFactory;

    @FXML
    private ToggleGroup TipoDevehiculo;

    @FXML
    private Button btnFinalizar;

    @FXML
    private RadioButton rbVehiculoCarga;

    @FXML
    private RadioButton rbVehiculoTransporte;

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
    private TextArea txtResultado;

    @FXML
    private TextField txtcolor;

    @FXML
    private TextField txtmarca;

    @FXML
    private TextField txtmodelo;

    @FXML
    private TextField txtplaca;

    @FXML
    private TextField txttipoVehiculo;

    @FXML
    void onAgregar(ActionEvent event) {
        agregarNuevoAsociado();

    }

    private void agregarNuevoAsociado() {

        Propietario propietario = new Propietario();

        propietario.setNombre(txtNombre.getText());
        propietario.setCedula(txtCedula.getText());
        propietario.setCelular(txtCelular.getText());
        propietario.setEmail(txtEmail.getText());
        propietario.setTipoVehiculo(txttipoVehiculo.getText());

        String Mensaje = propietario.toString();

        RadioButton selectedRadioButton = (RadioButton) TipoDevehiculo.getSelectedToggle();
        System.out.println(selectedRadioButton==rbVehiculoCarga);
        System.out.println(selectedRadioButton==rbVehiculoTransporte);
        if(selectedRadioButton==rbVehiculoCarga){
            Vehiculo vehiculoCarga = new VehiculoCargaBuilder()
                    .placa(txtplaca.getText())
                    .modelo(txtmodelo.getText())
                    .marca(txtmarca.getText())
                    .color(txtcolor.getText())
                    .numEjes(Integer.parseInt(txtNumEjes.getText()))
                    .capacidadCarga(Integer.parseInt(txtCapacidadCarga.getText()))
                    .build();
                    Mensaje += vehiculoCarga.toString();
        } else if (selectedRadioButton==rbVehiculoTransporte) {
            VehiculoTransporte vehiculoTransporte = new VehiculoTransporteBuilder()
                    .placa(txtplaca.getText())
                    .modelo(txtmodelo.getText())
                    .marca(txtmarca.getText())
                    .color(txtcolor.getText())
                    .numPasajerosMax(Integer.parseInt(txtNumMaxPasajeros.getText()))
                    .build();
                    Mensaje += vehiculoTransporte.toString();
        }
        txtResultado.setText(Mensaje);
        //boolean creardo = modelFactory.crearVehiclo(txtplaca.getText(),txtmodelo.getText(),txtmarca.getText(),txtcolor.getText());
    }

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();
    }
}
