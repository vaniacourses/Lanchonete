package Model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class ClienteTest {

	
	// ========== TESTE ENDERECO COM INFORMACOES PADROES
    @Test
    public void testEnderecoPadrao() {
    	Endereco enderecoMock = mock(Endereco.class);
        Cliente cliente = new Cliente("Nome Do Cliente", "Sobrenome", "5521123456789", "Username", "Senha", 1, enderecoMock);
        assertEquals("Nome Do Cliente", cliente.getNome());
        assertEquals("Sobrenome", cliente.getSobrenome());
        assertEquals("5521123456789", cliente.getTelefone());
        assertEquals("Username", cliente.getUsuario());
        assertEquals("Senha", cliente.getSenha());
        assertEquals(enderecoMock, cliente.getEndereco());
    }

    @Test
    public void testGetSetIdCliente() {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        assertEquals(1, cliente.getIdCliente());
    }

    @Test
    public void testGetSetNome() {
        Cliente cliente = new Cliente();
        cliente.setNome("Evandro");
        assertEquals("Evandro", cliente.getNome());
    }

    @Test
    public void testGetSetSobrenome() {
        Cliente cliente = new Cliente();
        cliente.setSobrenome("Mauricio");
        assertEquals("Mauricio", cliente.getSobrenome());
    }

    @Test
    public void testGetSetTelefone() {
        Cliente cliente = new Cliente();
        cliente.setTelefone("21991328474");
        assertEquals("21991328474", cliente.getTelefone());
    }

    @Test
    public void testGetSetUsuario() {
        Cliente cliente = new Cliente();
        cliente.setUsuario("EvandroMauricio");
        assertEquals("EvandroMauricio", cliente.getUsuario());
    }

    @Test
    public void testGetSetSenha() {
        Cliente cliente = new Cliente();
        cliente.setSenha("minhasenha");
        assertEquals("minhasenha", cliente.getSenha());
    }

    @Test
    public void testGetSetFgAtivo() {
        Cliente cliente = new Cliente();
        cliente.setFgAtivo(1);
        assertEquals(1, cliente.getFgAtivo());
    }

    @Test
    public void testGetSetEndereco() {
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        cliente.setEndereco(endereco);
        assertEquals(endereco, cliente.getEndereco());
    }

    @Test
    public void testResumo() {
        Cliente cliente = new Cliente();
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
