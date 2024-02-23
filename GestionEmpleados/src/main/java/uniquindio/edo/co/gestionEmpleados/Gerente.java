package uniquindio.edo.co.gestionEmpleados;

import java.util.List;

public class Gerente extends Empleado implements Icontribuyente,IGestionarProyectos,IGestionarEquipo{
    private List<Empleado> empleadosAcargo;
    private String tipo;

    public Gerente() {
    }

    public Gerente(List<Empleado> empleadosAcargo, String tipo) {
        this.empleadosAcargo = empleadosAcargo;
        this.tipo = tipo;
    }

    public List<Empleado> getEmpleadosAcargo() {
        return empleadosAcargo;
    }

    public void setEmpleadosAcargo(List<Empleado> empleadosAcargo) {
        this.empleadosAcargo = empleadosAcargo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    @Override
    public String contribuir() {
        return "Contribuciones del gerente: \n -Gestion y organizacion de equipos.";
    }

    @Override
    public String gestionProyectos() {
        return "Tareas pendientes: Crear Servidores, revisar interfaces, comprobar datos. \n Fecha Limite de entrega: 24/12/1989";
    }

    @Override
    public String gestionarEquipo() {
        return "El equipo 1 se encarga de la revision de interfaces, el equipo 2 se encarga de gestionar los datos, el equipo 3 se encarga de crear los servidores";
    }
}
