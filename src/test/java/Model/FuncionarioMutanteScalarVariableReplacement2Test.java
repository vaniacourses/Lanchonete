package Model;

import static org.junit.Assert.*;
import org.junit.Test;


public class FuncionarioMutanteScalarVariableReplacement2Test {

	
    // ==== TESTE ID
    @Test
    public void testGetSetId() {
    	FuncionarioMutanteScalarVariableReplacement2 funcionario = new FuncionarioMutanteScalarVariableReplacement2();
        funcionario.setId(1);
        assertEquals(1, funcionario.getId());
    }
    
    
    // ==== TESTE NOME
    @Test
    public void testGetSetNome() {
    	FuncionarioMutanteScalarVariableReplacement2 funcionario = new FuncionarioMutanteScalarVariableReplacement2();
        funcionario.setNome("Pedro");
        assertEquals("Pedro", funcionario.getNome());
    }

    // ==== TESTE SOBRENOME
    @Test
    public void testGetSetSobrenome() {
    	FuncionarioMutanteScalarVariableReplacement2 funcionario = new FuncionarioMutanteScalarVariableReplacement2();
        funcionario.setSobrenome("Santos");
        assertEquals("Santos", funcionario.getSobrenome());
    }

    // ==== TESTE USUARIO
    @Test
    public void testGetSetUsuario() {
    	FuncionarioMutanteScalarVariableReplacement2 funcionario = new FuncionarioMutanteScalarVariableReplacement2();
        funcionario.setUsuario("pedrosantos");
        assertEquals("pedrosantos", funcionario.getUsuario());
    }

    // ==== TESTE SENHA
    @Test
    public void testGetSetSenha() {
    	FuncionarioMutanteScalarVariableReplacement2 funcionario = new FuncionarioMutanteScalarVariableReplacement2();
        funcionario.setSenha("12345");
        assertEquals("12345", funcionario.getSenha());
    }

    // ==== TESTE CARGO
    @Test
    public void testGetSetCargo() {
    	FuncionarioMutanteScalarVariableReplacement2 funcionario = new FuncionarioMutanteScalarVariableReplacement2();
        funcionario.setCargo("Gerente");
        assertEquals("Gerente", funcionario.getCargo());
    }

    // ==== TESTE SALARIO
    @Test
    public void testGetSetSalario() {
    	FuncionarioMutanteScalarVariableReplacement2 funcionario = new FuncionarioMutanteScalarVariableReplacement2();
        funcionario.setSalario(4321.0);
        assertEquals(4321.0, funcionario.getSalario(), 0.001);
    }

    // ==== TESTE CAD_POR
    @Test
    public void testGetSetCadPor() {
    	FuncionarioMutanteScalarVariableReplacement2 funcionario = new FuncionarioMutanteScalarVariableReplacement2();
        funcionario.setCad_por(123);
        assertEquals(123, funcionario.getCad_por());
    }

    // ==== TESTE FG_ATIVO
    @Test
    public void testGetSetFgAtivo() {
    	FuncionarioMutanteScalarVariableReplacement2 funcionario = new FuncionarioMutanteScalarVariableReplacement2();
        funcionario.setFg_ativo(1);
        assertEquals(1, funcionario.getFg_ativo());
    }
}
