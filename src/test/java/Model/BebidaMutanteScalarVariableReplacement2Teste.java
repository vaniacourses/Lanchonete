package Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class BebidaMutanteScalarVariableReplacement2Teste {

	// ========== TESTE ID BEBIDA
		// ---------- TESTE ID BEBIDA (GET)
		@Test
	    public void testGetId_bebida() {
			BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setId_bebida(1);
	        assertEquals(1, bebida.getId_bebida());
	    } // Este teste verifica se o método getId_bebida() retorna o valor correto quando o atributo id_bebida da classe Bebida é definido.
		@Test
	    public void testGetIdBebidaComMockito() {
			BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        int idBebidaEsperado = 1;
	        when(bebidaMock.getId_bebida()).thenReturn(idBebidaEsperado);
	        int idBebidaObtido = bebidaMock.getId_bebida();
	        assertEquals(idBebidaEsperado, idBebidaObtido);
	    }
		// ---------- TESTE ID BEBIDA (SET)
		@Test
	    public void testSetId_bebida() {
			BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setId_bebida(1);
	        assertEquals(1, bebida.getId_bebida());
	    } // Este teste verifica se o método setId_bebida() altera o valor do atributo id_bebida da classe Bebida corretamente.
		@Test
		public void testSetIdBebidaComMockito() {
			BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        int idBebidaEsperado = 51;
	        bebidaMock.setId_bebida(idBebidaEsperado);
	        verify(bebidaMock).setId_bebida(idBebidaEsperado);
	    }
		
		// ========== TESTE NOME
		// ---------- TESTE NOME (GET)
		@Test
	    public void testGetNome() {
			BebidaMutanteScalarVariableReplacement2 refrigerante = new BebidaMutanteScalarVariableReplacement2();
	        refrigerante.setNome("Guarana");
	        assertEquals("Guarana", refrigerante.getNome());
	    } // Este teste verifica se o método getNome() retorna o valor correto quando o atributo nome da classe Bebida é definido.
		@Test
	    public void testGetNomeComMockito() {
	        BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        String nomeEsperado = "Kuat";
	        when(bebidaMock.getNome()).thenReturn(nomeEsperado);
	        String nomeObtido = bebidaMock.getNome();
	        assertEquals(nomeEsperado, nomeObtido);
	    }
		// ---------- TESTE NOME (SET)
		@Test
	    public void testSetNome() {
			BebidaMutanteScalarVariableReplacement2 refrigerante = new BebidaMutanteScalarVariableReplacement2();
	        refrigerante.setNome("Coca-Cola");
	        assertEquals("Coca-Cola", refrigerante.getNome());
	    } // Este teste verifica se o método setNome() altera o valor do atributo nome da classe Bebida corretamente.
		@Test
	    public void testSetNomeComMockito() {
			BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        String nomeEsperado = "Fanta";
	        bebidaMock.setNome(nomeEsperado);
	        verify(bebidaMock).setNome(nomeEsperado);
	    }
		
		// ========== TESTE DESCRICAO
		// ---------- TESTE DESCRICAO (GET)
	    @Test
	    public void testGetDescricao() {
	    	BebidaMutanteScalarVariableReplacement2 Dolly = new BebidaMutanteScalarVariableReplacement2();
	    	Dolly.setDescricao("O sabor Brasileiro");
	    	assertEquals("O sabor Brasileiro", Dolly.getDescricao() );
	    }
	    @Test
	    public void testGetDescricaoComMockito() {
	        BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        String descricaoEsperada = "Bebida saborosa";
	        when(bebidaMock.getDescricao()).thenReturn(descricaoEsperada);
	        String descricaoObtida = bebidaMock.getDescricao();
	        assertEquals(descricaoEsperada, descricaoObtida);
	    }
	    // ---------- TESTE DESCRICAO (SET)
	    @Test
	    public void testSetDescricao() {
	    	BebidaMutanteScalarVariableReplacement2 Dolly = new BebidaMutanteScalarVariableReplacement2();
	    	Dolly.setDescricao("O sabor Brasileiro");
	    }
	    @Test
	    public void testSetDescricaoComMockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        String descricaoEsperada = "Bebida saborosa";
	        bebidaMock.setDescricao(descricaoEsperada);
	        verify(bebidaMock).setDescricao(descricaoEsperada);
	    }
	    
	    // ========== TESTE QUANTIDADE 
	    // ---------- TESTE QUANTIDADE (GET)
	    @Test
	    public void testGetQuantidade() {
	    	BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setQuantidade(10);
	        assertEquals(10, bebida.getQuantidade());
	    }
	    @Test
	    public void testGetQuantidadeComMockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        int quantidadeEsperada = 15;
	        when(bebidaMock.getQuantidade()).thenReturn(quantidadeEsperada);
	        int quantidadeObtida = bebidaMock.getQuantidade();
	        assertEquals(quantidadeEsperada, quantidadeObtida);
	    }
	    // ---------- TEST QUANTIDADE (SET)
	    @Test
	    public void testSetQuantidade() {
	    	BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setQuantidade(10);
	        assertEquals(10, bebida.getQuantidade());
	    }
	    @Test
	    public void testSetQuantidadeComMockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        int quantidadeEsperada = 15;
	        bebidaMock.setQuantidade(quantidadeEsperada);
	        verify(bebidaMock).setQuantidade(quantidadeEsperada);
	    }
	    
	    // ========== TESTE VALOR COMPRA
	    // ---------- TESTE VALOR COMPRA (GET)
	    @Test
	    public void testGetValorCompra() {
	    	BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setValor_compra(5.0);
	        assertEquals(5.0, bebida.getValor_compra(), 0.01);
	    }
	    @Test
	    public void testGetValorCompraComMockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        double valorCompraEsperado = 8.5;
	        when(bebidaMock.getValor_compra()).thenReturn(valorCompraEsperado);
	        double valorCompraObtido = bebidaMock.getValor_compra();
	        assertEquals(valorCompraEsperado, valorCompraObtido, 0.00);
	    }
	    // ---------- TESTE VALOR COMPRA (SET)
	    @Test
	    public void testSetValor_compra() {
	    	BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setValor_compra(10.00);
	    }
	    @Test
	    public void testSetValorCompraComMockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        double valorCompraEsperado = 8.5;
	        bebidaMock.setValor_compra(valorCompraEsperado);
	        verify(bebidaMock).setValor_compra(valorCompraEsperado);
	    }
	    
	    // ========== TESTE VALOR VENDA    
	    // ---------- TESTE VALOR VENDA	(GET)
	    @Test
	    public void testGetValorVenda() {
	    	BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();								// Criação de uma instância de Bebida
	        double valorVendaEsperado = 15.0;							// Definição de um valor de venda para a bebida
	        bebida.setValor_venda(valorVendaEsperado);
	        double valorVendaObtido = bebida.getValor_venda();			// Chamada do método que queremos testar
	        assertEquals(valorVendaEsperado, valorVendaObtido, 0.01); 	// Verificação do resultado; Usando uma margem de erro para comparação de valores de ponto flutuante
	    }
	    @Test
	    public void testGetValorVenda_Mockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        double valorVendaEsperado = 15.0;
	        when(bebidaMock.getValor_venda()).thenReturn(valorVendaEsperado);
	        double valorVendaObtido = bebidaMock.getValor_venda();
	        assertEquals(valorVendaEsperado, valorVendaObtido, 0.01);
	    }
	    // ---------- TESTE VALOR VENDA (SET)
	    @Test
	    public void testSetValor_venda() {
	    	BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setValor_venda(15.00);
	    }
	    @Test
	    public void testSetValorVenda_Mockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        double valorVendaEsperado = 15.0;
	        bebidaMock.setValor_venda(valorVendaEsperado);
	        verify(bebidaMock).setValor_venda(valorVendaEsperado);
	    }
	    
	    // ========== TESTE TIPO
	    // ---------- TESTE TIPO (GET)
	    @Test
	    public void testGetTipo() {
	    	BebidaMutanteScalarVariableReplacement2 suco = new BebidaMutanteScalarVariableReplacement2();
	        suco.setTipo("Suco Natural");
	        assertEquals("Suco Natural", suco.getTipo());
	    }
	    @Test
	    public void testGetTipoComMockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        String tipoEsperado = "Suco Natural";
	        when(bebidaMock.getTipo()).thenReturn(tipoEsperado);
	        String tipoObtido = bebidaMock.getTipo();
	        assertEquals(tipoEsperado, tipoObtido);
	    }
	    // ---------- TESTE TIPO (SET)
	    @Test
	    public void testSetTipo() {
	    	BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setTipo("Cerveja");
	        assertEquals("Cerveja", bebida.getTipo());
	    }
	    @Test
	    public void testSetTipoComMockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        String tipoEsperado = "Cerveja";
	        bebidaMock.setTipo(tipoEsperado);
	        verify(bebidaMock).setTipo(tipoEsperado);
	    }
	    
	    // ========== TESTE FG_ATIVO
	    // ---------- TESTE FG_ATIVO (GET)
	    @Test
	    public void testGetFg_ativo() {
	    	BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setFg_ativo(1);
	        assertEquals(1, bebida.getFg_ativo());
	    } // Este teste verifica se o método getFg_ativo() retorna o valor correto quando o atributo fg_ativo da classe Bebida é definido.
	    
	    @Test
	    public void testGetFgAtivoComMockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        int fgAtivoEsperado = 1;
	        when(bebidaMock.getFg_ativo()).thenReturn(fgAtivoEsperado);
	        int fgAtivoObtido = bebidaMock.getFg_ativo();
	        assertEquals(fgAtivoEsperado, fgAtivoObtido);
	    }
	    
	    // ---------- TESTE FG_ATIVO (SET)
	    @Test
	    public void testSetFg_ativo() {
	    	BebidaMutanteScalarVariableReplacement2 bebida = new BebidaMutanteScalarVariableReplacement2();
	        bebida.setFg_ativo(1);
	        assertEquals(1, bebida.getFg_ativo());
	    } // Este teste verifica se o método setFg_ativo() altera o valor do atributo fg_ativo da classe Bebida corretamente.
	    @Test
	    public void testSetFgAtivoComMockito() {
	    	BebidaMutanteScalarVariableReplacement2 bebidaMock = mock(BebidaMutanteScalarVariableReplacement2.class);
	        int fgAtivoEsperado = 1;
	        bebidaMock.setFg_ativo(fgAtivoEsperado);
	        verify(bebidaMock).setFg_ativo(fgAtivoEsperado);
	    }
	    
	    // ========== TESTE FUNCIONAL
	    
	    @Test
	    public void CriarBebida1() {
	    	BebidaMutanteScalarVariableReplacement2 refrigerante = new BebidaMutanteScalarVariableReplacement2();

	        // Definindo os valores dos atributos
	        refrigerante.setNome("Coca-Cola");
	        refrigerante.setDescricao("Refrigerante de cola");
	        refrigerante.setQuantidade(20);
	        refrigerante.setValor_compra(2.10);
	        refrigerante.setValor_venda(3.00);
	        refrigerante.setTipo("Refrigerante");
	        refrigerante.setFg_ativo(1);

	        // Verificando os valores dos atributos
	        Double valorCompra = refrigerante.getValor_compra();
	        Double valorVenda = refrigerante.getValor_venda();
	        assertEquals("Coca-Cola", refrigerante.getNome());
	        assertEquals("Refrigerante de cola", refrigerante.getDescricao());
	        assertEquals(20, refrigerante.getQuantidade());
	        assertEquals(valorCompra, refrigerante.getValor_compra());
	        assertEquals(valorVenda, refrigerante.getValor_venda());
	        assertEquals("Refrigerante", refrigerante.getTipo());
	        assertEquals(1, refrigerante.getFg_ativo());
	    }
	    

	    
	    @Test
	    public void CriarBebida2() {
	        // Cria um objeto da classe Bebida
	    	BebidaMutanteScalarVariableReplacement2 refrigerante  = new BebidaMutanteScalarVariableReplacement2();

	        // Atribui valores aos atributos
	        refrigerante.setId_bebida(1);
	        refrigerante.setNome("Fanta");
	        refrigerante.setDescricao("Fanta Laranja");
	        refrigerante.setQuantidade(15);
	        refrigerante.setValor_compra(1.50);
	        refrigerante.setValor_venda(2.00);
	        refrigerante.setTipo("Refrigerante");
	        refrigerante.setFg_ativo(1);

	        // Verifica se os valores dos atributos foram alterados
	        Double valorCompra = refrigerante.getValor_compra();
	        Double valorVenda = refrigerante.getValor_venda();
	        assertEquals(1, refrigerante.getId_bebida());
	        assertEquals("Fanta", refrigerante.getNome());
	        assertEquals("Fanta Laranja", refrigerante.getDescricao());
	        assertEquals(15, refrigerante.getQuantidade());
	        assertEquals(valorCompra, refrigerante.getValor_compra());
	        assertEquals(valorVenda, refrigerante.getValor_venda());
	        assertEquals("Refrigerante", refrigerante.getTipo());
	        assertEquals(1, refrigerante.getFg_ativo());
	    }

}
