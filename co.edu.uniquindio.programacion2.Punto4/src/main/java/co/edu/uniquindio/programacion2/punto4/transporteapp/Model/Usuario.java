package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

public class Usuario {
    private VehiculoTransporte vehiculoTransporte;
    private String nombre;
    private String cedula;

    public String getNombre() {
        return nombre;
    }

    public VehiculoTransporte getVehiculoTransporte() {
        return vehiculoTransporte;
    }

    public void setVehiculoTransporte(VehiculoTransporte vehiculoTransporte) {
        this.vehiculoTransporte = vehiculoTransporte;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
