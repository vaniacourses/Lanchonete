package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RelatorioGastosTesteMutanteScalarVariableReplacement1 {

    @Test
    void testGetSetCusto() {
        RelatorioGastosMutanteScalarVariableReplacement1 relatorio = new RelatorioGastosMutanteScalarVariableReplacement1();
        float numero=(float) (100.00);
        relatorio.setCusto(numero);
        assertEquals(numero, relatorio.getCusto());
    }

    @Test
    void testGetSetVenda() {
    	RelatorioGastosMutanteScalarVariableReplacement1 relatorio = new RelatorioGastosMutanteScalarVariableReplacement1();
        float numero=(float) (150.00);
        relatorio.setVenda(numero);
        assertEquals(numero, relatorio.getVenda());
    }

    @Test
    void testGetSetLucro() {
    	RelatorioGastosMutanteScalarVariableReplacement1 relatorio = new RelatorioGastosMutanteScalarVariableReplacement1();
        float numero=(float) (50.00);
        relatorio.setLucro(numero);
        assertEquals(numero, relatorio.getLucro());
    }
}
