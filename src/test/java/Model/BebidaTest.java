package Model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class BebidaTest {

	@Test
    public void testa_GetId_bebida() {
        Bebida bebida = new Bebida();
        bebida.setId_bebida(1);
        assertEquals(1, bebida.getId_bebida());
    } // Este teste verifica se o método getId_bebida() retorna o valor correto quando o atributo id_bebida da classe Bebida é definido.
	 
	
	@Test
    public void testa_SetId_bebida() {
        Bebida bebida = new Bebida();
        bebida.setId_bebida(1);
        assertEquals(1, bebida.getId_bebida());
    } // Este teste verifica se o método setId_bebida() altera o valor do atributo id_bebida da classe Bebida corretamente.
    
    
	@Test
    public void testa_GetNome() {
        Bebida refrigerante = new Bebida();
        refrigerante.setNome("Guarana");
        assertEquals("Guarana", refrigerante.getNome());
    } // Este teste verifica se o método getNome() retorna o valor correto quando o atributo nome da classe Bebida é definido.
	
	
	@Test
    public void testa_SetNome() {
        Bebida refrigerante = new Bebida();
        refrigerante.setNome("Coca-Cola");
        assertEquals("Coca-Cola", refrigerante.getNome());
    } // Este teste verifica se o método setNome() altera o valor do atributo nome da classe Bebida corretamente.
	
    
    @Test
    public void testa_SetDescricao() {
    	Bebida Dolly = new Bebida();
    	Dolly.setDescricao("O sabor Brasileiro");
    }

    
    @Test
    public void testa_GetDescricao() {
    	Bebida Dolly = new Bebida();
    	Dolly.setDescricao("O sabor Brasileiro");
    	assertEquals("O sabor Brasileiro", Dolly.getDescricao() );
    }
 
    
    @Test
    public void testa_GetQuantidade() {
        Bebida bebida = new Bebida();
        bebida.setQuantidade(10);
        assertEquals(10, bebida.getQuantidade());
    }

    @Test
    public void testa_SetQuantidade() {
        Bebida bebida = new Bebida();
        bebida.setQuantidade(10);
        assertEquals(10, bebida.getQuantidade());
    }

    // TESTE INCOMPLETO
    @Test
    public void testa_GetValor_compra() {
        Bebida bebida = new Bebida();
        bebida.setValor_compra(10.00);    
    }

    // TESTE INCOMPLETO
    @Test
    public void testa_SetValor_compra() {
        Bebida bebida = new Bebida();
        bebida.setValor_compra(10.00);
    }

    // TESTE INCOMPLETO
    @Test
    public void testa_GetValor_venda() {
        Bebida bebida = new Bebida();
        bebida.setValor_venda(15.00);
    }

    // TESTE INCOMPLETO
    @Test
    public void testa_SetValor_venda() {
        Bebida bebida = new Bebida();
        bebida.setValor_venda(15.00);
    }
 
    
    @Test
    public void testa_GetTipo() {
        Bebida suco = new Bebida();
        suco.setTipo("Suco Natural");
        assertEquals("Suco Natural", suco.getTipo());
    }

    @Test
    public void testa_SetTipo() {
        Bebida bebida = new Bebida();
        bebida.setTipo("Cerveja");
        assertEquals("Cerveja", bebida.getTipo());
    }
     
    
    @Test
    public void testa_GetFg_ativo() {
        Bebida bebida = new Bebida();
        bebida.setFg_ativo(1);
        assertEquals(1, bebida.getFg_ativo());
    } // Este teste verifica se o método getFg_ativo() retorna o valor correto quando o atributo fg_ativo da classe Bebida é definido.
    
    
    @Test
    public void testa_SetFg_ativo() {
        Bebida bebida = new Bebida();
        bebida.setFg_ativo(1);
        assertEquals(1, bebida.getFg_ativo());
    } // Este teste verifica se o método setFg_ativo() altera o valor do atributo fg_ativo da classe Bebida corretamente.
    
    
    

}

