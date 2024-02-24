package uniquindio.edo.co.gestionEmpleados;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Proyecto> proyectos = new ArrayList<>();

    public Departamento() {
    }

    public Departamento(String nombre, String codigo, List<Empleado> empleados, List<Proyecto> proyectos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleados = empleados;
        this.proyectos = proyectos;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
