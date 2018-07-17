package br.com.webservice.servlet;

import br.com.webservice.dao.PessoaDAO;
import br.com.webservice.model.Pessoa;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis.silva
 */
@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException, ParseException, Exception {

        response.setContentType("text/html;charset=UTF-8");

        //busca o writer
        PrintWriter out = response.getWriter();
        //buscando o parametro do request
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");

        //pegando a date em string e convertendo para Date.
        String dataNascimento = request.getParameter("dataNascimento");
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);

        // monta um objeto pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setEndereco(endereco);
        pessoa.setEmail(email);
        pessoa.setDataNascimento(data);

        //salvar contato
        PessoaDAO dao = new PessoaDAO();
        dao.salvar(pessoa);

        // chamada ao RequestDispatcher para chamar o arquivo.jsp e passar a mensagem.
        RequestDispatcher rd = request
                .getRequestDispatcher("mvc?logica=ListaContatosLogic");
        rd.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            processRequest(request, response);

        } catch (ParseException ex) {

            Logger.getLogger(AdicionaContatoServlet.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(AdicionaContatoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            processRequest(request, response);

        } catch (ParseException ex) {

            Logger.getLogger(AdicionaContatoServlet.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(AdicionaContatoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {

        return "Short description";
    }

}
