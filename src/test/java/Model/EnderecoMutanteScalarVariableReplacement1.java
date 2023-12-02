/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. */

package Model;

public class EnderecoMutanteScalarVariableReplacement1 {
    
    private int id_endereco;
    private String rua;
    private String bairro;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;

    public EnderecoMutanteScalarVariableReplacement1(String rua, String bairro, int numero, String complemento ,String cidade, String estado ) {
    	this.rua = rua;
    	this.bairro = bairro;
    	this.numero = numero;
    	this.complemento = complemento;
    	this.cidade= cidade;
		this.estado= estado; 
	}

	public EnderecoMutanteScalarVariableReplacement1() {
	}

	public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

  //Rua é repetido  para gets e sets  no lugar de Bairro que também é string.
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return rua;
    }

    public void setBairro(String bairro) {
        this.rua = bairro;
    }
  //Id_endereco é repetido  no lugar para gets e sets de Numero que também é integer.

    public int getNumero() {
        return id_endereco;
    }

    public void setNumero(int numero) {
        this.id_endereco = numero;
    }

    //Rua é repetido para gets e sets  no lugar de Complemento, Cidade e Estado que também é string.
    
    public String getComplemento() {
        return rua;
    }

    public void setComplemento(String complemento) {
        this.rua = complemento;
    }

    public String getCidade() {
        return rua;
    }

    public void setCidade(String cidade) {
        this.rua = cidade;
    }

    public String getEstado() {
        return rua;
    }

    public void setEstado(String estado) {
        this.rua = estado;
    }
}
