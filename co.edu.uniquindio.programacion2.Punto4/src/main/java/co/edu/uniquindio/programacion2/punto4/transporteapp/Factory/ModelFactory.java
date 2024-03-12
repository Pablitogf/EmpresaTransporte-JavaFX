package co.edu.uniquindio.programacion2.punto4.transporteapp.Factory;

import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.Asociado;
import co.edu.uniquindio.programacion2.punto4.transporteapp.Model.EmpresaTransporte;

import java.util.ArrayList;

public class ModelFactory {

    private static ModelFactory modelFactory;

    private EmpresaTransporte empresaTransporte;

    private ModelFactory(){
        empresaTransporte = new EmpresaTransporte();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public boolean crearVehiclo(String placa, String modelo, String marca, String color, ArrayList<Asociado> propietariosAsociadoList){
        return empresaTransporte.crearVehiclo(placa,modelo,marca,color,propietariosAsociadoList);
    }
}
