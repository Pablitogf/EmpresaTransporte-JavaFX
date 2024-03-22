package co.edu.uniquindio.transporteapp.Controller;

import co.edu.uniquindio.transporteapp.Factory.ModelFactory;

public class EmpresaController {

    ModelFactory modelFactory;
    public EmpresaController(){
        modelFactory = ModelFactory.getInstance();
    }
}
