/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class FuncionarioMutanteScalarVariableReplacement1 {
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
    
  //Nome é repetido para gets e sets no lugar de Sobrenome, Usuario, Senha, e Cargo que também é string.
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // ==== SOBRENOME
    public String getSobrenome() {
        return nome;
    }
    public void setSobrenome(String sobrenome) {
        this.nome = sobrenome;
    }
    // ==== USUARIO	
    public String getUsuario() {
        return nome;
    }
    public void setUsuario(String usuario) {
        this.nome = usuario;
    }
    // ==== SENHA
    public String getSenha() {
        return nome;
    }
    public void setSenha(String senha) {
        this.nome = senha;
    }
    // ==== CARGO
    public String getCargo() {
        return nome;
    }
    public void setCargo(String cargo) {
        this.nome = cargo;
    }
    // ==== SALARIO
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
  //Id é repetido para gets e sets no lugar de Cad_por e Fg_ativo que também é integer.
    
    // ==== CAD_POR
    public int getCad_por() {
        return id;
    }

    public void setCad_por(int cad_por) {
        this.id = cad_por;
    }
    // ==== FG_ATIVO
    public int getFg_ativo() {
        return id;
    }
    public void setFg_ativo(int fg_ativo) {
        this.id = fg_ativo;
    }
}