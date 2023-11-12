package Model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class BebidaTest {

    @Test
    public void testGetSetId_bebida() {
        Bebida bebida = new Bebida();
        bebida.setId_bebida(1);
        assertEquals(1, bebida.getId_bebida());
    }

    @Test
    public void testGetSetNome() {
        Bebida bebida = new Bebida();
        bebida.setNome("Coca Cola");
        assertEquals("Coca Cola", bebida.getNome());
    }


}

