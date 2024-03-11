package co.edu.uniquindio.empresatransportefx.empresatransporteapp.model.model;

import java.util.ArrayList;

public class Asociado {
    private String nombre;
    private int numIdentificacion;
    private String email;
    private String numCelular;
    private Vehiculo vehiculo;
    private ArrayList<Vehiculo> listaVehiculosAsociados = new ArrayList<>();

    public Asociado() {
    }

    public Asociado(String nombre, int numIdentificacion, String email, String numCelular, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.numIdentificacion = numIdentificacion;
        this.email = email;
        this.numCelular = numCelular;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "asociado{" +
                "nombre='" + nombre + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", email='" + email + '\'' +
                ", numCelular=" + numCelular +
                '}';
    }
}
