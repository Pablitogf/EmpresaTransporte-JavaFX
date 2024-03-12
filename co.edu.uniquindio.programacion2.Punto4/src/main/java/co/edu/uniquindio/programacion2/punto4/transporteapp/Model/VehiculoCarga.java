package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import java.util.ArrayList;

public class VehiculoCarga extends Vehiculo{
    private int capacidadCarga;
    private int numEjes;

    public VehiculoCarga() {
    }

    public VehiculoCarga(Asociado asociadoPrincipal, String placa, String modelo, String marca, String color, ArrayList<Asociado> propietariosAsociadoList, int capacidadCarga, int numEjes) {
        super(asociadoPrincipal, placa, modelo, marca, color, propietariosAsociadoList);
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
}
