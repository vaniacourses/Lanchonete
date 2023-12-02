/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author kener_000
 */
public class PedidoMutanteScalarVariableReplacement1 {
    private int id_pedido;
    private Cliente cliente;
    private String data_pedido;
    private Double valor_total;

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public Double getValor_total() {
        return valor_total;
    }
  //Id_pedido é repetido para set no lugar de valor_total, com valor total sendo erradamente recebido como int, ao inves de double..

    public void setValor_total(int valor_total) {
        this.id_pedido = valor_total;
    }
    
    
}
