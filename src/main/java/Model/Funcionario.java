/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Funcionario {
    private int id;
    private String nome;
    private String sobrenome;
    private String usuario;
    private String senha;
    private String cargo;
    private Double salario;
    private int cad_por;
    private int fg_ativo;

    // ==== ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // ==== NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // ==== SOBRENOME
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    // ==== USUARIO	
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    // ==== SENHA
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    // ==== CARGO
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    // ==== SALARIO
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    // ==== CAD_POR
    public int getCad_por() {
        return cad_por;
    }

    public void setCad_por(int cad_por) {
        this.cad_por = cad_por;
    }
    // ==== FG_ATIVO
    public int getFg_ativo() {
        return fg_ativo;
    }
    public void setFg_ativo(int fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
}
