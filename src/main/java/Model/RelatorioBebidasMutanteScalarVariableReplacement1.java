/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gabriel
 */
public class RelatorioBebidasMutanteScalarVariableReplacement1 {
    private int idPedido;
    private String cliente;
    private String nomeBebida;
    private int quantidade;
    private float custoBebidas;
    private float vendaBebidas;
    private float lucroBebidas;
    private float totalCustoBebidas;
    private float totalVendaBebidas;
    private float totalLucroBebidas;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
  //Cliente é repetido para gets e sets no lugar de nomeBebida, que também é string.

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getNomeBebida() {
        return cliente;
    }
    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

   
  // IdPedido é repetido para get e set no lugar de Quantidade que também é integer.
    
    public int getQuantidade() {
        return idPedido;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   

    public float getCustoBebidas() {
        return custoBebidas;
    }
    
    public void setCustoBebidas(float custoBebidas) {
        this.custoBebidas = custoBebidas;
    }
    
  //CustoBebidas é repetido para gets e sets de VendaBebidas,LucroBebidas, TotalCustoBebidas, TotalVendaBebidas, TotalLucroBebidas  que também é float.

    public float getVendaBebidas() {
        return custoBebidas;
    }
    public void setVendaBebidas(float vendaBebidas) {
        this.vendaBebidas = vendaBebidas;
    }

   

    public float getLucroBebidas() {
        return custoBebidas;
    }
    public void setLucroBebidas(float lucroBebidas) {
        this.lucroBebidas = lucroBebidas;
    }
    

    public float getTotalCustoBebidas() {
        return custoBebidas;
    }
    public void setTotalCustoBebidas(float totalCustoBebidas) {
        this.totalCustoBebidas = totalCustoBebidas;
    }

   

    public float getTotalVendaBebidas() {
        return custoBebidas;
    }
    public void setTotalVendaBebidas(float totalVendaBebidas) {
        this.totalVendaBebidas = totalVendaBebidas;
    }
   

    public float getTotalLucroBebidas() {
        return custoBebidas;
    }
    public void setTotalLucroBebidas(float totalLucroBebidas) {
        this.totalLucroBebidas = totalLucroBebidas;
    }
   
}
