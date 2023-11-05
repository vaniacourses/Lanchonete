package DAO;


/**
 *
 * @author evandromauricio
 */

import org.junit.Test;

public class DaoLancheTest {

    /**
     *
     */
    @Test
    public void deveCalcularPrecoCorreto() {
        // Cria um lanche
        Lanche lanche = new Lanche("X-Salada", 10.0);

        // Calcula o preço do lanche
        double precoCalculado = lanche.calcularPreco();

        // Verifica se o preço calculado é correto
        assertEquals(10.0, precoCalculado);
    }

    
}
