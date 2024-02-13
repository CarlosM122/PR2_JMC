package co.edu.uniquindio.programacion2.Modelo;

public class Asociado {
    private String Nombre;
    private int NumeroIdentificacion;
    private String Email;
    private int NumeroCelular;
    private String TamañoVehiculo;

    public Asociado(){

    }

    public Asociado(String Nombre, int NumeroIdentificaion, String Email, int NumeroCelular, String TamañoVehiculo){
        this.Nombre=Nombre;
        this.NumeroIdentificacion=NumeroIdentificaion;
        this.Email=Email;
        this.NumeroCelular=NumeroCelular;
        this.TamañoVehiculo=TamañoVehiculo;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        NumeroIdentificacion = numeroIdentificacion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getNumeroCelular() {
        return NumeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        NumeroCelular = numeroCelular;
    }

    public String getTamañoVehiculo() {
        return TamañoVehiculo;
    }

    public void setTamañoVehiculo(String tamañoVehiculo) {
        TamañoVehiculo = tamañoVehiculo;
    }

}
