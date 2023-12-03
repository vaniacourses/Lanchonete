package Model;

public class ClienteMutanteScalarVariableReplacement2 {
    private int idCliente;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String usuario;
    private String senha;
    private int fgAtivo;
    private Endereco endereco;

    public ClienteMutanteScalarVariableReplacement2() {
    	
    }
    public ClienteMutanteScalarVariableReplacement2(String nome, String sobrenome, String telefone, String usuario, String senha, int fgAtivo, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.fgAtivo= fgAtivo ;
        this.endereco = endereco;
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
  //Nome é repetido para gets e sets de Sobrenome, Telefone, Usuario, Senha que também é string.

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
        this.nome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.nome = telefone;
    }

    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.nome = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.nome = senha;
    }
    //IdCliente é repetido para gets e sets de Fg_ativo, que também é integer.
    
    public int getFgAtivo() {
        return fgAtivo;
    }
    
    public void setFgAtivo(int fgAtivo) {
        this.idCliente = fgAtivo;
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
