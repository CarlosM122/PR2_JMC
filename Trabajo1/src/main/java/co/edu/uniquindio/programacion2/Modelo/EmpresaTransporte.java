package co.edu.uniquindio.programacion2.Modelo;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;
    private List<Asociado> asociadosList = new ArrayList<>();
    private List<Vehiculo> vehiculoList = new ArrayList<>();
    private List<VehiculoPasajero> vehiculoPasajeroList = new ArrayList<>();
    private List<VehiculoCarga> vehiculoCargaList = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public List<VehiculoPasajero> getVehiculoPasajeroList() {
        return vehiculoPasajeroList;
    }

    public void setVehiculoPasajeroList(List<VehiculoPasajero> vehiculoPasajeroList) {
        this.vehiculoPasajeroList = vehiculoPasajeroList;
    }

    public List<VehiculoCarga> getVehiculoCargaList() {
        return vehiculoCargaList;
    }

    public void setVehiculoCargaList(List<VehiculoCarga> vehiculoCargaList) {
        this.vehiculoCargaList = vehiculoCargaList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asociado> getAsociadosList() {
        return asociadosList;
    }

    public void setAsociadosList(List<Asociado> asociadosList) {
        this.asociadosList = asociadosList;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }
}
