package co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Builder;

import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Asociado;
import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Vehiculo;

import java.util.ArrayList;

public class VehiculoBuilder<T extends VehiculoBuilder<T>>{
    //protected Asociado asociadoPrincipal;
    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;

    /*public T asociadoPrincipal( Asociado asociadoPrincipal){
        this.asociadoPrincipal=asociadoPrincipal;
        return self();
    }*/

    public T placa(String placa){
        this.placa=placa;
        return self();
    }

    public T modelo(String modelo){
        this.modelo=modelo;
        return self();
    }

    public T marca(String marca){
        this.marca=marca;
        return self();
    }

    public T color(String color){
        this.color=color;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public Vehiculo build(){
        return new Vehiculo(placa,modelo,marca,color);
    }

}
