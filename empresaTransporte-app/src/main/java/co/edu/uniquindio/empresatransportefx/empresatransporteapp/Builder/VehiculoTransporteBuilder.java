package co.edu.uniquindio.empresatransportefx.empresatransporteapp.Builder;

import co.edu.uniquindio.empresatransportefx.empresatransporteapp.model.model.VehiculoCarga;
import co.edu.uniquindio.empresatransportefx.empresatransporteapp.model.model.VehiculoTransporte;

public class VehiculoTransporteBuilder extends VehiculoBuilder<VehiculoTransporteBuilder>{

    protected int NumPasajeros;

    public VehiculoTransporteBuilder NumPasajeros(int NumPasajeros){
        this.NumPasajeros = NumPasajeros;
        return this;
    }

    @Override
    public VehiculoTransporte build(){
        return new VehiculoTransporte(placa, modelo, marca, color, NumPasajeros);
    }

    @Override
    protected VehiculoTransporteBuilder self(){
        return this;
    }

}
