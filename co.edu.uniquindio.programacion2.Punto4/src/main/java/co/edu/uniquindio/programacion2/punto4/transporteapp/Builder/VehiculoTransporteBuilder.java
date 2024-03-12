package co.edu.uniquindio.programacion2.punto4.transporteapp.Builder;

import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.VehiculoTransporte;

public class VehiculoTransporteBuilder extends VehiculoBuilder<VehiculoTransporteBuilder> {
    protected int numPasajerosMax;

    public VehiculoTransporteBuilder numPasajerosMax(int numPasajerosMax){
        this.numPasajerosMax=numPasajerosMax;
        return this;
    }

    public VehiculoTransporte build(){
        return new VehiculoTransporte(asociadoPrincipal,placa,modelo,marca,color,numPasajerosMax);
    }

    @Override
    protected VehiculoTransporteBuilder self(){
        return this;
    }
}
