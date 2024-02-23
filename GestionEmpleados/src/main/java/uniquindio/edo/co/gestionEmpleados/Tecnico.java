package uniquindio.edo.co.gestionEmpleados;

public class Tecnico extends Empleado implements Icontribuyente{
    private String especializacion;

    public Tecnico(String especializacion) {
        this.especializacion = especializacion;
    }

    public Tecnico() {
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public String contribuir() {
        return "Contribuciones del tecnico: \n -Revision y arreglo de equipos de computo.";
    }
}
