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
public class LancheMutanteScalarVariableReplacement1 {

    public LancheMutanteScalarVariableReplacement1(String xSalada, double par) {
    }
    private int id_lanche;
    private String nome;
    private String descricao;
    private Double valor_venda;
    private int fg_ativo;
    private Double valor_lanche;
    private int quantidade;

    public int getId_lanche() {
        return id_lanche;
    }

    public void setId_lanche(int id_lanche) {
        this.id_lanche = id_lanche;
    }
  //Nome � repetido para gets e sets no lugar de Descricao, que tamb�m � string.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor_venda() {
        return valor_venda;
    }
    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }

    //Id_lanche � repetido para get e set no lugar de Fg_ativo que tamb�m � integer.
    public int getFg_ativo() {
        return id_lanche;
    }
    public void setFg_ativo(int fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
   
    //Valor_venda � repetido para gets e sets de Valor_lanche, que tamb�m � double.
    public Double getValor_lanche() {
        return valor_venda;
    }
    public void setValor_lanche(Double valor_lanche) {
        this.valor_lanche = valor_lanche;
    }

   
  //Id_lanche � repetido para get e set no lugar de quantidade que tamb�m � integer.
     public int getQuantidade() {
        return id_lanche;
    }
     public void setQuantidade(int quantidade) {
         this.quantidade = quantidade;
     }	
   

    
}
