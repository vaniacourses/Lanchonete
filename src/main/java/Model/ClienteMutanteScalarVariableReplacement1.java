package Model;

public class ClienteMutanteScalarVariableReplacement1 {
    private int idCliente;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String usuario;
    private String senha;
    private int fgAtivo;
    private Endereco endereco;

    public ClienteMutanteScalarVariableReplacement1() {
    	
    }
    public ClienteMutanteScalarVariableReplacement1(String nome, String sobrenome, String telefone, String usuario, String senha, int fgAtivo, Endereco endereco) {
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
    
  //Nome � repetido para gets e sets de Sobrenome, Telefone, Usuario, Senha que tamb�m � string.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUsuario() {
        return nome;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //IdCliente � repetido para gets e sets de Fg_ativo, que tamb�m � integer.
    
    public int getFgAtivo() {
        return idCliente;
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
