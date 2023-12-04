package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RelatorioGastosTest {

    @Test
    void testGetSetCusto() {
        RelatorioGastos relatorio = new RelatorioGastos();
        float numero=(float) (100.00);
        relatorio.setCusto(numero);
        assertEquals(numero, relatorio.getCusto());
    }

    @Test
    void testGetSetVenda() {
        RelatorioGastos relatorio = new RelatorioGastos();
        float numero=(float) (150.00);
        relatorio.setVenda(numero);
        assertEquals(numero, relatorio.getVenda());
    }

    @Test
    void testGetSetLucro() {
        RelatorioGastos relatorio = new RelatorioGastos();
        float numero=(float) (50.00);
        relatorio.setLucro(numero);
        assertEquals(numero, relatorio.getLucro());
    }
}
