package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;
    private List<Asociado> asociadosList = new ArrayList<>();
    private List<VehiculoTransporte> vehiculoTransporteList = new ArrayList<>();
    private List<VehiculoCarga> vehiculoCargaList = new ArrayList<>();
    private List<Vehiculo> vehiculoList = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    public List<VehiculoTransporte> getVehiculoTransporteList() {
        return vehiculoTransporteList;
    }

    public void setVehiculoTransporteList(List<VehiculoTransporte> vehiculoTransporteList) {
        this.vehiculoTransporteList = vehiculoTransporteList;
    }

    public List<VehiculoCarga> getVehiculoCargaList() {
        return vehiculoCargaList;
    }

    public void setVehiculoCargaList(List<VehiculoCarga> vehiculoCargaList) {
        this.vehiculoCargaList = vehiculoCargaList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asociado> getAsociadosList() {
        return asociadosList;
    }

    public void setAsociadosList(List<Asociado> asociadosList) {
        this.asociadosList = asociadosList;
    }

    public boolean crearVehiclo(String placa, String modelo, String marca, String color, ArrayList<Asociado> propietariosAsociadoList){
        Vehiculo vehiculoEncontrado = obtenerVehiculo(placa);
        if (vehiculoEncontrado == null) {
            Vehiculo vehiculo = getBuildVehiculo(placa, modelo, marca, color, propietariosAsociadoList);
            getVehiculoList().add(vehiculo);
            return true;
        }else{
            return false;
        }

    }

    private Vehiculo getBuildVehiculo(String placa, String modelo, String marca, String color, ArrayList<Asociado> propietariosAsociadoList) {
        return Vehiculo.builder()
                .placa(placa)
                .modelo(modelo)
                .marca(marca)
                .color(color)
                .propietariosAsociadoList(propietariosAsociadoList)
                .build();
    }

    private Vehiculo obtenerVehiculo(String placa) {
        Vehiculo vehiculo = null;
        for (Vehiculo vehiculo1: getVehiculoList()){
            if(vehiculo1.getPlaca().equalsIgnoreCase(placa)){
                vehiculo = vehiculo1;
                break;
            }
        }
        return vehiculo;
    }

}


