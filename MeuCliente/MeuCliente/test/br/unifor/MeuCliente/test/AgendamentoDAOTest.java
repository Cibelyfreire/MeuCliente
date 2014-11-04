package br.unifor.MeuCliente.test;

import junit.framework.Assert;
import junit.framework.TestCase;
import br.unifor.MeuCliente.dao.AgendamentoDAO;
import br.unifor.MeuCliente.entity.Agendamento;

public class AgendamentoDAOTest extends TestCase {

	private AgendamentoDAO dao;

	@Before
	public void init() {
		dao = new AgendamentoDAO();
	}

	@Test
	public void testInserir() {
		Agendamento agendamento = new Agendamento();
		String dataVisita = "01/01/1900";
		agendamento.setDataVisita(dataVisita);

		dao.inserir(agendamento);

		Assert.assertNotNull(dao.buscarPorNome(dataVisita));
	}

}
