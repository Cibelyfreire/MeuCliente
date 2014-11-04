package br.unifor.MeuCliente.test;

import junit.framework.TestCase;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

public class ConnectionFactoryTest extends TestCase {

	@Test
	public void testGetConnectionSucessoNaConexao() throws SQLException {
		Connection conexao = ConnectionFactory.getConnection();
		Assert.assertNotNull("Objeto deveria retornar uma conexão com o BD",
				conexao);
	}

	@Test
	public void testQuantidadeDeConexoesNoPoll() {
		Integer quantidade = ConnectionFactory.getPool()
				.getTotalCreatedConnections();
		Assert.assertTrue("Deveria ter criado pelo menos 3 conexões",
				quantidade >= 3);
	}

	@Test
	public void testComportamentoDoPollQuandoAlocadoMaisDeTresConexoes()
			throws SQLException {
		Connection conn1 = ConnectionFactory.getConnection();
		Connection conn2 = ConnectionFactory.getConnection();
		Connection conn3 = ConnectionFactory.getConnection();
		Connection conn4 = ConnectionFactory.getConnection();

		Integer quantidade = ConnectionFactory.getTotalConexoes();
		System.out.println(quantidade);
		Assert.assertTrue("Deveria ter criado pelo menos 4 conexões",
				quantidade >= 4);

		conn1.close();
		conn2.close();
		System.out.println("Qtda conexoes livres: "
				+ ConnectionFactory.getTotalFree());
		System.out.println("Qtda conexoes alocadas: "
				+ ConnectionFactory.getTotalLeased());

	}
}
