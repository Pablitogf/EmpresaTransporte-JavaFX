package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

public class VehiculoCarga extends Vehiculo{
    private int capacidadCarga;
    private int numEjes;

    public VehiculoCarga(Asociado asociadoPrincipal, String placa, String modelo, String marca, String color,int capacidadCarga, int numEjes) {
        super(asociadoPrincipal,placa,modelo,marca,modelo);
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
    }
    public VehiculoCarga() {
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
}
