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
public class RelatorioLanchesMutanteScalarVariableReplacement1 {
    private String lanche;
    private String ingrediente;
    private int quantidade;
    private float custoIngrediente;
    private float vendaIngrediente;
    private float lucroIngrediente;
    private float custoTotalIngredientes;
    private float vendaTotalIngredientes;
    private float lucroTotalIngredeintes;
    private float lucroOperacional;
    private float valorVenda;
    private float lucroTotal;

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }
    //Lanche é repetido para gets e sets no lugar de Ingrediente, que também é string.
    public String getIngrediente() {
        return lanche;
    }
    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

   
    //Lanche é repetido para set no lugar de Quantidade, que  é erroneamente colocada como string.
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
  

    public float getCustoIngrediente() {
        return custoIngrediente;
    }
    public void setCustoIngrediente(float custoIngrediente) {
        this.custoIngrediente = custoIngrediente;
    }
 
    
    //CustoIngrediente é repetido para gets e sets de VendaIngrediente,LucroIngrediente, 
    //CustoTotalIngredientes, VendaTotalIngredientes, LucroTotalIngredeintes, lucroOperacional,  
    //valorVenda, lucroTotal  que também é float.

    public float getVendaIngrediente() {
        return custoIngrediente;
    }
    public void setVendaIngrediente(float vendaIngrediente) {
        this.vendaIngrediente = vendaIngrediente;
    }


    public float getLucroIngrediente() {
        return custoIngrediente;
    }

    public void setLucroIngrediente(float lucroIngrediente) {
        this.lucroIngrediente = lucroIngrediente;
    }
    

    public float getCustoTotalIngredientes() {
        return custoIngrediente;
    }

    public void setCustoTotalIngredientes(float custoTotalIngredientes) {
        this.custoTotalIngredientes = custoTotalIngredientes;
    }
    

    public float getVendaTotalIngredientes() {
        return custoIngrediente;
    }
    public void setVendaTotalIngredientes(float vendaTotalIngredientes) {
        this.vendaTotalIngredientes = vendaTotalIngredientes;
    }
  

    public float getLucroTotalIngredeintes() {
        return custoIngrediente;
    }

    public void setLucroTotalIngredeintes(float lucroTotalIngredeintes) {
        this.lucroTotalIngredeintes = lucroTotalIngredeintes;
    }
    

    public float getLucroOperacional() {
        return custoIngrediente;
    }

    public void setLucroOperacional(float lucroOperacional) {
        this.lucroOperacional = lucroOperacional;
    }

    public float getValorVenda() {
        return custoIngrediente;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public float getLucroTotal() {
        return custoIngrediente;
    }
    public void setLucroTotal(float lucroTotal) {
        this.lucroTotal = lucroTotal;
    }

   
}
