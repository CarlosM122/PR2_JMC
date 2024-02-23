package uniquindio.edo.co.gestionEmpleados;

public class Empleado {
    private String nombre;
    private String idEmpleado;
    private String dependencia;

    public Empleado() {
    }

    public Empleado(String nombre, String idEmpleado, String dependencia) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.dependencia = dependencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
