package Model;

import static org.junit.Assert.*;
import org.junit.Test;


public class FuncionarioTest {

	
    // ==== TESTE ID
    @Test
    public void testGetSetId() {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(1);
        assertEquals(1, funcionario.getId());
    }
    
    
    // ==== TESTE NOME
    @Test
    public void testGetSetNome() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        assertEquals("Pedro", funcionario.getNome());
    }

    // ==== TESTE SOBRENOME
    @Test
    public void testGetSetSobrenome() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSobrenome("Santos");
        assertEquals("Santos", funcionario.getSobrenome());
    }

    // ==== TESTE USUARIO
    @Test
    public void testGetSetUsuario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setUsuario("pedrosantos");
        assertEquals("pedrosantos", funcionario.getUsuario());
    }

    // ==== TESTE SENHA
    @Test
    public void testGetSetSenha() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSenha("12345");
        assertEquals("12345", funcionario.getSenha());
    }

    // ==== TESTE CARGO
    @Test
    public void testGetSetCargo() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("Gerente");
        assertEquals("Gerente", funcionario.getCargo());
    }

    // ==== TESTE SALARIO
    @Test
    public void testGetSetSalario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(4321.0);
        assertEquals(4321.0, funcionario.getSalario(), 0.001);
    }

    // ==== TESTE CAD_POR
    @Test
    public void testGetSetCadPor() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCad_por(123);
        assertEquals(123, funcionario.getCad_por());
    }

    // ==== TESTE FG_ATIVO
    @Test
    public void testGetSetFgAtivo() {
        Funcionario funcionario = new Funcionario();
        funcionario.setFg_ativo(1);
        assertEquals(1, funcionario.getFg_ativo());
    }
}
