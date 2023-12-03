package Model;

public class BebidaMutanteScalarVariableReplacement2 {
    
    private int id_bebida;
    private String nome;
    private String descricao;
    private int quantidade;
    private Double valor_compra;
    private Double valor_venda;
    private String tipo;
    private int fg_ativo;

    // ID BEBIDA
    public int getId_bebida() {
        return id_bebida;
    }
    public void setId_bebida(int id_bebida) {
        this.id_bebida = id_bebida;
    }

    // NOME
    public String getNome() {
    	return nome;
   
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
  //Nome é repetido para sets de descricao, que também é string.
    // DESCRICAO
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.nome = descricao;
    }

    // QUANTIDADE
    public int getQuantidade() {
        return quantidade;
    }
    //id_bebida é repetido para sets de quantidade, que também é integer.
    public void setQuantidade(int quantidade) {
        this.id_bebida = quantidade;
    }
    
  //Valor_compra é repetido para gets e sets de Valor_venda, que também é double.
    
    // VALOR COMPRA
    public Double getValor_compra() {
        return valor_compra;
    }
    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    // VALOR VENDA
    public Double getValor_venda() {
        return valor_venda;
    }
    
    
    public void setValor_venda(Double valor_venda) {
        this.valor_compra = valor_venda;
    }

    // TIPO
    public String getTipo() {
        return tipo;
    }
   
    public void setTipo(String tipo) {
        this.nome = tipo;
    }

    //Id_bebida é repetido para set de Fg_ativo, que também é integer.

    // FG_ATIVO
    public int getFg_ativo() {
        return fg_ativo;
    }
    
    public void setFg_ativo(int fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
    
    
}
