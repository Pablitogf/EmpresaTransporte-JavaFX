package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Builder.VehiculoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    //private Asociado asociadoPrincipal;
    private String placa;
    private String modelo;
    private String marca;
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String marca, String color) {
        /*this.asociadoPrincipal = asociadoPrincipal;*/
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public static VehiculoBuilder builder(){
        return new VehiculoBuilder();
    }

    /*public Asociado getAsociadoPrincipal() {
        return asociadoPrincipal;
    }*/

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
