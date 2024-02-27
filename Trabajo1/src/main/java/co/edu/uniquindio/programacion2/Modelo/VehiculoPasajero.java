package co.edu.uniquindio.programacion2.Modelo;

public class VehiculoPasajero extends Vehiculo{
    private int numPasajerosMax;

    public VehiculoPasajero(int numPasajerosMax) {
        this.numPasajerosMax = numPasajerosMax;
    }

    public VehiculoPasajero() {
    }

    public int getNumPasajerosMax() {
        return numPasajerosMax;
    }

    public void setNumPasajerosMax(int numPasajerosMax) {
        this.numPasajerosMax = numPasajerosMax;
    }

    @Override
    public String toString() {
        return "VehiculoPasajero: "  + super.toString()+
                ", numero maximo de pasajeros=" + numPasajerosMax +
                ".";
    }
}
