/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.DaoCliente;
import DAO.DaoEndereco;
import Model.Cliente;
import Model.Endereco;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author kener_000
 */
@WebServlet(name = "cadastro", urlPatterns = {"/cadastro"})
public class cadastro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Seta o tipo de Conteudo que será recebido, nesse caso, um JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        //Pra receber JSONs, é necessario utilizar esse Buffer pra receber os dados,
        //Então tem que ser Feito assim:
        try (BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));){
        String json = "";
        
        //Aqui ele checa se os Dados não tão vazios, por motivos de vai que
        if (br != null) {
            
            //Converte os dados do JSON pra um Formato de Objeto que o Java consiga lidar
            json = br.readLine();
            byte[] bytes = json.getBytes(ISO_8859_1); 
            String jsonStr = new String(bytes, UTF_8);            
            JSONObject dados = new JSONObject(jsonStr);
            
            JSONObject end = dados.getJSONObject("endereco");
            String rua = end.getString("rua");
            String bairro = end.getString("bairro");
            int numero = end.getInt("numero");
            String complemento = end.getString("complemento");
            String cidade = end.getString("cidade");
            String estado = end.getString("estado");
            
            //Aqui, ele Instancia um objeto do Model endereco, e Popula ele com os dados do JSON
			Endereco endereco = new Endereco(rua, bairro, numero, complemento, cidade,estado);
            
			JSONObject usr= dados.getJSONObject("usuario");
			String nome = usr.getString("nome");
            String sobrenome = usr.getString("sobrenome");
            String telefone = usr.getString("telefone");
            String usuario = usr.getString("usuario");
            String senha = usr.getString("senha");
            
            //Aqui, ele Instancia um objeto do Model Cliente, e Popula ele com os dados do JSON
            Cliente cliente = new Cliente(nome, sobrenome, telefone, usuario, senha, 1, endereco);
            
            
            //E Para finalizar, salva no Banco usando o DAO deles           
            DaoCliente clienteDAO = new DaoCliente();
            clienteDAO.salvar(cliente);
            
        }
        
        
        
        try (PrintWriter out = response.getWriter()) {
            
            //Aqui é onde a Resposta é mandada para o Cliente, dando um Feedback de que tudo deu certo.
            out.println("Usuário Cadastrado!");

        }
    } catch(Exception e){
        throw new RuntimeException(e);
    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
