package br.com.webservice.logica;

import br.com.webservice.dao.PessoaDAO;
import br.com.webservice.model.Pessoa;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis.silva
 */
public class ListaContatosLogic implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        List<Pessoa> pessoas = new PessoaDAO().getLista();

        req.setAttribute("pessoas", pessoas);

        return "/WEB-INF/jsp/lista-contatos.jsp";
    }

}
