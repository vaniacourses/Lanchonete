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
public class RelatorioGastosMutanteScalarVariableReplacement2 {
    private float custo;
    private float venda;
    private float lucro;

    
    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
    
  //Custo é repetido para gets e sets de Venda e Lucro que também são float.

  
    public float getVenda() {
        return venda;
    }
    
    public void setVenda(float venda) {
        this.custo = venda;
    }

    
    public float getLucro() {
        return lucro;
    }
    
    public void setLucro(float lucro) {
        this.custo = lucro;
    }
    
}
