package Model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RelatorioBebidasTest {

    @Test
    void testSetIdPedido() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        relatorio.setIdPedido(1);
        assertEquals(1, relatorio.getIdPedido());
    }

    @Test
    void testSetCliente() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        relatorio.setCliente("Daniel Lucas");
        assertEquals("Daniel Lucas", relatorio.getCliente());
    }

    @Test
    void testSetNomeBebida() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        relatorio.setNomeBebida("Coca-Cola");
        assertEquals("Coca-Cola", relatorio.getNomeBebida());
    }

    @Test
    void testSetQuantidade() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        relatorio.setQuantidade(5);
        assertEquals(5, relatorio.getQuantidade());
    }

    @Test
    void testSetCustoBebidas() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        float numero=(float) (10.00);
        relatorio.setCustoBebidas(numero);
        assertEquals(numero, relatorio.getCustoBebidas());
    }

    @Test
    void testSetVendaBebidas() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        float numero=(float) (20.00);
        relatorio.setVendaBebidas(numero);
        assertEquals(numero, relatorio.getVendaBebidas());
    }

    @Test
    void testSetLucroBebidas() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        float numero=(float) (10.00);
        relatorio.setLucroBebidas(numero);
        assertEquals(numero, relatorio.getLucroBebidas());
    }

    @Test
    void testSetTotalCustoBebidas() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        float numero=(float) (50.00);
        relatorio.setTotalCustoBebidas(numero);
        assertEquals(numero, relatorio.getTotalCustoBebidas());
    }

    @Test
    void testSetTotalVendaBebidas() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        float numero=(float) (100.00);
        relatorio.setTotalVendaBebidas(numero);
        assertEquals(numero, relatorio.getTotalVendaBebidas());
    }

    @Test
    void testSetTotalLucroBebidas() {
        RelatorioBebidas relatorio = new RelatorioBebidas();
        float numero=(float) (50.00);
        relatorio.setTotalLucroBebidas(numero);
        assertEquals(numero, relatorio.getTotalLucroBebidas());
    }
}

