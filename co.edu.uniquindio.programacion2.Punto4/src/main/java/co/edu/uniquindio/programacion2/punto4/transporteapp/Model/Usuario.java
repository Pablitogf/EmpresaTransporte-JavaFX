package co.edu.uniquindio.programacion2.punto4.transporteapp.Model;

public class Usuario {
    private String nombreUsuario;
    private int edad;

    private VehiculoTransporte vehiculoAsociado;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, int edad, VehiculoTransporte vehiculoAsociado) {
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoTransporte vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }
}
