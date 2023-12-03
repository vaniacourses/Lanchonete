package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RelatorioLanchesTest {

    @Test
    void testGetSetLanche() {
        RelatorioLanches relatorio = new RelatorioLanches();
        relatorio.setLanche("ExemploLanche");
        assertEquals("ExemploLanche", relatorio.getLanche());
    }

    @Test
    void testGetSetIngrediente() {
        RelatorioLanches relatorio = new RelatorioLanches();
        relatorio.setIngrediente("ExemploIngrediente");
        assertEquals("ExemploIngrediente", relatorio.getIngrediente());
    }

    @Test
    void testGetSetQuantidade() {
        RelatorioLanches relatorio = new RelatorioLanches();
        relatorio.setQuantidade(10);
        assertEquals(10, relatorio.getQuantidade());
    }

    @Test
    void testGetSetCustoIngrediente() {
        RelatorioLanches relatorio = new RelatorioLanches();
        float numero=(float) (5.00);
        relatorio.setCustoIngrediente(numero);
        assertEquals(numero, relatorio.getCustoIngrediente());
    }

    @Test
    void testGetSetVendaIngrediente() {
        RelatorioLanches relatorio = new RelatorioLanches();
        float numero=(float) (10.00);
        relatorio.setVendaIngrediente(numero);
        assertEquals(numero, relatorio.getVendaIngrediente());
    }

    @Test
    void testGetSetLucroIngrediente() {
        RelatorioLanches relatorio = new RelatorioLanches();
        float numero=(float) (5.00);
        relatorio.setLucroIngrediente(numero);
        assertEquals(numero, relatorio.getLucroIngrediente());
    }

    @Test
    void testGetSetCustoTotalIngredientes() {
        RelatorioLanches relatorio = new RelatorioLanches();
        float numero=(float) (50.00);
        relatorio.setCustoTotalIngredientes(numero);
        assertEquals(numero, relatorio.getCustoTotalIngredientes());
    }

    @Test
    void testGetSetVendaTotalIngredientes() {
        RelatorioLanches relatorio = new RelatorioLanches();
        float numero=(float) (100.00);
        relatorio.setVendaTotalIngredientes(numero);
        assertEquals(numero, relatorio.getVendaTotalIngredientes());
    }

    @Test
    void testGetSetLucroTotalIngredientes() {
        RelatorioLanches relatorio = new RelatorioLanches();
        float numero=(float) (5.00);
        relatorio.setLucroTotalIngredeintes(numero);
        assertEquals(numero, relatorio.getLucroTotalIngredeintes());
    }

    @Test
    void testGetSetLucroOperacional() {
        RelatorioLanches relatorio = new RelatorioLanches();
        float numero=(float) (30.00);
        relatorio.setLucroOperacional(numero);
        assertEquals(numero, relatorio.getLucroOperacional());
    }

    @Test
    void testGetSetValorVenda() {
        RelatorioLanches relatorio = new RelatorioLanches();
        float numero=(float) (120.00);
        relatorio.setValorVenda(numero);
        assertEquals(numero, relatorio.getValorVenda());
    }

    @Test
    void testGetSetLucroTotal() {
        RelatorioLanches relatorio = new RelatorioLanches();
        float numero=(float) (70.00);
        relatorio.setLucroTotal(numero);
        assertEquals(numero, relatorio.getLucroTotal());
    }
}

