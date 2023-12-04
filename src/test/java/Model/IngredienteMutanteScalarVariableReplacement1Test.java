package Model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class IngredienteMutanteScalarVariableReplacement1Test {
 
	private IngredienteMutanteScalarVariableReplacement1 ingrediente;
	@Before
	public void criarIngrediente() {
		ingrediente = new IngredienteMutanteScalarVariableReplacement1();
	}
	
	@Test
    public void testa_Set_Get_Id_ingrediente() {
		ingrediente.setId_ingrediente(2);
        assertEquals(2, ingrediente.getId_ingrediente());
    }
	
	@Test
    public void testa_Set_Get_Nome() {
		ingrediente.setNome("Tomate");
        assertEquals("Tomate", ingrediente.getNome());
    }
	
	@Test
    public void testa_Set_Get_Descricao() {
		ingrediente.setDescricao("Tomate Pelado");
        assertEquals("Tomate Pelado", ingrediente.getDescricao());
    }
	
	@Test
    public void testa_Set_Get_Quantidade() {
		ingrediente.setQuantidade(2);
        assertEquals(2, ingrediente.getQuantidade());
    }
	
	@Test
    public void testa_Set_Get_Valor_compra() {
		ingrediente.setValor_compra(10.00);
        assertEquals(10.00d, ingrediente.getValor_compra().doubleValue(), 0);
    }
	
	@Test
    public void testa_Set_Get_Valor_venda() {
		ingrediente.setValor_venda(20.00);
        assertEquals(20.00d, ingrediente.getValor_venda().doubleValue(), 0);
    }
	
	@Test
    public void testa_Set_Get_Fg_ativo() {
		ingrediente.setFg_ativo(20);
        assertEquals(20, ingrediente.getFg_ativo());
    }
	
	@Test
    public void testa_Set_Get_Tipo() {
		ingrediente.setTipo("Fruta");
        assertEquals("Fruta", ingrediente.getTipo());
    }
}
