package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RelatorioLanchesMutanteScalarVariableReplacement2Teste {

    @Test
    void testGetSetLanche() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        relatorio.setLanche("ExemploLanche");
        assertEquals("ExemploLanche", relatorio.getLanche());
    }

    @Test
    void testGetSetIngrediente() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        relatorio.setIngrediente("ExemploIngrediente");
        assertEquals("ExemploIngrediente", relatorio.getIngrediente());
    }

    @Test
    void testGetSetQuantidade() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        relatorio.setQuantidade(10);
        assertEquals(10, relatorio.getQuantidade());
    }

    @Test
    void testGetSetCustoIngrediente() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        float numero=(float) (5.00);
        relatorio.setCustoIngrediente(numero);
        assertEquals(numero, relatorio.getCustoIngrediente());
    }

    @Test
    void testGetSetVendaIngrediente() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        float numero=(float) (10.00);
        relatorio.setVendaIngrediente(numero);
        assertEquals(numero, relatorio.getVendaIngrediente());
    }

    @Test
    void testGetSetLucroIngrediente() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        float numero=(float) (5.00);
        relatorio.setLucroIngrediente(numero);
        assertEquals(numero, relatorio.getLucroIngrediente());
    }

    @Test
    void testGetSetCustoTotalIngredientes() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        float numero=(float) (50.00);
        relatorio.setCustoTotalIngredientes(numero);
        assertEquals(numero, relatorio.getCustoTotalIngredientes());
    }

    @Test
    void testGetSetVendaTotalIngredientes() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        float numero=(float) (100.00);
        relatorio.setVendaTotalIngredientes(numero);
        assertEquals(numero, relatorio.getVendaTotalIngredientes());
    }

    @Test
    void testGetSetLucroTotalIngredientes() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        float numero=(float) (5.00);
        relatorio.setLucroTotalIngredeintes(numero);
        assertEquals(numero, relatorio.getLucroTotalIngredeintes());
    }

    @Test
    void testGetSetLucroOperacional() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        float numero=(float) (30.00);
        relatorio.setLucroOperacional(numero);
        assertEquals(numero, relatorio.getLucroOperacional());
    }

    @Test
    void testGetSetValorVenda() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        float numero=(float) (120.00);
        relatorio.setValorVenda(numero);
        assertEquals(numero, relatorio.getValorVenda());
    }

    @Test
    void testGetSetLucroTotal() {
        RelatorioLanchesMutanteScalarVariableReplacement1 relatorio = new RelatorioLanchesMutanteScalarVariableReplacement1();
        float numero=(float) (70.00);
        relatorio.setLucroTotal(numero);
        assertEquals(numero, relatorio.getLucroTotal());
    }
}

