package co.edu.uniquindio.programacion2;

import co.edu.uniquindio.programacion2.Modelo.*;

public class Main {
    public static void main(String[] args) {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        inicializarDatos(empresaTransporte);
        //asociarAsociado();
        calcularPasajerostransportados(empresaTransporte);
    }

    public static void inicializarDatos(EmpresaTransporte empresaTransporte){
        empresaTransporte.setNombreEmpresa("TransQuindio");

        Vehiculo vehiculo1 = new Vehiculo();

        VehiculoPersona vehiculoPersona = new VehiculoPersona();
        vehiculoPersona.setColor("Rojo");
        vehiculoPersona.setMarca("Volvo");
        vehiculoPersona.setModelo("2001");
        vehiculoPersona.setPlaca("BIA 645");
        vehiculoPersona.setNumeroViajes(4);
        vehiculoPersona.setNumeroMaximoPasajeros(25);

        VehiculoPersona vehiculoPersona1 = new VehiculoPersona();
        vehiculoPersona1.setColor("Verde");
        vehiculoPersona1.setMarca("Ferrari");
        vehiculoPersona1.setModelo("2012");
        vehiculoPersona1.setPlaca("LKO 098");
        vehiculoPersona1.setNumeroViajes(2);
        vehiculoPersona1.setNumeroMaximoPasajeros(15);

        VehiculoPersona vehiculoPersona2 = new VehiculoPersona();
        vehiculoPersona2.setColor("Naranja");
        vehiculoPersona2.setMarca("Mercedez");
        vehiculoPersona2.setModelo("2011");
        vehiculoPersona2.setPlaca("HGF 945");
        vehiculoPersona2.setNumeroViajes(2);
        vehiculoPersona2.setNumeroMaximoPasajeros(30);

        vehiculo1.getVehiculosPersona().add(vehiculoPersona);
        vehiculo1.getVehiculosPersona().add(vehiculoPersona1);
        vehiculo1.getVehiculosPersona().add(vehiculoPersona2);

        empresaTransporte.getListaVehiculo().add(vehiculo1);
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

    public static void calcularPasajerostransportados(EmpresaTransporte empresaTransporte){
        int diasTransporte = 1;
        int pasajerosTransportados = 0;
            for (Vehiculo vehiculo : empresaTransporte.getListaVehiculo()){
                for (VehiculoPersona vehiculoPersona : vehiculo.getVehiculosPersona()){
                    pasajerosTransportados += (vehiculoPersona.getNumeroMaximoPasajeros()*vehiculo.getNumeroViajes())*diasTransporte;

            }
        }
        System.out.println("El numero total de pasajeros transportados en " +diasTransporte+  " dia/s, fue de: " +pasajerosTransportados);
    }
}