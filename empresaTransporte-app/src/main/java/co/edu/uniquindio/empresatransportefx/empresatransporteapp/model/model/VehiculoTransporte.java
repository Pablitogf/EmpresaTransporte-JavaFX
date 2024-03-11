package co.edu.uniquindio.empresatransportefx.empresatransporteapp.model.model;

public class VehiculoTransporte extends Vehiculo {
    private int NumPasajeros;

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int numPasajeros) {
        super(placa, modelo, marca, color);
        NumPasajeros = numPasajeros;
    }

    public int getNumPasajeros() {
        return NumPasajeros;
    }

    @Override
    public String toString() {
        return "vehiculoTransporte{" +
                "NumPasajeros=" + NumPasajeros +
                '}';
    }
}
