package DAO;

import org.junit.Test;
import static org.junit.Assert.*;

public class DaoBebidaTest {
	
	@Test
	public void SalvarTest() {
		Bebida bebida = new Bebida("Refrigerante", "Lata 350ml", 10, 5.0, "Sim");
		SalvarBebidas salvarBebidas = new SalvarBebidas();
		salvarBebidas.salvar(bebida);
	}
	
	@Test
	public void alterarTest() {
		Bebida bebida = new Bebida(1, "Suco", "Suco Caixinha 200ml", 10, 5.0, "Sim", "Sim");
		AlterarBebidas alterarBebidas = new AlterarBebidas();
		alterarBebidas.alterar(bebida);
	}
	
	@Test
	public void testPesquisaBebida() {
		Bebida bebidaResultado = new Bebida();
		PesquisaBebidas pesquisaBebidas = new PesquisaBebidas();
		bebidaResultado = pesquisaBebidas.pesquisaPorNome("Suco");
	}
	
	       
}
