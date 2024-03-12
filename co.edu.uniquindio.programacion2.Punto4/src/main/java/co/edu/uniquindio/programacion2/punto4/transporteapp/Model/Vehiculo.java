package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import co.edu.uniquindio.programacion2.punto4.transporteapp.Builder.VehiculoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private Asociado asociadoPrincipal;
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private List<Asociado> propietariosAsociadoList = new ArrayList<>();

    public Vehiculo() {
    }

    public static VehiculoBuilder builder(){
        return new VehiculoBuilder();
    }

    public Vehiculo(Asociado asociadoPrincipal, String placa, String modelo, String marca, String color) {
        this.asociadoPrincipal = asociadoPrincipal;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public List<Asociado> getPropietariosAsociadoList() {
        return propietariosAsociadoList;
    }

    public void setPropietariosAsociadoList(List<Asociado> propietariosAsociadoList) {
        this.propietariosAsociadoList = propietariosAsociadoList;
    }


    public Asociado getAsociadoPrincipal() {
        return asociadoPrincipal;
    }

    public void setAsociadoPrincipal(Asociado asociadoPrincipal) {
        this.asociadoPrincipal = asociadoPrincipal;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
