package co.edu.uniquindio.transporteapp.ViewController;


import co.edu.uniquindio.transporteapp.Controller.EmpresaController;
import co.edu.uniquindio.transporteapp.Factory.ModelFactory;
import co.edu.uniquindio.transporteapp.Model.Builder.VehiculoCargaBuilder;
import co.edu.uniquindio.transporteapp.Model.Builder.VehiculoTransporteBuilder;
import co.edu.uniquindio.transporteapp.Model.Propietario;
import co.edu.uniquindio.transporteapp.Model.Usuario;
import co.edu.uniquindio.transporteapp.Model.VehiculoCarga;
import co.edu.uniquindio.transporteapp.Model.VehiculoTransporte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmpresaViewController {

    EmpresaController empresaController;

    @FXML
    private Button btnCalcularNumPasajeros;

    @FXML
    private Button btnGuardarPropietario;

    @FXML
    private Button btnGuardarUsuario;

    @FXML
    private Button btnGuardarVehiculoCarga;

    @FXML
    private Button btnGuardarVehiculoTransporte;

    @FXML
    private Button btnObtenerMayoresEdad;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtCedulaPropietario;

    @FXML
    private TextField txtCelularPropietario;

    @FXML
    private TextField txtColorVehiculoCarga;

    @FXML
    private TextField txtColorVehiculoTransporte;

    @FXML
    private TextField txtEdadUsuario;

    @FXML
    private TextField txtEmailPropietario;

    @FXML
    private TextField txtMarcaVehiculoCarga;

    @FXML
    private TextField txtMarcaVehiculoTransporte;

    @FXML
    private TextField txtMaxNumPasajeros;

    @FXML
    private TextField txtModeloVehiculoCarga;

    @FXML
    private TextField txtModeloVehiculoTransporte;

    @FXML
    private TextField txtNombrePropietario;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private TextField txtNumEjes;

    @FXML
    private TextField txtPlacaVehiculoCarga;

    @FXML
    private TextField txtPlacaVehiculoTransporte;

    @FXML
    private TextArea txtResultadoPropietario;

    @FXML
    private TextArea txtResultadoUsuario;

    @FXML
    private TextArea txtResultadoVehiculoCarga;

    @FXML
    private TextArea txtResultadosVehiculoTrasporte;

    @FXML
    void onCalcularNumPasajeros(ActionEvent event) {
        calcularNumPasajeros();
    }

    @FXML
    void onGuardarPropietario(ActionEvent event) {
        agregarNuevoPropietario();
    }

    @FXML
    void onGuardarUsuario(ActionEvent event) {
        agregarUsuario();
    }

    @FXML
    void onGuardarVehiculoCarga(ActionEvent event) {
        agregarVehiculoCarga();
    }

    @FXML
    void onGuardarVehiculoTransporte(ActionEvent event) {
        agregarVehiculoTransporte();
    }

    @FXML
    void onObtenerMayoresEdad(ActionEvent event) {
        mayoresDeEdad();
    }

    private void agregarNuevoPropietario() {
        Propietario propietario = new Propietario();

        propietario.setNombrePropietario(txtNombrePropietario.getText());
        propietario.setCedula(txtCedulaPropietario.getText());
        propietario.setCelular(txtCelularPropietario.getText());
        propietario.setEmail(txtEmailPropietario.getText());
        txtResultadoPropietario.setText(propietario.toString());
    }

    private void agregarUsuario(){
        Usuario usuario = new Usuario();

        usuario.setNombreUsuario(txtNombreUsuario.getText());
        usuario.setEdad(Integer.parseInt(txtEdadUsuario.getText()));
        txtResultadoUsuario.setText(usuario.toString());
    }

    private void agregarVehiculoCarga(){
        VehiculoCarga vehiculoCarga = new VehiculoCargaBuilder()
                .placa(txtPlacaVehiculoCarga.getText())
                .modelo(txtModeloVehiculoCarga.getText())
                .marca(txtMarcaVehiculoCarga.getText())
                .color(txtColorVehiculoCarga.getText())
                .capacidadCarga(Double.parseDouble(txtCapacidadCarga.getText()))
                .numEjes(Integer.parseInt(txtNumEjes.getText()))
                .build();
        txtResultadoVehiculoCarga.setText(vehiculoCarga.toString());
    }

    private void agregarVehiculoTransporte(){
        VehiculoTransporte vehiculoTransporte = new VehiculoTransporteBuilder()
                .placa(txtPlacaVehiculoTransporte.getText())
                .modelo(txtModeloVehiculoTransporte.getText())
                .marca(txtMarcaVehiculoTransporte.getText())
                .color(txtColorVehiculoTransporte.getText())
                .numPasajerosMax(Integer.parseInt(txtMaxNumPasajeros.getText()))
                .build();
        txtResultadosVehiculoTrasporte.setText(vehiculoTransporte.toString());
    }

    private void calcularNumPasajeros(){
        if(!txtPlacaVehiculoTransporte.getText().isEmpty()){
            String resultado = String.valueOf(modelFactory.calcularNumPasajeros(txtPlacaVehiculoTransporte.getText()));
            txtResultadosVehiculoTrasporte.setText(resultado);
        }else{
            txtResultadosVehiculoTrasporte.setText("No hay usuarios Asignados");
        }
    }

    private void mayoresDeEdad(){
        String resultadoEdad = String.valueOf(modelFactory.calcularMayoresEdad());
        txtResultadoUsuario.setText("Usuarios mayores de edad: " + resultadoEdad);
    }

    @FXML
    void initialize() {
        empresaController = new EmpresaController();
    }

    /*Propietario propietario = new Propietario();

        propietario.setNombrePropietario(txtNombre.getText());
        propietario.setCedula(txtCedula.getText());
        propietario.setCelular(txtCelular.getText());
        propietario.setEmail(txtEmail.getText());

    String Mensaje = propietario.toString();{{

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
    boolean creardo = modelFactory.crearVehiclo(txtplaca.getText(),txtmodelo.getText(),txtmarca.getText(),txtcolor.getText());*/
}
