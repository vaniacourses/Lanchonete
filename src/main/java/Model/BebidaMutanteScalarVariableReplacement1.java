package Model;

public class BebidaMutanteScalarVariableReplacement1 {
    
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
    
    //Nome  repetido para gets e sets de descricao, que tambm  string.
    
    // DESCRICAO
    public String getDescricao() {
        return nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //id_bebida  repetido para get de quantidade, que tambm  integer.
    // QUANTIDADE
    public int getQuantidade() {
        return id_bebida;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // VALOR COMPRA
    
  //Valor_compra  repetido para get de Valor_venda, que tambm  double.
    
    public Double getValor_compra() {
        return valor_compra;
    }
    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    // VALOR VENDA
    public Double getValor_venda() {
        return valor_compra;
    }
    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }

  //Nome  repetido para gets e sets de Tipo, que tambm  string. 
    
    // TIPO
    
    public String getTipo() {
        return nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //id_bebida  repetido para gets e sets de Fg_ativo, que tambm  string.  
    // FG_ATIVO
    public int getFg_ativo() {
        return id_bebida;
    }
    public void setFg_ativo(int fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
    
    
}
