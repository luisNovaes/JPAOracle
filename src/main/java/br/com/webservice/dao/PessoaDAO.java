package br.com.webservice.dao;

import br.com.webservice.model.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author luis.silva
 */
/**
 * Classe utilizada para fazer realizar as operaÃ§Ãµes de banco de dados sobre a
 * entity Pessoa.
 */
public class PessoaDAO {

    /**
     * MÃ©todo utilizado para obter o entity manager.
     *
     * @return
     */
    private EntityManager getEntityManager() throws Exception {
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        try {
            //ObtÃ©m o factory a partir da unidade de persistÃªncia.
            factory = Persistence.createEntityManagerFactory("hibernatejpa");
            //Cria um entity manager.
            entityManager = factory.createEntityManager();

        } finally {

        }
        return entityManager;
    }

    /**
     * MÃ©todo utilizado para salvar ou atualizar as informaÃ§Ãµes de uma
     * pessoa.
     *
     * @param pessoa
     * @return
     * @throws java.lang.Exception
     */
    public Pessoa salvar(Pessoa pessoa) throws Exception {
        EntityManager entityManager = getEntityManager();
        try {
            // Inicia uma transaÃ§Ã£o com o banco de dados.
            entityManager.getTransaction().begin();
            System.out.println("Salvando a pessoa.");
            // Verifica se a pessoa ainda nÃ£o estÃ¡ salva no banco de dados.
            if (pessoa.getId() == null) {
                //Salva os dados da pessoa.
                entityManager.persist(pessoa);
            } else {
                //Atualiza os dados da pessoa.
                pessoa = entityManager.merge(pessoa);
            }
            // Finaliza a transação.
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
        return pessoa;
    }

    /**
     * MÃ©todo que apaga a pessoa do banco de dados.
     *
     * @param id
     */
    public void excluir(Long id) throws Exception {
        EntityManager entityManager = getEntityManager();
        try {
            // Inicia uma transaÃ§Ã£o com o banco de dados.
            entityManager.getTransaction().begin();
            // Consulta a pessoa na base de dados atravÃ©s do seu ID.
            Pessoa pessoa = entityManager.find(Pessoa.class, id);
            System.out.println("Excluindo os dados de: " + pessoa.getNome());
            // Remove a pessoa da base de dados.
            entityManager.remove(pessoa);
            // Finaliza a transaÃ§Ã£o.
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Consulta o pessoa pelo ID.
     *
     * @param id
     * @return o objeto Pessoa.
     */
    public Pessoa consultarPorId(Long id) throws Exception {
        EntityManager entityManager = getEntityManager();
        Pessoa pessoa = null;
        try {
            //Consulta uma pessoa pelo seu ID.
            pessoa = entityManager.find(Pessoa.class, id);
        } finally {
            entityManager.close();
        }
        return pessoa;
    }

    public List<Pessoa> getLista() throws Exception {

        EntityManager entityManager = getEntityManager();

        Query query = entityManager.createQuery("SELECT e FROM Pessoa e");

        List<Pessoa> pessoas = query.getResultList();

        return pessoas;
    }

}
