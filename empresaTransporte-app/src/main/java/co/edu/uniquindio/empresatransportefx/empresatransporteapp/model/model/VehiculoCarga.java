package co.edu.uniquindio.empresatransportefx.empresatransporteapp.model.model;

public class VehiculoCarga extends Vehiculo {
    private int NumEjes;
    private double capacidadCarga;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String placa, String modelo, String marca, String color, int numEjes, double capacidadCarga) {
        super(placa, modelo, marca, color);
        this.NumEjes = numEjes;
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumEjes() {
        return NumEjes;
    }

    public void setNumEjes(int numEjes) {
        NumEjes = numEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "vehiculoCarga{" +
                "NumEjes=" + NumEjes +
                '}';
    }
}