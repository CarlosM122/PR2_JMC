package uniquindio.edo.co.gestionEmpleados;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        inicializarDatos(empresa);
        //obtenerDepartamento(empresa);
        //asensoPendiente(empresa);
    }

    private static void inicializarDatos(Empresa empresa) {
        empresa.setNombre("SunTeck");

        Departamento departamento1 = new Departamento();
        departamento1.setNombre("Infraestructura de datos");
        departamento1.setCodigo("SAC");

        Departamento departamento2 = new Departamento();
        departamento2.setNombre("Test");
        departamento2.setCodigo("DAS");

        Departamento departamento3 = new Departamento();
        departamento3.setNombre("Programacion");
        departamento3.setCodigo("KOL");


        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Pedro");
        empleado1.setIdEmpleado("MAN1068");
        empleado1.setAñosTrabajados(12);

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Mariano");
        empleado2.setIdEmpleado("SOL9856");
        empleado2.setAñosTrabajados(40);

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Sofia");
        empleado3.setIdEmpleado("FIA1979");
        empleado3.getDepartamento();
        empleado3.setAñosTrabajados(21);

        Empleado empleado4 = new Empleado();
        empleado4.setNombre("Victoria");
        empleado4.setIdEmpleado("GAS4567");
        empleado4.getDepartamento();
        empleado4.setAñosTrabajados(12);

        Empleado empleado5 = new Empleado();
        empleado5.setNombre("Saul");
        empleado5.setIdEmpleado("GAS4457");
        empleado5.setAñosTrabajados(30);

        Empleado empleado6 = new Empleado();
        empleado6.setNombre("Merida");
        empleado6.setIdEmpleado("KOI4437");
        empleado6.setAñosTrabajados(11);



        departamento1.getEmpleados().add(empleado1);
        departamento1.getEmpleados().add(empleado2);
        departamento2.getEmpleados().add(empleado3);
        departamento2.getEmpleados().add(empleado4);
        departamento3.getEmpleados().add(empleado5);
        departamento3.getEmpleados().add(empleado6);

        empresa.getDepartamentos().add(departamento1);
        empresa.getDepartamentos().add(departamento2);
        empresa.getDepartamentos().add(departamento3);
    }

    public static void obtenerDepartamento(Empresa empresa){
        String idEmpleado= "FIA1979";
        for (Departamento departamento : empresa.getDepartamentos()){
            for (Empleado empleado : departamento.getEmpleados()){
                if (Objects.equals(empleado.getIdEmpleado(), idEmpleado)){
                    System.out.println("El empleado con id:" + empleado.getIdEmpleado() + "Se encuentra en el departamento:"+ empleado.getDepartamento());
                }
            }
        }

    }
     public static void asensoPendiente(Empresa empresa){
         for (Departamento departamento : empresa.getDepartamentos()){
             for (Empleado empleado : departamento.getEmpleados()){
                 if (empleado.getAñosTrabajados() >= 20){
                     System.out.println(empleado.getNombre() + " Tiene un asenso pendiente");}
                 else {
                     System.out.println(empleado.getNombre() + " No tiene asenso pendiente");
                 }
             }
         }
     }

}