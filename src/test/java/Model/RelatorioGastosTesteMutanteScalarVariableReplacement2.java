package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RelatorioGastosTesteMutanteScalarVariableReplacement2 {

    @Test
    void testGetSetCusto() {
        RelatorioGastosMutanteScalarVariableReplacement2 relatorio = new RelatorioGastosMutanteScalarVariableReplacement2();
        float numero=(float) (100.00);
        relatorio.setCusto(numero);
        assertEquals(numero, relatorio.getCusto());
    }

    @Test
    void testGetSetVenda() {
    	RelatorioGastosMutanteScalarVariableReplacement2 relatorio = new RelatorioGastosMutanteScalarVariableReplacement2();
        float numero=(float) (150.00);
        relatorio.setVenda(numero);
        assertEquals(numero, relatorio.getVenda());
    }

    @Test
    void testGetSetLucro() {
    	RelatorioGastosMutanteScalarVariableReplacement2 relatorio = new RelatorioGastosMutanteScalarVariableReplacement2();
        float numero=(float) (50.00);
        relatorio.setLucro(numero);
        assertEquals(numero, relatorio.getLucro());
    }
}
