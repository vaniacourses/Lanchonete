/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// -*- coding: utf-8 -*-
package Model;

/**
 *
 * @author gabriel
 */
public class RelatorioBebidasMutanteScalarVariableReplacement2 {
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
    
  //Cliente repetido para gets e sets no lugar de nomeBebida, que tambm  string.

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    public String getNomeBebida() {
        return nomeBebida;
    }
    
    public void setNomeBebida(String nomeBebida) {
        this.cliente = nomeBebida;
    }
  // IdPedido  repetido para get e set no lugar de Quantidade que tambm  integer.
    
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.idPedido = quantidade;
    }

    
    public float getCustoBebidas() {
        return custoBebidas;
    }
    
    public void setCustoBebidas(float custoBebidas) {
        this.custoBebidas = custoBebidas;
    }
  //CustoBebidas  repetido para gets e sets de VendaBebidas,LucroBebidas, TotalCustoBebidas, TotalVendaBebidas, TotalLucroBebidas  que tambm  float.

    
    public float getVendaBebidas() {
        return vendaBebidas;
    }
    
    public void setVendaBebidas(float vendaBebidas) {
        this.custoBebidas = vendaBebidas;
    }

    public float getLucroBebidas() {
        return lucroBebidas;
    }

    public void setLucroBebidas(float lucroBebidas) {
        this.custoBebidas = lucroBebidas;
    }

    
    public float getTotalCustoBebidas() {
        return totalCustoBebidas;
    }
    
    public void setTotalCustoBebidas(float totalCustoBebidas) {
        this.custoBebidas = totalCustoBebidas;
    }

   
    public float getTotalVendaBebidas() {
        return totalVendaBebidas;
    }
    
    public void setTotalVendaBebidas(float totalVendaBebidas) {
        this.custoBebidas = totalVendaBebidas;
    }

    
    public float getTotalLucroBebidas() {
        return totalLucroBebidas;
    }
    
    public void setTotalLucroBebidas(float totalLucroBebidas) {
        this.custoBebidas = totalLucroBebidas;
    }
}
