package Model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RelatorioBebidasMutanteScalarVariableReplacement2Teste {

    @Test
    void testSetIdPedido() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
        relatorio.setIdPedido(1);
        assertEquals(1, relatorio.getIdPedido());
    }

    @Test
    void testSetCliente() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
        relatorio.setCliente("Daniel Lucas");
        assertEquals("Daniel Lucas", relatorio.getCliente());
    }

    @Test
    void testSetNomeBebida() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
        relatorio.setNomeBebida("Coca-Cola");
        assertEquals("Coca-Cola", relatorio.getNomeBebida());
    }

    @Test
    void testSetQuantidade() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
        relatorio.setQuantidade(5);
        assertEquals(5, relatorio.getQuantidade());
    }

    @Test
    void testSetCustoBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
    	float numero=(float) (10.00);
    	relatorio.setCustoBebidas(numero);
        assertEquals(numero, relatorio.getCustoBebidas());
    }

    @Test
    void testSetVendaBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
    	float numero=(float) (20.00);
    	relatorio.setVendaBebidas(numero);
        assertEquals(numero, relatorio.getVendaBebidas());
    }

    @Test
    void testSetLucroBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
    	float numero=(float) (10.00);
    	relatorio.setLucroBebidas(numero);
        assertEquals(numero, relatorio.getLucroBebidas());
    }

    @Test
    void testSetTotalCustoBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
    	float numero=(float) (50.00);
    	relatorio.setTotalCustoBebidas(numero);
        assertEquals(numero, relatorio.getTotalCustoBebidas());
    }

    @Test
    void testSetTotalVendaBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
    	float numero=(float) (100.00);
    	relatorio.setTotalVendaBebidas(numero);
        assertEquals(numero, relatorio.getTotalVendaBebidas());
    }

    @Test
    void testSetTotalLucroBebidas() {
    	RelatorioBebidasMutanteScalarVariableReplacement2 relatorio = new RelatorioBebidasMutanteScalarVariableReplacement2();
    	float numero=(float) (50.00);
    	relatorio.setTotalLucroBebidas(numero);
        assertEquals(numero, relatorio.getTotalLucroBebidas());
    }
}

