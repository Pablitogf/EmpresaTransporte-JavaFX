package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import java.util.ArrayList;
import java.util.List;

public class Asociado {
    private Vehiculo vehiculoPrincipal;
    private String nombre;
    private String numIdentificacion;
    private String email;
    private String numCelular;
    private String tamañoVehiculo;
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

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getTamañoVehiculo() {
        return tamañoVehiculo;
    }

    public void setTamañoVehiculo(String tamañoVehiculo) {
        this.tamañoVehiculo = tamañoVehiculo;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoAsociadoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoAsociadoList = vehiculoList;
    }
}
