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
public class Cliente {
    private int idCliente;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String usuario;
    private String senha;
    private int fgAtivo;
    private Endereco endereco;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getFgAtivo() {
        return fgAtivo;
    }

    public void setFgAtivo(int fgAtivo) {
        this.fgAtivo = fgAtivo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    private static final String BREAKLINE = " <br>";
    public String resumo(){
        return "Nome: "+this.nome+" "+this.sobrenome+ BREAKLINE
                + "Telefone: "+this.telefone+ BREAKLINE
                + "Usuario: "+this.usuario+ BREAKLINE
                + "Senha: "+this.senha;
        }
    
}
