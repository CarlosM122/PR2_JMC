package uniquindio.edo.co.gestionEmpleados;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        inicializarDatos();
        obtenerDependencia();
    }

    private static void inicializarDatos() {
        Departamento departamento = new Departamento();
        departamento.setNombre("Software");
        departamento.setCodigo("3345");

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Pedro");
        empleado1.setIdEmpleado("MAN1068");
        empleado1.setDependencia("Infraestructura de datos");

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Mariano");
        empleado2.setIdEmpleado("SOL9856");
        empleado2.setDependencia("Tester");

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Sofia");
        empleado3.setIdEmpleado("FIA1979");
        empleado3.setDependencia("Programadora");



        departamento.getEmpleados().add(empleado1);
        departamento.getEmpleados().add(empleado2);
        departamento.getEmpleados().add(empleado3);

    }

    public static void obtenerDependencia(){
        Departamento departamento = new Departamento();

    }

}