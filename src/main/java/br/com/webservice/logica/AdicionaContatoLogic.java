package br.com.webservice.logica;

import br.com.webservice.servlet.AdicionaContatoServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis.silva
 */
public class AdicionaContatoLogic implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        AdicionaContatoServlet adiciona = new AdicionaContatoServlet();
        adiciona.getClass();

        return "/WEB-INF/jsp/adiciona-contato.jsp";

    }

}
