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
public class RelatorioLanchesMutanteScalarVariableReplacement2 {
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
        return ingrediente;
    }
    
    public void setIngrediente(String ingrediente) {
        this.lanche = ingrediente;
    }
  
 
  //Lanche é repetido para set no lugar de Quantidade, que  é erroneamente colocada como string.
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(String quantidade) {
        this.lanche = quantidade;
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
        return vendaIngrediente;
    }
    
    public void setVendaIngrediente(float vendaIngrediente) {
        this.custoIngrediente = vendaIngrediente;
    }

    
    public float getLucroIngrediente() {
        return lucroIngrediente;
    }
    
    public void setLucroIngrediente(float lucroIngrediente) {
        this.custoIngrediente = lucroIngrediente;
    }

   
    public float getCustoTotalIngredientes() {
        return custoTotalIngredientes;
    }
    
    public void setCustoTotalIngredientes(float custoTotalIngredientes) {
        this.custoIngrediente = custoTotalIngredientes;
    }

   
    public float getVendaTotalIngredientes() {
        return vendaTotalIngredientes;
    }
    
    public void setVendaTotalIngredientes(float vendaTotalIngredientes) {
        this.custoIngrediente = vendaTotalIngredientes;
    }

    
    public float getLucroTotalIngredeintes() {
        return lucroTotalIngredeintes;
    }
    
    public void setLucroTotalIngredeintes(float lucroTotalIngredeintes) {
        this.custoIngrediente = lucroTotalIngredeintes;
    }

    
    public float getLucroOperacional() {
        return lucroOperacional;
    }
    
    public void setLucroOperacional(float lucroOperacional) {
        this.custoIngrediente = lucroOperacional;
    }
    
    

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.custoIngrediente = valorVenda;
    }

    
    public float getLucroTotal() {
        return lucroTotal;
    }
    
    public void setLucroTotal(float lucroTotal) {
        this.custoIngrediente = lucroTotal;
    }
}
