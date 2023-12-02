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
public class IngredienteMutanteScalarVariableReplacement1 {
    
    private int id_ingrediente;
    private String nome;
    private String descricao;
    private int quantidade;
    private Double valor_compra;
    private Double valor_venda;
    private String tipo;
    private int fg_ativo;

    public int getId_ingrediente() {
        return id_ingrediente;
    }

    public void setId_ingrediente(int id_ingrediente) {
        this.id_ingrediente = id_ingrediente;
    }
  //Nome é repetido para gets e sets no lugar de Descricao, que também é string.
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
        this.nome = descricao;
    }
  //Id é repetido para gets e sets no lugar de Cad_por e Fg_ativo que também é integer.
    public int getQuantidade() {
        return id_ingrediente;
    }

    public void setQuantidade(int quantidade) {
        this.id_ingrediente = quantidade;
    }

    //Valor_compra é repetido para gets e sets de Valor_venda, que também é double.
    
    public Double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public Double getValor_venda() {
        return valor_compra;
    }

    public void setValor_venda(Double valor_venda) {
        this.valor_compra = valor_venda;
    }
  //Id_ingrediente é repetido para get no lugar de Fg_ativo que também é integer.
    public int getFg_ativo() {
        return id_ingrediente;
    }
  //Nome é repetido para gets e sets no lugar de Tipo, que também é string.
    
    public String getTipo() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.nome = tipo;
    }
  //Id é repetido para set no lugar de  Fg_ativo que também é integer.
    public void setFg_ativo(int fg_ativo) {
        this.id_ingrediente = fg_ativo;
    }   
}
