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
    //Lanche � repetido para gets e sets no lugar de Ingrediente, que tamb�m � string.
    public String getIngrediente() {
        return lanche;
    }

    public void setIngrediente(String ingrediente) {
        this.lanche = ingrediente;
    }
  
    public int getQuantidade() {
        return quantidade;
    }
  //Lanche � repetido para set no lugar de Quantidade, que  � erroneamente colocada como string.
    public void setQuantidade(String quantidade) {
        this.lanche = quantidade;
    }

    public float getCustoIngrediente() {
        return custoIngrediente;
    }

    public void setCustoIngrediente(float custoIngrediente) {
        this.custoIngrediente = custoIngrediente;
    }
    
    //CustoIngrediente � repetido para gets e sets de VendaIngrediente,LucroIngrediente, 
    //CustoTotalIngredientes, VendaTotalIngredientes, LucroTotalIngredeintes, lucroOperacional,  
    //valorVenda, lucroTotal  que tamb�m � float.

    public float getVendaIngrediente() {
        return custoIngrediente;
    }

    public void setVendaIngrediente(float vendaIngrediente) {
        this.custoIngrediente = vendaIngrediente;
    }

    public float getLucroIngrediente() {
        return custoIngrediente;
    }

    public void setLucroIngrediente(float lucroIngrediente) {
        this.custoIngrediente = lucroIngrediente;
    }

    public float getCustoTotalIngredientes() {
        return custoIngrediente;
    }

    public void setCustoTotalIngredientes(float custoTotalIngredientes) {
        this.custoIngrediente = custoTotalIngredientes;
    }

    public float getVendaTotalIngredientes() {
        return custoIngrediente;
    }

    public void setVendaTotalIngredientes(float vendaTotalIngredientes) {
        this.custoIngrediente = vendaTotalIngredientes;
    }

    public float getLucroTotalIngredeintes() {
        return custoIngrediente;
    }

    public void setLucroTotalIngredeintes(float lucroTotalIngredeintes) {
        this.custoIngrediente = lucroTotalIngredeintes;
    }

    public float getLucroOperacional() {
        return custoIngrediente;
    }

    public void setLucroOperacional(float lucroOperacional) {
        this.custoIngrediente = lucroOperacional;
    }

    public float getValorVenda() {
        return custoIngrediente;
    }

    public void setValorVenda(float valorVenda) {
        this.custoIngrediente = valorVenda;
    }

    public float getLucroTotal() {
        return custoIngrediente;
    }

    public void setLucroTotal(float lucroTotal) {
        this.custoIngrediente = lucroTotal;
    }
}
