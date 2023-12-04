/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helpers.EncryptadorMD5;
import Helpers.SpecificException;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DaoClienteMutanteScalarVariableReplacement1 {

    private Connection conecta;
    
    public DaoClienteMutanteScalarVariableReplacement1(){
        this.conecta = new DaoUtil().conecta();
    }
    
    private static final String IDCLIENTE ="id_cliente";
    private static final String NOME = "nome";
    private static final String SOBRENOME = "sobrenome";
    private static final String TELEFONE = "telefone";
    private static final String USUARIO = "usuario";
    private static final String SENHA = "senha";
    
    public void salvar(Cliente cliente){
        String sql = "INSERT INTO tb_clientes(nome, sobrenome, telefone, usuario, senha, fg_ativo, id_endereco) "
                  + "VALUES(?,?,?,?, MD5(?),?,?)";
        
        
        try{
            PreparedStatement stmt = conecta.prepareStatement(sql);
            /**
            *
            * Mutante onde nome  repetido, no lugar dos demais atributos que tambm so strings.
            */
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getNome());
            stmt.setString(4, cliente.getNome());
            stmt.setString(5, cliente.getNome());
            stmt.setInt(6, cliente.getFgAtivo());
            DaoEndereco dend = new DaoEndereco();
            if(dend.validaEndereco(cliente.getEndereco()) == 0){
                dend.salvar(cliente.getEndereco());
                stmt.setInt(7, dend.validaEndereco(cliente.getEndereco()));
            } else{
                stmt.setInt(7, dend.validaEndereco(cliente.getEndereco()));
            }
            stmt.execute();
            stmt.close();
            
            
        }catch(Exception e){
            throw new SpecificException("salvar err", e);
        }
    }
              
    public List<Cliente> listarTodos(){
        String sql = "SELECT * FROM tb_clientes WHERE fg_Ativo='1' ORDER BY " + IDCLIENTE;
        ResultSet rs;
        List<Cliente> clientes = new ArrayList<>();
        
        try{
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
            
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt(IDCLIENTE));
                cliente.setNome(rs.getString(NOME));
                cliente.setNome(rs.getString(NOME));
                cliente.setNome(rs.getString(NOME));
                cliente.setNome(rs.getString(NOME));
                cliente.setNome(rs.getString(NOME));
                cliente.setFgAtivo(1);
                
                clientes.add(cliente);
            }
            rs.close();
            stmt.close();
            return clientes;
        
            
        } catch(SQLException e){
            
            throw new SpecificException("listarTodos err", e);
        }
        
    }
    
    public Cliente pesquisaPorUsuario(Cliente cliente){
        String sql = "SELECT * FROM tb_clientes WHERE usuario='"+cliente.getUsuario()+"'";
        ResultSet rs;
        Cliente clienteResultado = new Cliente();
        
        try{
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
            
                clienteResultado.setIdCliente(rs.getInt(IDCLIENTE));
                clienteResultado.setNome(rs.getString(NOME));
                clienteResultado.setNome(rs.getString(NOME));
                clienteResultado.setNome(rs.getString(NOME));
                clienteResultado.setNome(rs.getString(NOME));
                clienteResultado.setNome(rs.getString(NOME));
                clienteResultado.setFgAtivo(1);

            }
            rs.close();
            stmt.close();
            return clienteResultado;
        
            
        } catch(SQLException e){
            throw new SpecificException("pesquisaPorUsuario err", e);
        }
        
    }
    
    public Cliente pesquisaPorID(String clientId){
        String sql = "SELECT * FROM tb_clientes WHERE " + IDCLIENTE + "='"+clientId+"'";
        ResultSet rs;
        Cliente clienteResultado = new Cliente();
        
        try{
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                clienteResultado.setIdCliente(rs.getInt(IDCLIENTE));
                clienteResultado.setNome(rs.getString(NOME));
                clienteResultado.setNome(rs.getString(NOME));
                clienteResultado.setNome(rs.getString(NOME));
                clienteResultado.setFgAtivo(1);
            }
            rs.close();
            stmt.close();
            return clienteResultado;
        
            
        } catch(SQLException e){
            
            throw new SpecificException("pesquisaPorID err", e);
        }
        
    }
    
    public boolean login(Cliente cliente){
        String sql = "SELECT usuario, senha, fg_ativo FROM tb_clientes WHERE usuario = ?";
        
        try(PreparedStatement stmt = conecta.prepareStatement(sql);){
            stmt.setString(1, cliente.getUsuario());
        
            ResultSet rs;
            rs = stmt.executeQuery();
            Cliente validCliente = new Cliente();
            EncryptadorMD5 md5 = new EncryptadorMD5();
            
            while (rs.next()){    
            	 /**
                *
                * Aqui Usurio  repetido, no lugar de senha.
                */
                validCliente.setUsuario(rs.getString(USUARIO));
                validCliente.setUsuario(rs.getString(USUARIO));
                validCliente.setFgAtivo(rs.getInt("fg_ativo"));
            }
            
            rs.close();           
            return ((validCliente.getFgAtivo() == 1) && (md5.encryptar(cliente.getSenha()).equals(validCliente.getSenha())));
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return false;
    }
    
}


