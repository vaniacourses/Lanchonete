/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. */

package Model;

public class EnderecoMutanteScalarVariableReplacement2 {
    
    private int id_endereco;
    private String rua;
    private String bairro;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;

    public EnderecoMutanteScalarVariableReplacement2(String rua, String bairro, int numero, String complemento ,String cidade, String estado ) {
    	this.rua = rua;
    	this.bairro = bairro;
    	this.numero = numero;
    	this.complemento = complemento;
    	this.cidade= cidade;
		this.estado= estado; 
	}

	public EnderecoMutanteScalarVariableReplacement2() {
	}

	public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getRua() {
        return rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }

    

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.rua = bairro;
    }
   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.id_endereco = numero;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.rua = complemento;
    }
    

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.rua = cidade;
    }
    

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.rua = estado;
    }
    
}