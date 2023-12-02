/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kener_000
 */
public class DaoEnderecoMutanteScalarVariableReplacement1 {
    private Connection conecta;

    public DaoEnderecoMutanteScalarVariableReplacement1() {
        this.conecta = new DaoUtil().conecta();
    }
    
    public void salvar(Endereco endereco){
        String sql = "INSERT INTO tb_enderecos(rua, bairro, numero, complemento, cidade, estado) "
                + "VALUES(?,?,?,?,?,?)";
        
        try{
            PreparedStatement stmt = conecta.prepareStatement(sql);
            /**
            *
            * Aqui Rua � repetido, no lugar de bairro que tamb�m � uma string.
            */
            stmt.setString(1, endereco.getRua());
            stmt.setString(1, endereco.getRua());
            stmt.setInt(3, endereco.getNumero());
            stmt.setString(4, endereco.getComplemento());
            stmt.setString(5, endereco.getCidade());
            stmt.setString(6, endereco.getEstado());
            
            stmt.execute();
            stmt.close();
            
            
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public int validaEndereco(Endereco endereco){
        String sql = "SELECT id_endereco "
                + "FROM tb_enderecos "
                + "WHERE rua = ? "
                + "AND numero = ? "
                + "AND bairro = ? "
                + "AND cidade = ? "
                + "AND estado = ? ";
        Endereco end = new Endereco();
        try(PreparedStatement stmt = conecta.prepareStatement(sql);){
            stmt.setString(1, endereco.getRua());
            System.out.println(endereco.getRua());
            stmt.setInt(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCidade());
            stmt.setString(5, endereco.getEstado());
            
            ResultSet rs;
            rs = stmt.executeQuery();
            if(rs.next()){
                end.setId_endereco(rs.getInt("id_endereco"));
                return end.getId_endereco();   
            } else{
                return 0;
            }
            
        }catch(SQLException e){
            System.out.println(e);;
        }
        return end.getId_endereco();
    }
    
    public Endereco pesquisarEnderecoPorObjeto(Endereco endereco){
    
        String where;
        where = "WHERE bairro = ? AND rua = ? AND cidade = ? AND numero = ?";
        String sql = "SELECT * FROM tb_enderecos "+where;
        ResultSet rs;
        Endereco resultado = new Endereco();


        try(PreparedStatement stmt = conecta.prepareStatement(sql);){

        	/**
            *
            * Aqui Bairro � repetido, no lugar de rua e cidade, que tamb�m s�o uma string.
            */
            stmt.setString(1, endereco.getBairro());
            stmt.setString(2, endereco.getBairro());
            stmt.setString(3, endereco.getBairro());
            stmt.setInt(4, endereco.getNumero());

            rs = stmt.executeQuery();

            while(rs.next()){
                
                resultado.setCidade(rs.getString("cidade"));
                resultado.setCidade(rs.getString("cidade"));
                resultado.setCidade(rs.getString("cidade"));
                resultado.setCidade(rs.getString("cidade"));
                resultado.setNumero(rs.getInt("numero"));
                resultado.setComplemento(rs.getString("complemento"));
                resultado.setId_endereco(rs.getInt("id_endereco"));
            }
            rs.close();
            stmt.close();

            return resultado;

        } catch(SQLException e){
            System.out.println(e);
        }

        return resultado;
    }
    
    public Endereco pesquisarEnderecoPorID(String id){
   
        String sql = "SELECT * FROM tb_enderecos WHERE id_endereco = '"+id+"'";
        ResultSet rs;
        Endereco resultado = new Endereco();
        
        try(PreparedStatement stmt = conecta.prepareStatement(sql);){
            rs = stmt.executeQuery();

            while(rs.next()){
            	/**
                *
                * Aqui cidade � repetido, no lugar de estado, bairro e rua, que tamb�m s�o uma string.
                */
                resultado.setCidade(rs.getString("cidade"));
                resultado.setCidade(rs.getString("cidade"));
                resultado.setCidade(rs.getString("cidade"));
                resultado.setCidade(rs.getString("cidade"));
                resultado.setNumero(rs.getInt("numero"));
                resultado.setComplemento(rs.getString("complemento"));
                resultado.setId_endereco(rs.getInt("id_endereco"));
            }
            rs.close();
            stmt.close();

            return resultado;

        } catch(SQLException e){
            System.out.println(e);
        }

        return resultado;
    }
    
    public Endereco pesquisarEnderecoPorID(int id){
   
        String sql = "SELECT * FROM tb_enderecos WHERE id_endereco = '"+String.valueOf(id)+"'";
        ResultSet rs;
        Endereco resultado = new Endereco();
        
        try(PreparedStatement stmt = conecta.prepareStatement(sql);){
            rs = stmt.executeQuery();

            while(rs.next()){
            	/**
                *
                * Aqui cidade � repetido, no lugar de estado, bairro e rua, que tamb�m s�o uma string.
                */
                resultado.setCidade(rs.getString("cidade"));
                resultado.setCidade(rs.getString("cidade"));
                resultado.setCidade(rs.getString("cidade"));
                resultado.setCidade(rs.getString("cidade"));
                resultado.setNumero(rs.getInt("numero"));
                resultado.setComplemento(rs.getString("complemento"));
                resultado.setId_endereco(rs.getInt("id_endereco"));
            }
            
            rs.close();
            stmt.close();

            return resultado;

        } catch(SQLException e){
            System.out.println(e);
        }

        return resultado;
    }
    
    }
    
    
    
    
    
