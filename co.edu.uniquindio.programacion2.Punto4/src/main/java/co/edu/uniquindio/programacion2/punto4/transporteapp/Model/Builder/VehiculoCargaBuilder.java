package co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Builder;

import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.VehiculoCarga;

public class VehiculoCargaBuilder extends VehiculoBuilder<VehiculoCargaBuilder>{
    protected int capacidadCarga;
    protected int numEjes;

    public VehiculoCargaBuilder capacidadCarga(int capacidadCarga){
        this.capacidadCarga=capacidadCarga;
        return this;
    }
    public VehiculoCargaBuilder numEjes(int numEjes){
        this.numEjes=numEjes;
        return this;
    }
    @Override
    public VehiculoCarga build(){
        return new VehiculoCarga(placa,modelo,marca,color,capacidadCarga,numEjes);
    }
    @Override
    protected VehiculoCargaBuilder self(){
        return this;
    }
}