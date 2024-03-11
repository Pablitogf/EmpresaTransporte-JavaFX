package co.edu.uniquindio.empresatransportefx.empresatransporteapp.Builder;

import co.edu.uniquindio.empresatransportefx.empresatransporteapp.model.model.VehiculoCarga;

public class VehiculoCargaBuilder extends VehiculoBuilder<VehiculoCargaBuilder> {

    protected int NumEjes;
    protected double capacidadCarga;

    public VehiculoCargaBuilder NumEjes(int NumEjes){
        this.NumEjes = NumEjes;
        return this;
    }

    public VehiculoCargaBuilder capacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
        return this;
    }

    @Override
    public VehiculoCarga build(){
        return new VehiculoCarga(placa, modelo, marca, color, NumEjes, capacidadCarga);
    }

    @Override
    protected VehiculoCargaBuilder self(){
        return this;
    }
}
