package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import java.util.ArrayList;

public class VehiculoTransporte extends Vehiculo{
    private int numPasajerosMax;
    private ArrayList<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int numPasajerosMax) {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int numPasajerosMax, ArrayList<Usuario> listaUsuariosAsociados) {
        super(placa, modelo, marca, color);
        this.numPasajerosMax = numPasajerosMax;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public int getNumPasajerosMax() {
        return numPasajerosMax;
    }

    public ArrayList<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "numPasajerosMax=" + numPasajerosMax +
                ", listaUsuariosAsociados=" + listaUsuariosAsociados +
                '}';
    }
}
