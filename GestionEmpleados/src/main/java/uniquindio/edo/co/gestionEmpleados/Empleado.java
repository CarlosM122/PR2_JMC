package uniquindio.edo.co.gestionEmpleados;

public class Empleado extends Departamento{
    private String nombre;
    private String idEmpleado;
    private String departamento;
    private int añosTrabajados;

    public Empleado() {
    }

    public Empleado(String nombre, String idEmpleado, String departamento, int añosTrabajados) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.departamento = super.getNombre();
        this.añosTrabajados = añosTrabajados;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = super.getNombre();
    }

    public int getAñosTrabajados() {
        return añosTrabajados;
    }

    public void setAñosTrabajados(int añosTrabajados) {
        this.añosTrabajados = añosTrabajados;
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

}
