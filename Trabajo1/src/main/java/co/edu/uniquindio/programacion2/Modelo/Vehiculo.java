package co.edu.uniquindio.programacion2.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private int numeroViajes;
    private List<VehiculoPersona> vehiculosPersona = new ArrayList<>();
    private List<VehiculoCarga> vehiculosCarga = new ArrayList<>();

    public Vehiculo(){
    }

    public Vehiculo(String placa, String modelo, String marca, String color, int numeroViajes, List<VehiculoPersona> vehiculosPersona, List<VehiculoCarga> vehiculosCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.numeroViajes = numeroViajes;
        this.vehiculosPersona = vehiculosPersona;
        this.vehiculosCarga = vehiculosCarga;
    }

    public List<VehiculoPersona> getVehiculosPersona() {
        return vehiculosPersona;
    }

    public void setVehiculosPersona(List<VehiculoPersona> vehiculosPersona) {
        this.vehiculosPersona = vehiculosPersona;
    }

    public List<VehiculoCarga> getVehiculosCarga() {
        return vehiculosCarga;
    }

    public void setVehiculosCarga(List<VehiculoCarga> vehiculosCarga) {
        this.vehiculosCarga = vehiculosCarga;
    }

    public int getNumeroViajes() {
        return numeroViajes;
    }

    public void setNumeroViajes(int numeroViajes) {
        this.numeroViajes = numeroViajes;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'';
    }
}
