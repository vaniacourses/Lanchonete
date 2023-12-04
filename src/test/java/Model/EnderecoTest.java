package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EnderecoTest {

	
	// ========== TESTE ENDERECO COM INFORMACOES PADROES
    @Test
    public void testEnderecoPadrao() {
        Endereco endereco = new Endereco("Rua A", "Bairro A", 10, "Complemento", "Cidade", "Estado");
        assertEquals("Rua A", endereco.getRua());
        assertEquals("Bairro A", endereco.getBairro());
        assertEquals(10, endereco.getNumero());
        assertEquals("Complemento", endereco.getComplemento());
        assertEquals("Cidade", endereco.getCidade());
        assertEquals("Estado", endereco.getEstado());
    }
    
	// ========== TESTE ID ENDERECO
    @Test
    public void testGetSetIdEndereco() {
        Endereco endereco = new Endereco();
        endereco.setId_endereco(1);
        assertEquals(1, endereco.getId_endereco());
    }

	// ========== TESTE RUA
    @Test
    public void testGetSetRua() {
        Endereco endereco = new Endereco();
        endereco.setRua("Av. Gal. Milton Tavares de Souza");
        assertEquals("Av. Gal. Milton Tavares de Souza", endereco.getRua());
    }

	// ========== TESTE BAIRRO
    @Test
    public void testGetSetBairro() {
        Endereco endereco = new Endereco();
        endereco.setBairro("São Domingos");
        assertEquals("São Domingos", endereco.getBairro());
    }
    
	// ========== TESTE NUM
    @Test
    public void testGetSetNumero() {
        Endereco endereco = new Endereco();
        endereco.setNumero(1);
        assertEquals(1, endereco.getNumero());
    }

	// ========== TESTE COMPLEMENTO
    @Test
    public void testGetSetComplemento() {
        Endereco endereco = new Endereco();
        endereco.setComplemento("-");
        assertEquals("-", endereco.getComplemento());
    }

	// ========== TESTE CIDADE
    @Test 
    public void testGetSetCidade() {
        Endereco endereco = new Endereco();
        endereco.setCidade("Niterói");
        assertEquals("Niterói", endereco.getCidade());
    }

	// ========== TESTE ESTADO
    @Test
    public void testGetSetEstado() {
        Endereco endereco = new Endereco();
        endereco.setEstado("RJ");
        assertEquals("RJ", endereco.getEstado());
    }

	// ========== TESTE IGUALDADE
    @Test
    public void testEquality() {
        Endereco enderecoEq1 = new Endereco();
        enderecoEq1.setId_endereco(1);
        enderecoEq1.setRua("Rua A");
        enderecoEq1.setBairro("SaoDomingos");
        enderecoEq1.setCidade("Niteroi");
        enderecoEq1.setEstado("RJ");

        Endereco enderecoEq2 = new Endereco();
        enderecoEq2.setId_endereco(1);
        enderecoEq2.setRua("Rua A");
        enderecoEq2.setBairro("SaoDomingos");
        enderecoEq2.setCidade("Niteroi");
        enderecoEq2.setEstado("RJ");
        
        assertEquals(enderecoEq1.getId_endereco(), enderecoEq2.getId_endereco());
        assertEquals(enderecoEq1.getRua(), enderecoEq2.getRua());
        assertEquals(enderecoEq1.getBairro(),enderecoEq2.getBairro());
        assertEquals(enderecoEq1.getCidade(), enderecoEq2.getCidade());
        assertEquals(enderecoEq1.getEstado(), enderecoEq2.getEstado());
        
    }

	// ========== TESTE DESIGUALDADE
    @Test
    public void testInequality() {
        Endereco enderecoIn1 = new Endereco();
        enderecoIn1.setId_endereco(1);
        enderecoIn1.setRua("Rua A");
        enderecoIn1.setBairro("Centro");
        enderecoIn1.setCidade("Niteroi");
        enderecoIn1.setEstado("RJ");

        Endereco enderecoIn2 = new Endereco();
        enderecoIn2.setId_endereco(2);
        enderecoIn2.setRua("Rua A");
        enderecoIn2.setBairro("Inga");
        enderecoIn2.setCidade("Niteroi");
        enderecoIn1.setEstado("RJ");

        assertNotEquals(enderecoIn1, enderecoIn2);

        
    }
}

