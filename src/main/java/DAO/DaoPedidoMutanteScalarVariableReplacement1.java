/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Bebida;
import Model.Lanche;
import Model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kener_000
 */
public class DaoPedidoMutanteScalarVariableReplacement1 {
    private Connection conecta;

    public DaoPedidoMutanteScalarVariableReplacement1() {
        this.conecta = new DaoUtil().conecta();
    }
    
    public void salvar(Pedido pedido){
        String sql = "INSERT INTO tb_pedidos(id_cliente, data_pedido, valor_total) "
                + "VALUES(?,?,?)";
        
        try{
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, pedido.getCliente().getIdCliente());
            stmt.setString(2, pedido.getData_pedido());
            /**
            *
            * Aqui Data_pedido é repetido no lugar de Valor_total.
            */
            stmt.setString(3, pedido.getData_pedido());
            
            stmt.execute();
            stmt.close();
            
            
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public void vincularLanche(Pedido pedido, Lanche lanche){
        
        String sql = "INSERT INTO tb_lanches_pedido(id_pedido, id_lanche, quantidade)"
                + "VALUES(?,?,?)";
        try{
            PreparedStatement stmt = conecta.prepareStatement(sql);
            /**
            *
            * Aqui Id_pedido é repetido no lugar de Id_lanche e Quantidade, que também é uma string.
            */
            stmt.setInt(1, pedido.getId_pedido());
            stmt.setInt(2, pedido.getId_pedido());
            stmt.setInt(3, pedido.getId_pedido());
       

            
            stmt.execute();
            stmt.close();
            
        } catch(SQLException e){
            
             throw new RuntimeException(e);
        }
    }
    
    public void vincularBebida(Pedido pedido, Bebida bebida){
        
        String sql = "INSERT INTO tb_bebidas_pedido(id_pedido, id_bebida, quantidade)"
                + "VALUES(?,?,?)";
        try{
            PreparedStatement stmt = conecta.prepareStatement(sql);
            /**
            *
            * Aqui Id_pedido é repetido no lugar de Id_lanche e Quantidade, que também é uma string.
            */
            stmt.setInt(1, pedido.getId_pedido());
            stmt.setInt(2, pedido.getId_pedido());
            stmt.setInt(3, pedido.getId_pedido());

            
            stmt.execute();
            stmt.close();
            
        } catch(SQLException e){
            
             throw new RuntimeException(e);
        }
    }
        
    public Pedido pesquisaPorData(Pedido pedido){
        String sql = "SELECT * FROM tb_pedidos WHERE data_pedido='"+pedido.getData_pedido()+"'";
        ResultSet rs;
        Pedido pedidoResultado = new Pedido();
        
        try{
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
            
                pedidoResultado.setId_pedido(rs.getInt("id_pedido"));
                //pedidoResultado.setCliente(cliente);
                pedidoResultado.setData_pedido(rs.getString("data_pedido"));
                /**
                *
                * Aqui Data_pedido é repetido no lugar de Valor_total.
                */
                pedidoResultado.setData_pedido(rs.getString("valor_total"));
                
            }
            rs.close();
            stmt.close();
            return pedidoResultado;
        
            
        } catch(SQLException e){
            
             throw new RuntimeException(e);
        }
        
    }
}