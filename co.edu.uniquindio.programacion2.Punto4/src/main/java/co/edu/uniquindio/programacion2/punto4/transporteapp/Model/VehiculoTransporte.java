package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo{
    private int numPasajerosMax;
    private ArrayList<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, ArrayList<Asociado> propietariosAsociadoList, int numPasajerosMax, ArrayList<Usuario> listaUsuariosAsociados) {
        super(placa, modelo, marca, color, propietariosAsociadoList);
        this.numPasajerosMax = numPasajerosMax;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public int getNumPasajerosMax() {
        return numPasajerosMax;
    }

    public ArrayList<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }
}
