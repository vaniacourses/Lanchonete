package Model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;
public class LancheTest {

    private Lanche lanche;

    @BeforeEach
    public void iniciar() {
        lanche = new Lanche("X-Salada", 10.0); 
    }

    @Test
    public void testeSetIdLanche() {
        lanche.setId_lanche(1);
        assertEquals(1, lanche.getId_lanche());
    }

    @Test
    public void testeSetNome() {
        lanche.setNome("X-Bacon");
        assertEquals("X-Bacon", lanche.getNome());
    }

    @Test
    public void testeSetDescricao() {
        lanche.setDescricao("Bacon, alface, tomate");
        assertEquals("Bacon, alface, tomate", lanche.getDescricao());
    }

    @Test
    public void testeSetValorVenda() {
        lanche.setValor_venda(12.5);
        assertEquals(12.5, lanche.getValor_venda(), 0.001);
    }

    @Test
    public void testeSetFgAtivo() {
        lanche.setFg_ativo(1);
        assertEquals(1, lanche.getFg_ativo());
    }

    @Test
    public void testeSetValorLanche() {
        lanche.setValor_lanche(15.0);
        assertEquals(15.0, lanche.getValor_lanche(), 0.001);
    }

    @Test
    public void testeSetQuantidade() {
        lanche.setQuantidade(2);
        assertEquals(2, lanche.getQuantidade());
    }
}

