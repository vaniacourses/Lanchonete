package model;

import org.junit.jupiter.api.Test;

import src.java.Model.Endereco;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;



public class testEndereco {
	

	/**
	 *
	 * @author Daniel Lucas
	 */
		@Test
		public void criacaoendereco() {
		    try {
		    	Endereco endereco = new Endereco();
		    } catch (Exception e) {
		        fail("Unexpected exception was thrown");
		    }
		}
		@Test
		public void insercaodeidendereco() {
			Endereco endereco = new Endereco();
			endereco.setId_endereco(0);
			assertEquals(0, endereco.getId_endereco());
		}
		@Test
		public void insercaoderua() {
			Endereco endereco = new Endereco();
			endereco.setRua("Avenida Rio Branco");
			assertEquals("Avenida Rio Branco", endereco.getRua());
		}
		@Test
		public void insercaodebairro() {
			Endereco endereco = new Endereco();
			endereco.setBairro("Copacabana");
			assertEquals("Copacabana", endereco.getBairro());
		}
		@Test
		public void insercaodenumero() {
			Endereco endereco = new Endereco();
			endereco.setNumero(100);
			assertEquals(100, endereco.getNumero());
		}
		@Test
		public void insercaodecomplemento() {
			Endereco endereco = new Endereco();
			try {
				 endereco.setComplemento(4);
			}
			finally {
				assertEquals(4, endereco.getComplemento());
			}
		}
		@Test
		public void insercaodecidade() {
			Endereco endereco = new Endereco();
			endereco.setCidade("Niterói");
			assertEquals("Niterói", endereco.getCidade());
		}
		@Test
		public void insercaodeestado() {
			Endereco endereco = new Endereco();
			endereco.setEstado("RJ");
			assertEquals("RJ", endereco.getEstado());
		}
		@Test
		public void obtencaodeidendereco() {
			Endereco endereco = new Endereco();
			assertEquals(0, endereco.getId_endereco());
		}
		@Test
		public void obtencaoderua() {
			Endereco endereco = new Endereco();
			assertEquals(null, endereco.getRua());
		}
		@Test
		public void obtencaodebairro() {
			Endereco endereco = new Endereco();
			assertEquals(null, endereco.getBairro());
		}
		@Test
		public void obtencaodenumero() {
			Endereco endereco = new Endereco();
			assertEquals(0, endereco.getNumero());
		}
		@Test
		public void obtencaodecomplemento() {
			Endereco endereco = new Endereco();
			assertEquals(null, endereco.getComplemento());
		}
		@Test
		public void obtencaodecidade() {
			Endereco endereco = new Endereco();
			assertEquals(null, endereco.getCidade());
		}
		@Test
		public void obtencaodeestado() {
			Endereco endereco = new Endereco();
			assertEquals(null, endereco.getEstado());
		}
		
		@Test
		public void alteracaodeidendereco() {
			Endereco endereco = new Endereco();
			endereco.setId_endereco(0);
			endereco.setId_endereco(10);
			assertEquals(10, endereco.getId_endereco());
		}
		@Test
		public void alteracaoderua() {
			Endereco endereco = new Endereco();
			endereco.setRua("Avenida Rio Branco");
			endereco.setRua("Avenida Brasil");
			assertEquals("Avenida Brasil", endereco.getRua());
		}
		@Test
		public void alteracaodebairro() {
			Endereco endereco = new Endereco();
			endereco.setBairro("Copacabana");
			endereco.setBairro("Barra da Tijuca");
			assertEquals("Barra da Tijuca", endereco.getBairro());
		}
		@Test
		public void alteracaodenumero() {
			Endereco endereco = new Endereco();
			endereco.setNumero(100);
			endereco.setNumero(200);
			assertEquals(200, endereco.getNumero());
		}
		@Test
		public void alteracaodecomplemento() {
			Endereco endereco = new Endereco();
		    endereco.setComplemento(4);
		    endereco.setComplemento(9);
			assertEquals(9, endereco.getComplemento());
		}
		@Test
		public void alteracaodecidade() {
			Endereco endereco = new Endereco();
			endereco.setCidade("Niterói");
			endereco.setCidade("São Gonçalo");
			assertEquals("São Gonçalo", endereco.getCidade());
		}
		@Test
		public void alteracaodeestado() {
			Endereco endereco = new Endereco();
			endereco.setEstado("RJ");
			endereco.setEstado("MG");
			assertEquals("MG", endereco.getEstado());
		}
		
		

		
	}

