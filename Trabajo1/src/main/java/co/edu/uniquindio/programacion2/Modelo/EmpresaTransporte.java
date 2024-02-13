package co.edu.uniquindio.programacion2.Modelo;
import java.util.ArrayList;
public class EmpresaTransporte {
    private String NombreEmpresa;
    private ArrayList<Asociado> ListaAsociados;
    private ArrayList<Vehiculo> ListaVehiculo;

    
    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        NombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Asociado> getListaAsociados() {
        return ListaAsociados;
    }

    public void setListaAsociados(ArrayList<Asociado> listaAsociados) {
        ListaAsociados = listaAsociados;
    }

    public ArrayList<Vehiculo> getListaVehiculo() {
        return ListaVehiculo;
    }

    public void setListaVehiculo(ArrayList<Vehiculo> listaVehiculo) {
        ListaVehiculo = listaVehiculo;
    }
}
