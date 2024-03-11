package co.edu.uniquindio.empresatransportefx.empresatransporteapp.model.model;

import co.edu.uniquindio.empresatransportefx.empresatransporteapp.Builder.VehiculoBuilder;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public static VehiculoBuilder builder(){
        return new VehiculoBuilder();
    }

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
        return "vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
