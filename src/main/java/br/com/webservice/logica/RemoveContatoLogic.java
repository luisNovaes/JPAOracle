package br.com.webservice.logica;

import br.com.webservice.dao.PessoaDAO;
import br.com.webservice.model.Pessoa;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis.silva
 */
public class RemoveContatoLogic implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        long id = Long.parseLong(req.getParameter("id"));

        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);

        PessoaDAO dao = new PessoaDAO();
        dao.excluir(id);

        System.out.println("Excluindo contato...");

        return "mvc?logica=ListaContatosLogic";
    }

}
