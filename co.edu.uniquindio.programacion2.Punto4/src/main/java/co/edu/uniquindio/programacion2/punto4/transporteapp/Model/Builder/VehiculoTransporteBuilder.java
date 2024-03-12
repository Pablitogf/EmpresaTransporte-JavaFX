package co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Builder;

import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Usuario;
import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.VehiculoTransporte;

import java.util.ArrayList;

public class VehiculoTransporteBuilder extends VehiculoBuilder<VehiculoTransporteBuilder> {
    protected int numPasajerosMax;

    protected ArrayList<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporteBuilder numPasajerosMax(int numPasajerosMax){
        this.numPasajerosMax=numPasajerosMax;
        return this;
    }

    public VehiculoTransporteBuilder listaUsuariosAsociados(ArrayList<Usuario> listaUsuariosAsociados){
        this.listaUsuariosAsociados=listaUsuariosAsociados;
        return this;
    }

    @Override
    public VehiculoTransporte build(){
        return new VehiculoTransporte(placa,modelo,marca,color,propietariosAsociadoList,numPasajerosMax,listaUsuariosAsociados);
    }

    @Override
    protected VehiculoTransporteBuilder self(){
        return this;
    }
}
