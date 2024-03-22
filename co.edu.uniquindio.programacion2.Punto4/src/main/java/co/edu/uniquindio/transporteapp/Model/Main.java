package co.edu.uniquindio.transporteapp.Model;

import co.edu.uniquindio.transporteapp.Model.Builder.VehiculoTransporteBuilder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        puntoA();
    }

    private static void puntoA() {

        Propietario propietario = new Propietario();

        propietario.setNombrePropietario("Vector");
        propietario.setCedula("456454");
        propietario.setCelular("12346");
        propietario.setEmail("vectortugaticanocturna@gmail.com");

        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("pedro");
        usuario.setEdad(17);

        Usuario usuario1 = new Usuario();
        usuario1.setNombreUsuario("Samuel");
        usuario1.setEdad(25);

        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario.add(usuario);
        listaUsuario.add(usuario1);

        VehiculoTransporte vehiculoTransporte = new VehiculoTransporteBuilder()
                .placa("YMA 874")
                .modelo("2023")
                .marca("Tesla")
                .color("Azul")
                .numPasajerosMax(35)
                .listaUsuariosAsociados(listaUsuario)
                .build();
        propietario.getVehiculoList().add(vehiculoTransporte);

        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        empresaTransporte.getVehiculoTransporteList().add(vehiculoTransporte);
        calcularNumPasajeros(empresaTransporte);
    }

    public static void calcularNumPasajeros(EmpresaTransporte empresaTransporte){
            int suma = 0;
            for (VehiculoTransporte vehiculoTransporte : empresaTransporte.getVehiculoTransporteList()){
            suma += vehiculoTransporte.getListaUsuariosAsociados().size();
            System.out.println(vehiculoTransporte.getListaUsuariosAsociados().size());
            System.out.println(vehiculoTransporte.toString());
            }
            System.out.println(suma);

    }




}
