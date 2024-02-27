package co.edu.uniquindio.programacion2;

import co.edu.uniquindio.programacion2.Modelo.*;

public class Main {

    public static void main(String[] args) {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        inincializarDatos(empresaTransporte);
        //pasajerosTransportadosdia(empresaTransporte);
        //asociarAsociado();
    }

    public static void inincializarDatos(EmpresaTransporte empresaTransporte) {
        empresaTransporte.setNombre("La Carretera");

        VehiculoPasajero vehiculoPasajero = new VehiculoPasajero();
        vehiculoPasajero.setColor("Rojo");
        vehiculoPasajero.setMarca("Volvo");
        vehiculoPasajero.setModelo("2001");
        vehiculoPasajero.setPlaca("BIA 645");
        vehiculoPasajero.setNumPasajerosMax(25);

        VehiculoPasajero vehiculoPasajero1 = new VehiculoPasajero();
        vehiculoPasajero1.setColor("Verde");
        vehiculoPasajero1.setMarca("Ferrari");
        vehiculoPasajero1.setModelo("2012");
        vehiculoPasajero1.setPlaca("LKO 098");
        vehiculoPasajero1.setNumPasajerosMax(15);

        VehiculoPasajero vehiculoPasajero2 = new VehiculoPasajero();
        vehiculoPasajero2.setColor("Naranja");
        vehiculoPasajero2.setMarca("Mercedez");
        vehiculoPasajero2.setModelo("2011");
        vehiculoPasajero2.setPlaca("HGF 945");
        vehiculoPasajero2.setNumPasajerosMax(30);


        empresaTransporte.getVehiculoPasajeroList().add(vehiculoPasajero);
        empresaTransporte.getVehiculoPasajeroList().add(vehiculoPasajero1);
        empresaTransporte.getVehiculoPasajeroList().add(vehiculoPasajero2);
    }

    public static void asociarAsociado() {
        Asociado asociado = new Asociado();
        asociado.setNombre("Juan");
        asociado.setNumIdentificacion("35482928");
        asociado.setEmail("Juan344@gmail.com");
        asociado.setNumCelular("31041529");
        asociado.setTamañoVehiculo("Grande");

        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setCapacidadCarga(15);
        vehiculoCarga.setNumEjes(4);
        vehiculoCarga.setPlaca("PEZ 204");
        vehiculoCarga.setMarca("Tinto");
        vehiculoCarga.setColor("Azul Oscuro");
        vehiculoCarga.setModelo("2014");

        System.out.println("El asociado: " + asociado.getNombre() +",con ID: "+ asociado.getNumIdentificacion() + ". Tiene asociado el vehiculo de carga con la siguiente informacion:\n " + vehiculoCarga.toString());
    }

    public static void pasajerosTransportadosdia(EmpresaTransporte empresaTransporte){
        int dias=3;
        int totalPasajerosTransportados = 0;
            for (VehiculoPasajero vehiculoPasajero : empresaTransporte.getVehiculoPasajeroList()){
                totalPasajerosTransportados += vehiculoPasajero.getNumPasajerosMax()*dias;
        }
        System.out.println("En "+ dias+ " dia/s se transportaron un total de: " + totalPasajerosTransportados+" pasajeros");
    }

}