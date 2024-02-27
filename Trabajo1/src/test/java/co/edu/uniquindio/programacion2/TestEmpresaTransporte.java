package co.edu.uniquindio.programacion2;
import co.edu.uniquindio.programacion2.Modelo.Asociado;
import co.edu.uniquindio.programacion2.Modelo.Vehiculo;
import co.edu.uniquindio.programacion2.Modelo.VehiculoPasajero;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmpresaTransporte {

    @Test
    public void testAgregarnombreAsociado(){
        Asociado asociado = new Asociado();
        asociado.setNombre("Daniel");
        assertEquals("Daniel",asociado.getNombre());

    }
    @Test
    public void testAsociarVehiculos(){
        Asociado asociado = new Asociado();

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setColor("Rojo");
        vehiculo.setMarca("Mazda");
        vehiculo.setPlaca("GHU 523");
        vehiculo.setModelo("2020");

        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setColor("Rojo");
        vehiculo1.setMarca("Mazda");
        vehiculo1.setPlaca("GHU 523");
        vehiculo1.setModelo("2020");

        asociado.getVehiculoList().add(vehiculo);
        assertEquals(1,asociado.getVehiculoList().size());
    }
}