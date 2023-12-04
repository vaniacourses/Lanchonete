package Model;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class PedidoTest {

    private Pedido pedido;
    private Cliente cliente;

    @BeforeEach
    public void iniciar() {
        pedido = new Pedido();
        cliente = mock(Cliente.class);
    }

    @Test
    public void testeSetIdPedido() {
        pedido.setId_pedido(1);
        assertEquals(1, pedido.getId_pedido());
    }

    @Test
    public void testeSetCliente() {
        pedido.setCliente(cliente);
        assertEquals(cliente, pedido.getCliente());
    }

    @Test
    public void testeSetDataPedido() {
        pedido.setData_pedido("2023-12-01");
        assertEquals("2023-12-01", pedido.getData_pedido());
    }

    @Test
    public void testeSetValorTotal() {
        pedido.setValor_total(100.0);
        assertEquals(100.0, pedido.getValor_total(), 0.001);
    }

    @Test
    public void testeSetIdPedidoMockCliente() {
        pedido.setCliente(cliente);
        pedido.setId_pedido(2);
        assertEquals(2, pedido.getId_pedido());
    }

    @Test
    public void testeSetClienteMockCliente() {
        pedido.setCliente(cliente);
        assertEquals(cliente, pedido.getCliente());
    }

    @Test
    public void testeSetDataPedidoMockCliente() {
        pedido.setCliente(cliente);
        pedido.setData_pedido("2023-12-02");
        assertEquals("2023-12-02", pedido.getData_pedido());
    }

    @Test
    public void testeSetValueTotalMockCliente() {
        pedido.setCliente(cliente);
        pedido.setValor_total(150.0);
        assertEquals(150.0, pedido.getValor_total(), 0.001);
    }
}

