package br.com.webservice.teste;

import br.com.webservice.model.Pessoa;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author luis.silva
 */
/**
 * Classe utilizada para testar os métodos do PessoaDAO.
 */
public class PessoaDAOTeste {

    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luis Novaes");
        Calendar data = new GregorianCalendar();
        data.set(Calendar.YEAR, 1983);
        data.set(Calendar.MONTH, 11);
        data.set(Calendar.DAY_OF_MONTH, 26);
        //pessoa.setDataNascimento(data.getTime());
        pessoa.setEmail("luismagnovaes@gmail.com");
        pessoa.setEndereco("Rua da paz, número150");

        //PessoaDAO dao = new PessoaDAO();
        System.out.println("Salvando a pessoa: " + pessoa.getNome());
        // pessoa = dao.salvar(pessoa);

        pessoa.setNome("Luis Novaes");
        // pessoa = dao.salvar(pessoa);
        System.out.println("Alterando a pessoa: " + pessoa.getNome());

       // Pessoa pessoa2 = dao.consultarPorId(pessoa.getId());
        //System.out.println("Consultando: " + pessoa2.getNome());
//        System.out.println("Removendo a pessoa: " + pessoa.getId());
//        dao.excluir(pessoa.getId());
    }
}
