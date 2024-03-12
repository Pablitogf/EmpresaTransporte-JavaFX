package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import java.util.ArrayList;

public class VehiculoCarga extends Vehiculo{
    private int capacidadCarga;
    private int numEjes;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String placa, String modelo, String marca, String color, int capacidadCarga, int numEjes) {
        super(placa, modelo, marca, color);
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", numEjes=" + numEjes +
                '}';
    }
}
