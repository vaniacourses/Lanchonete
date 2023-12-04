package Model;

import static org.junit.Assert.*;
import org.junit.Test;

public class EnderecoMutanteScalarVariableReplacement2Test {

	
	// ========== TESTE ENDERECO COM INFORMACOES PADROES
    @Test
    public void testEnderecoPadrao() {
    	EnderecoMutanteScalarVariableReplacement2 endereco = new EnderecoMutanteScalarVariableReplacement2("Rua A", "Bairro A", 10, "Complemento", "Cidade", "Estado");
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
    	EnderecoMutanteScalarVariableReplacement2 endereco = new EnderecoMutanteScalarVariableReplacement2();
        endereco.setId_endereco(1);
        assertEquals(1, endereco.getId_endereco());
    }

	// ========== TESTE RUA
    @Test
    public void testGetSetRua() {
    	EnderecoMutanteScalarVariableReplacement2 endereco = new EnderecoMutanteScalarVariableReplacement2();
        endereco.setRua("Av. Gal. Milton Tavares de Souza");
        assertEquals("Av. Gal. Milton Tavares de Souza", endereco.getRua());
    }

	// ========== TESTE BAIRRO
    @Test
    public void testGetSetBairro() {
    	EnderecoMutanteScalarVariableReplacement2 endereco = new EnderecoMutanteScalarVariableReplacement2();
        endereco.setBairro("São Domingos");
        assertEquals("São Domingos", endereco.getBairro());
    }
    
	// ========== TESTE NUM
    @Test
    public void testGetSetNumero() {
    	EnderecoMutanteScalarVariableReplacement2 endereco = new EnderecoMutanteScalarVariableReplacement2();
        endereco.setNumero(1);
        assertEquals(1, endereco.getNumero());
    }

	// ========== TESTE COMPLEMENTO
    @Test
    public void testGetSetComplemento() {
    	EnderecoMutanteScalarVariableReplacement2 endereco = new EnderecoMutanteScalarVariableReplacement2();
        endereco.setComplemento("-");
        assertEquals("-", endereco.getComplemento());
    }

	// ========== TESTE CIDADE
    @Test 
    public void testGetSetCidade() {
    	EnderecoMutanteScalarVariableReplacement2 endereco = new EnderecoMutanteScalarVariableReplacement2();
        endereco.setCidade("Niterói");
        assertEquals("Niterói", endereco.getCidade());
    }

	// ========== TESTE ESTADO
    @Test
    public void testGetSetEstado() {
    	EnderecoMutanteScalarVariableReplacement2 endereco = new EnderecoMutanteScalarVariableReplacement2();
        endereco.setEstado("RJ");
        assertEquals("RJ", endereco.getEstado());
    }

	// ========== TESTE IGUALDADE
    @Test
    public void testEquality() {
    	EnderecoMutanteScalarVariableReplacement2 enderecoEq1 = new EnderecoMutanteScalarVariableReplacement2();
        enderecoEq1.setId_endereco(1);
        enderecoEq1.setRua("Rua A");
        enderecoEq1.setBairro("SaoDomingos");
        enderecoEq1.setCidade("Niteroi");
        enderecoEq1.setEstado("RJ");

        EnderecoMutanteScalarVariableReplacement2 enderecoEq2 = new EnderecoMutanteScalarVariableReplacement2();
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
    	EnderecoMutanteScalarVariableReplacement2 enderecoIn1 = new EnderecoMutanteScalarVariableReplacement2();
        enderecoIn1.setId_endereco(1);
        enderecoIn1.setRua("Rua A");
        enderecoIn1.setBairro("Centro");
        enderecoIn1.setCidade("Niteroi");
        enderecoIn1.setEstado("RJ");

        EnderecoMutanteScalarVariableReplacement2 enderecoIn2 = new EnderecoMutanteScalarVariableReplacement2();
        enderecoIn2.setId_endereco(2);
        enderecoIn2.setRua("Rua A");
        enderecoIn2.setBairro("Inga");
        enderecoIn2.setCidade("Niteroi");
        enderecoIn1.setEstado("RJ");

        assertNotEquals(enderecoIn1, enderecoIn2);

        
    }
}

