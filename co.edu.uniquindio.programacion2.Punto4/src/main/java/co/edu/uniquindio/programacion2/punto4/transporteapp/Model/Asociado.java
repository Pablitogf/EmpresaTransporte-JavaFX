package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import java.util.ArrayList;
import java.util.List;

public class Asociado {
    private Vehiculo vehiculoPrincipal;
    private String nombre;
    private String cedula;
    private String email;
    private String celular;
    private String TipoVehiculo;
    private List<Vehiculo> vehiculoAsociadoList = new ArrayList<>();

    public Asociado() {
    }

    public Vehiculo getVehiculoPrincipal() {
        return vehiculoPrincipal;
    }

    public void setVehiculoPrincipal(Vehiculo vehiculoPrincipal) {
        this.vehiculoPrincipal = vehiculoPrincipal;
    }

    public String getNombre() {
        return nombre;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.TipoVehiculo = tipoVehiculo;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoAsociadoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoAsociadoList = vehiculoList;
    }

    @Override
    public String toString() {
        return "Asociado{" +
                "vehiculoPrincipal=" + vehiculoPrincipal +
                ", nombre='" + nombre + '\'' +
                ", numIdentificacion='" + cedula + '\'' +
                ", email='" + email + '\'' +
                ", numCelular='" + celular + '\'' +
                ", TipoVehiculo='" + TipoVehiculo + '\'' +
                ", vehiculoAsociadoList=" + vehiculoAsociadoList +
                '}';
    }
}
