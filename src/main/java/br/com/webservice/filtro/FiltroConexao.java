package br.com.webservice.filtro;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author luis.silva
 */
@WebFilter("/*")
public class FiltroConexao {

    public void doFilter(ServletRequest request,
            ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        try {
            EntityManagerFactory factory = null;
            EntityManager entityManager = null;

            factory = Persistence.createEntityManagerFactory("hibernatejpa");

            // pendura a conection na requisição
            entityManager = factory.createEntityManager();

            request.setAttribute("entityManager", entityManager);

            chain.doFilter(request, response);

            entityManager.close();

        } catch (Exception e) {

            throw new ServletException(e);

        }

    }

}
