package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import java.util.ArrayList;

public class Usuario {
    private VehiculoTransporte vehiculoTransporte;
    private String nombre;
    private int edad;

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

    public int getEdad() {
        return edad;
    }

    public void setCedula(int edad) {
        this.edad = edad;
    }


}
