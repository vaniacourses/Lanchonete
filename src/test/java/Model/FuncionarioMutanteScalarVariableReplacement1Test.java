package Model;

import static org.junit.Assert.*;
import org.junit.Test;


public class FuncionarioMutanteScalarVariableReplacement1Test {

	
    // ==== TESTE ID
    @Test
    public void testGetSetId() {
    	FuncionarioMutanteScalarVariableReplacement1 funcionario = new FuncionarioMutanteScalarVariableReplacement1();
        funcionario.setId(1);
        assertEquals(1, funcionario.getId());
    }
    
    
    // ==== TESTE NOME
    @Test
    public void testGetSetNome() {
    	FuncionarioMutanteScalarVariableReplacement1 funcionario = new FuncionarioMutanteScalarVariableReplacement1();
        funcionario.setNome("Pedro");
        assertEquals("Pedro", funcionario.getNome());
    }

    // ==== TESTE SOBRENOME
    @Test
    public void testGetSetSobrenome() {
    	FuncionarioMutanteScalarVariableReplacement1 funcionario = new FuncionarioMutanteScalarVariableReplacement1();
        funcionario.setSobrenome("Santos");
        assertEquals("Santos", funcionario.getSobrenome());
    }

    // ==== TESTE USUARIO
    @Test
    public void testGetSetUsuario() {
    	FuncionarioMutanteScalarVariableReplacement1 funcionario = new FuncionarioMutanteScalarVariableReplacement1();
        funcionario.setUsuario("pedrosantos");
        assertEquals("pedrosantos", funcionario.getUsuario());
    }

    // ==== TESTE SENHA
    @Test
    public void testGetSetSenha() {
    	FuncionarioMutanteScalarVariableReplacement1 funcionario = new FuncionarioMutanteScalarVariableReplacement1();
        funcionario.setSenha("12345");
        assertEquals("12345", funcionario.getSenha());
    }

    // ==== TESTE CARGO
    @Test
    public void testGetSetCargo() {
    	FuncionarioMutanteScalarVariableReplacement1 funcionario = new FuncionarioMutanteScalarVariableReplacement1();
        funcionario.setCargo("Gerente");
        assertEquals("Gerente", funcionario.getCargo());
    }

    // ==== TESTE SALARIO
    @Test
    public void testGetSetSalario() {
    	FuncionarioMutanteScalarVariableReplacement1 funcionario = new FuncionarioMutanteScalarVariableReplacement1();
        funcionario.setSalario(4321.0);
        assertEquals(4321.0, funcionario.getSalario(), 0.001);
    }

    // ==== TESTE CAD_POR
    @Test
    public void testGetSetCadPor() {
    	FuncionarioMutanteScalarVariableReplacement1 funcionario = new FuncionarioMutanteScalarVariableReplacement1();
        funcionario.setCad_por(123);
        assertEquals(123, funcionario.getCad_por());
    }

    // ==== TESTE FG_ATIVO
    @Test
    public void testGetSetFgAtivo() {
    	FuncionarioMutanteScalarVariableReplacement1 funcionario = new FuncionarioMutanteScalarVariableReplacement1();
        funcionario.setFg_ativo(1);
        assertEquals(1, funcionario.getFg_ativo());
    }
}
