package Model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RelatorioBebidasMutanteScalarVariableReplacement1Teste {

    @Test
    void testSetIdPedido() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
        relatorio.setIdPedido(1);
        assertEquals(1, relatorio.getIdPedido());
    }

    @Test
    void testSetCliente() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
        relatorio.setCliente("Daniel Lucas");
        assertEquals("Daniel Lucas", relatorio.getCliente());
    }

    @Test
    void testSetNomeBebida() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
        relatorio.setNomeBebida("Coca-Cola");
        assertEquals("Coca-Cola", relatorio.getNomeBebida());
    }

    @Test
    void testSetQuantidade() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
        relatorio.setQuantidade(5);
        assertEquals(5, relatorio.getQuantidade());
    }

    @Test
    void testSetCustoBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
    	float numero=(float) (10.00);
    	relatorio.setCustoBebidas(numero);
        assertEquals(numero, relatorio.getCustoBebidas());
    }

    @Test
    void testSetVendaBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
    	float numero=(float) (20.00);
    	relatorio.setVendaBebidas(numero);
        assertEquals(numero, relatorio.getVendaBebidas());
    }

    @Test
    void testSetLucroBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
    	float numero=(float) (10.00);
    	relatorio.setLucroBebidas(numero);
        assertEquals(numero, relatorio.getLucroBebidas());
    }

    @Test
    void testSetTotalCustoBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
    	float numero=(float) (50.00);
    	relatorio.setTotalCustoBebidas(numero);
        assertEquals(numero, relatorio.getTotalCustoBebidas());
    }

    @Test
    void testSetTotalVendaBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
    	float numero=(float) (100.00);
    	relatorio.setTotalVendaBebidas(numero);
        assertEquals(numero, relatorio.getTotalVendaBebidas());
    }

    @Test
    void testSetTotalLucroBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement1 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement1();
    	float numero=(float) (50.00);
    	relatorio.setTotalLucroBebidas(numero);
        assertEquals(numero, relatorio.getTotalLucroBebidas());
    }
}

