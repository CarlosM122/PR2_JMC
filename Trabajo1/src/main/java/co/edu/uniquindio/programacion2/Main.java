package co.edu.uniquindio.programacion2;

import co.edu.uniquindio.programacion2.Modelo.Asociado;
import co.edu.uniquindio.programacion2.Modelo.VehiculoCarga;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        asociarAsociado();
        pasajerosTransportados();
    }
    public static void pasajerosTransportados(){

    }
    public static void asociarAsociado(){
        Asociado asociado = new Asociado();
        asociado.setNombre("Juan");
        asociado.setNumeroIdentificacion(35482928);
        asociado.setEmail("Juan344@gmail.com");
        asociado.setNumeroCelular(31041529);
        asociado.setTamañoVehiculo("Grande");

        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setCapacidadCarga(15);
        vehiculoCarga.setNumEjes(4);
        vehiculoCarga.setPlaca("PEZ 204");
        vehiculoCarga.setMarca("Tinto");
        vehiculoCarga.setColor("Azul Oscuro");
        vehiculoCarga.setModelo("2014");

        System.out.println("El " + asociado.toString() +". Tiene asociado el "+ vehiculoCarga.toString());
    }
}