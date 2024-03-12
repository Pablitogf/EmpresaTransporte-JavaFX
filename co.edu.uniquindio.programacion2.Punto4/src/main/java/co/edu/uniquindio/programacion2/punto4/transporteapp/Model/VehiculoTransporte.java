package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import java.util.List;

public class VehiculoTransporte extends Vehiculo{
    private int numPasajerosMax;
    private List<Usuario> usuarioList;

    public VehiculoTransporte(Asociado asociadoPrincipal, String placa, String modelo, String marca, String color,int numPasajerosMax) {
        super(asociadoPrincipal,placa,modelo,marca,modelo);
        this.numPasajerosMax = numPasajerosMax;
    }

    public VehiculoTransporte() {
    }

    public int getNumPasajerosMax() {
        return numPasajerosMax;
    }

    public void setNumPasajerosMax(int numPasajerosMax) {
        this.numPasajerosMax = numPasajerosMax;
    }

}
