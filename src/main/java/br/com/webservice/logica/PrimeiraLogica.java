package br.com.webservice.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis.silva
 */
public class PrimeiraLogica implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        System.out.println("Executando lógica...");

        System.out.println("Retornando o nome da página JSP...");
        return "/WEB-INF/jsp/primeira-logica.jsp";
    }

}
