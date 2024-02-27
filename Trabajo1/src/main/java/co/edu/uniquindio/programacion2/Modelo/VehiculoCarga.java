package co.edu.uniquindio.programacion2.Modelo;

public class VehiculoCarga extends Vehiculo {
    private int capacidadCarga;
    private int numEjes;

    public VehiculoCarga(int capacidadCarga, int numEjes) {
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
    }
    public VehiculoCarga() {
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Capacidad de carga:" + capacidadCarga +
                ", Numero de ejes:" + numEjes +
                ".";
    }
}
