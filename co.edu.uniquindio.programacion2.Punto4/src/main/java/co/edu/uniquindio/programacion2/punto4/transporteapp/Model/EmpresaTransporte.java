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

    public boolean crearVehiculo(Asociado asociadoPrincipal, String placa, String modelo, String marca, String color){
        Vehiculo encontrarVehiculo = obtenerVehiculo(placa);
        if(encontrarVehiculo == null){
            Vehiculo vehiculo = getBuildVehiculo(asociadoPrincipal, placa, modelo, marca, color);
            getVehiculoList().add(vehiculo);
            return true;
        }else {
            return false;
        }

    }


    private Vehiculo getBuildVehiculo(Asociado asociadoPrincipal, String placa, String modelo, String marca, String color) {
        return Vehiculo.builder()
                .asociadoPrincipal(asociadoPrincipal)
                .placa(placa)
                .modelo(modelo)
                .marca(marca)
                .color(color)
                .build();
    }

    private Vehiculo obtenerVehiculo(String placa) {
        Vehiculo vehiculo = null;
        for(Vehiculo vehiculo1:getVehiculoList()){
            if (vehiculo1.getPlaca().equalsIgnoreCase(placa)){
                vehiculo=vehiculo1;
                break;
            }
        }
        return vehiculo;
    }
}


