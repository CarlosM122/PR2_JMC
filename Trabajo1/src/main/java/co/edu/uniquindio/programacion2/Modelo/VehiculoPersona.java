package co.edu.uniquindio.programacion2.Modelo;

public class VehiculoPersona extends Vehiculo {
    private int NumeroMaximoPasajeros;

    public VehiculoPersona(){

    }
    public VehiculoPersona(int NumeroMaximoPasajeros){
        this.NumeroMaximoPasajeros=NumeroMaximoPasajeros;
    }

    public int getNumeroMaximoPasajeros() {
        return NumeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        NumeroMaximoPasajeros = numeroMaximoPasajeros;
    }
}
