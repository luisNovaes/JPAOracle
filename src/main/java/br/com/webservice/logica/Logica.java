package br.com.webservice.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luis.silva
 */
public interface Logica {

    String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception;

}
