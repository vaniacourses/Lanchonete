package Model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class BebidaTest {
	
	// ---------- TESTE ID BEBIDA ----------------
	@Test
    public void testGetId_bebida() {
        Bebida bebida = new Bebida();
        bebida.setId_bebida(1);
        assertEquals(1, bebida.getId_bebida());
    } // Este teste verifica se o método getId_bebida() retorna o valor correto quando o atributo id_bebida da classe Bebida é definido.
	@Test
    public void testGetIdBebidaComMockito() {
        Bebida bebidaMock = mock(Bebida.class);
        int idBebidaEsperado = 88;
        when(bebidaMock.getId_bebida()).thenReturn(idBebidaEsperado);
        int idBebidaObtido = bebidaMock.getId_bebida();
        assertEquals(idBebidaEsperado, idBebidaObtido);
    }

	@Test
    public void testSetId_bebida() {
        Bebida bebida = new Bebida();
        bebida.setId_bebida(1);
        assertEquals(1, bebida.getId_bebida());
    } // Este teste verifica se o método setId_bebida() altera o valor do atributo id_bebida da classe Bebida corretamente.
	@Test
	public void testSetIdBebidaComMockito() {
        Bebida bebidaMock = mock(Bebida.class);
        int idBebidaEsperado = 51;
        bebidaMock.setId_bebida(idBebidaEsperado);
        verify(bebidaMock).setId_bebida(idBebidaEsperado);
    }
    
	// ---------- TESTE NOME ---------------------
	@Test
    public void testGetNome() {
        Bebida refrigerante = new Bebida();
        refrigerante.setNome("Guarana");
        assertEquals("Guarana", refrigerante.getNome());
    } // Este teste verifica se o método getNome() retorna o valor correto quando o atributo nome da classe Bebida é definido.
	@Test
    public void testGetNomeComMockito() {
        Bebida bebidaMock = mock(Bebida.class);
        String nomeEsperado = "Kuat";
        when(bebidaMock.getNome()).thenReturn(nomeEsperado);
        String nomeObtido = bebidaMock.getNome();
        assertEquals(nomeEsperado, nomeObtido);
    }
	

	@Test
    public void testSetNome() {
        Bebida refrigerante = new Bebida();
        refrigerante.setNome("Coca-Cola");
        assertEquals("Coca-Cola", refrigerante.getNome());
    } // Este teste verifica se o método setNome() altera o valor do atributo nome da classe Bebida corretamente.
	@Test
    public void testSetNomeComMockito() {
        Bebida bebidaMock = mock(Bebida.class);
        String nomeEsperado = "Fanta";
        bebidaMock.setNome(nomeEsperado);
        verify(bebidaMock).setNome(nomeEsperado);
    }
		
    
	// ---------- TESTE DESCRICAO ----------------
    @Test
    public void testSetDescricao() {
    	Bebida Dolly = new Bebida();
    	Dolly.setDescricao("O sabor Brasileiro");
    }    
    @Test
    public void testGetDescricao() {
    	Bebida Dolly = new Bebida();
    	Dolly.setDescricao("O sabor Brasileiro");
    	assertEquals("O sabor Brasileiro", Dolly.getDescricao() );
    }
 
    // ---------- TEST QUANTIDADE -------------------
    @Test
    public void testGetQuantidade() {
        Bebida bebida = new Bebida();
        bebida.setQuantidade(10);
        assertEquals(10, bebida.getQuantidade());
    }
    @Test
    public void testSetQuantidade() {
        Bebida bebida = new Bebida();
        bebida.setQuantidade(10);
        assertEquals(10, bebida.getQuantidade());
    }

    // ---------- TESTE VALOR COMPRA  ----------------
    @Test
    public void testSetValorCompra() {
        Bebida bebida = new Bebida();
        bebida.setValor_compra(5.0);

        assertEquals(5.0, bebida.getValor_compra(), 0.01);
    }
    @Test
    public void testSetValor_compra() {
        Bebida bebida = new Bebida();
        bebida.setValor_compra(10.00);
    }

    // ---------- TESTE VALOR VENDA	----------------
    @Test
    public void testGetValorVenda() {
        Bebida bebida = new Bebida();								// Criação de uma instância de Bebida
        double valorVendaEsperado = 15.0;							// Definição de um valor de venda para a bebida
        bebida.setValor_venda(valorVendaEsperado);
        double valorVendaObtido = bebida.getValor_venda();			// Chamada do método que queremos testar
        assertEquals(valorVendaEsperado, valorVendaObtido, 0.01); 	// Verificação do resultado; Usando uma margem de erro para comparação de valores de ponto flutuante
    }
    @Test
    public void testGetValorVenda_Mockito() {
        Bebida bebidaMock = mock(Bebida.class);
        double valorVendaEsperado = 15.0;
        when(bebidaMock.getValor_venda()).thenReturn(valorVendaEsperado);
        double valorVendaObtido = bebidaMock.getValor_venda();
        assertEquals(valorVendaEsperado, valorVendaObtido, 0.01);
    }
    @Test
    public void testSetValor_venda() {
        Bebida bebida = new Bebida();
        bebida.setValor_venda(15.00);
    }
    @Test
    public void testSetValorVenda_Mockito() {
        Bebida bebidaMock = mock(Bebida.class);
        double valorVendaEsperado = 15.0;
        bebidaMock.setValor_venda(valorVendaEsperado);
        verify(bebidaMock).setValor_venda(valorVendaEsperado);
    }
 
    // ---------- TESTE TIPO	----------------
    @Test
    public void testGetTipo() {
        Bebida suco = new Bebida();
        suco.setTipo("Suco Natural");
        assertEquals("Suco Natural", suco.getTipo());
    }
    @Test
    public void testSetTipo() {
        Bebida bebida = new Bebida();
        bebida.setTipo("Cerveja");
        assertEquals("Cerveja", bebida.getTipo());
    }
     
    // ---------- TESTE FG_ATIVO	----------------
    @Test
    public void testGetFg_ativo() {
        Bebida bebida = new Bebida();
        bebida.setFg_ativo(1);
        assertEquals(1, bebida.getFg_ativo());
    } // Este teste verifica se o método getFg_ativo() retorna o valor correto quando o atributo fg_ativo da classe Bebida é definido.
    
    @Test
    public void testSetFg_ativo() {
        Bebida bebida = new Bebida();
        bebida.setFg_ativo(1);
        assertEquals(1, bebida.getFg_ativo());
    } // Este teste verifica se o método setFg_ativo() altera o valor do atributo fg_ativo da classe Bebida corretamente.
}