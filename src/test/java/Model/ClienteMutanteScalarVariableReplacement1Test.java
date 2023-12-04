package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ClienteMutanteScalarVariableReplacement1Test {

	
	// ========== TESTE CLIENTE COM INFORMACOES PADROES
    @Test
    public void testClientePadrao() {
    	Endereco enderecoMock = mock(Endereco.class);
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1("Nome Do Cliente", "Sobrenome", "5521123456789", "Username", "Senha", 1, enderecoMock);
        assertEquals("Nome Do Cliente", cliente.getNome());
        assertEquals("Sobrenome", cliente.getSobrenome());
        assertEquals("5521123456789", cliente.getTelefone());
        assertEquals("Username", cliente.getUsuario());
        assertEquals("Senha", cliente.getSenha());
        assertEquals(enderecoMock, cliente.getEndereco());
    }

    @Test
    public void testGetSetIdCliente() {
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1();
        cliente.setIdCliente(1);
        assertEquals(1, cliente.getIdCliente());
    }

    @Test
    public void testGetSetNome() {
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1();
        cliente.setNome("Evandro");
        assertEquals("Evandro", cliente.getNome());
    }

    @Test
    public void testGetSetSobrenome() {
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1();
        cliente.setSobrenome("Mauricio");
        assertEquals("Mauricio", cliente.getSobrenome());
    }

    @Test
    public void testGetSetTelefone() {
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1();
        cliente.setTelefone("21991328474");
        assertEquals("21991328474", cliente.getTelefone());
    }

    @Test
    public void testGetSetUsuario() {
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1();
        cliente.setUsuario("EvandroMauricio");
        assertEquals("EvandroMauricio", cliente.getUsuario());
    }

    @Test
    public void testGetSetSenha() {
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1();
        cliente.setSenha("minhasenha");
        assertEquals("minhasenha", cliente.getSenha());
    }

    @Test
    public void testGetSetFgAtivo() {
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1();
        cliente.setFgAtivo(1);
        assertEquals(1, cliente.getFgAtivo());
    }

    @Test
    public void testGetSetEndereco() {
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1();
        Endereco endereco = new Endereco();
        cliente.setEndereco(endereco);
        assertEquals(endereco, cliente.getEndereco());
    }

    @Test
    public void testResumo() {
        ClienteMutanteScalarVariableReplacement1 cliente = new ClienteMutanteScalarVariableReplacement1();
        cliente.setNome("Evandro");
        cliente.setSobrenome("Mauricio");
        cliente.setTelefone("21991328474");
        cliente.setUsuario("EvandroMauricio");
        cliente.setSenha("minhasenha");

        String expectedResumo = "Nome: Evandro Mauricio <br>Telefone: 21991328474 <br>Usuario: EvandroMauricio <br>Senha: minhasenha";

        assertEquals(expectedResumo, cliente.resumo());
    }

    // Add more test methods for other functionalities

}
