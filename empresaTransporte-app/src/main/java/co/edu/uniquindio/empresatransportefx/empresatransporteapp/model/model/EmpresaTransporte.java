package co.edu.uniquindio.empresatransportefx.empresatransporteapp.model.model;

import java.util.ArrayList;

public class EmpresaTransporte {
    private String nombreEmpresa;
    private ArrayList<VehiculoTransporte> listaVehiuculoTransporte = new ArrayList<>();
    private ArrayList<VehiculoCarga> listaVehiculoCarga = new ArrayList<>();
    private ArrayList<Asociado> listaAsociados = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public EmpresaTransporte(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<VehiculoTransporte> getListaVehiuculoTransporte() {
        return listaVehiuculoTransporte;
    }

    public void setListaVehiuculoTransporte(ArrayList<VehiculoTransporte> listaVehiuculoTransporte) {
        this.listaVehiuculoTransporte = listaVehiuculoTransporte;
    }

    public ArrayList<VehiculoCarga> getListaVehiculoCarga() {
        return listaVehiculoCarga;
    }

    public void setListaVehiculoCarga(ArrayList<VehiculoCarga> listaVehiculoCarga) {
        this.listaVehiculoCarga = listaVehiculoCarga;
    }

    public ArrayList<Asociado> getListaAsociados() {
        return listaAsociados;
    }

    public void setListaAsociados(ArrayList<Asociado> listaAsociados) {
        this.listaAsociados = listaAsociados;
    }

    @Override
    public String toString() {
        return   "empresa{" +
            "nombreEmpresa=" + nombreEmpresa +
            '}';
    }
}
