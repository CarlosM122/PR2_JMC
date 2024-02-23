package uniquindio.edo.co.gestionEmpleados;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsignados = new ArrayList<>();

    public Proyecto() {
    }

    public Proyecto(String nombre, String codigo, List<Empleado> empleadosAsignados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = empleadosAsignados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void setEmpleadosAsignados(List<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }
}
