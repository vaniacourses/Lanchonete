package DAO;
import java.util.List;
  
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import Model.Cliente;
import Model.Endereco;

class DaoClienteTest {
	private Endereco endereco; 
	private Cliente cliente;
    private DaoCliente daoCliente;

    @BeforeEach
	void setUp() throws Exception {
        daoCliente = new DaoCliente();
	}

	@Test
	void testSalvar() {
        endereco = new Endereco("A", "A", 1, "Complemento", "Cidade", "RJ");
		cliente = new Cliente("Nome Do Cliente", "Sobrenome", "5521123456789", "Username", "Senha", 1, endereco);

		daoCliente.salvar(cliente);

		Cliente clienteSalvo = daoCliente.pesquisaPorUsuario(cliente);

        // Asserts to verify if the client was saved correctly
        assertEquals(cliente.getNome(), clienteSalvo.getNome());
	}

	@Test
	void testListarTodos() throws Exception {
		endereco = new Endereco("Rua A", "A", 1, "Complemento", "Cidade", "RJ");
		cliente = new Cliente("Joao", "Santos", "123456", "joao.santos", "password1", 1, endereco);
		daoCliente.salvar(cliente);

		endereco = new Endereco("Av. B", "B", 1, "Complemento Maria", "Cidade Maria", "SP");
		cliente = new Cliente("Maria", "Silva", "789012", "maria.silva", "password2", 1, endereco);
		daoCliente.salvar(cliente);

        List<Cliente> result = daoCliente.listarTodos();
        Cliente cliente1 = result.get(0);
        assertEquals("Joao", cliente1.getNome());
        assertEquals("Santos", cliente1.getSobrenome());
        assertEquals("123456", cliente1.getTelefone());
        assertEquals("joao.santos", cliente1.getUsuario());
        assertEquals(1, cliente1.getFgAtivo());

        Cliente cliente2 = result.get(1);
        assertEquals("Maria", cliente2.getNome());
        assertEquals("Silva", cliente2.getSobrenome());
        assertEquals("789012", cliente2.getTelefone());
        assertEquals("maria.silva", cliente2.getUsuario());
        assertEquals(1, cliente2.getFgAtivo());
    }
}