package co.edu.uniquindio.programacion2.Modelo;

public class VehiculoCarga extends Vehiculo{
    private long CapacidadCarga;
    private long NumEjes;

    public long getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(long capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }

    public long getNumEjes() {
        return NumEjes;
    }

    public void setNumEjes(long numEjes) {
        NumEjes = numEjes;
    }

    @Override
    public String toString() {
        return
                "Vehiculo de carga con datos:\n" + super.toString() +
                "CapacidadCarga=" + CapacidadCarga +
                ", NumEjes=" + NumEjes;
    }
}
