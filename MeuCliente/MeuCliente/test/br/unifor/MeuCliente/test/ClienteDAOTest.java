package br.unifor.MeuCliente.test;

import junit.framework.Assert;
import junit.framework.TestCase;
import br.unifor.MeuCliente.dao.ClienteDAO;
import br.unifor.MeuCliente.entity.Cliente;

public class ClienteDAOTest extends TestCase {

	private ClienteDAO dao;

	@Before
	public void init() {
		dao = new ClienteDAO();
	}

	@Test
	public void testInserir() {
		Cliente cliente = new Cliente();
		String nomeCliente = "Alibaba";
		Integer codigoCliente = 9999;
		String enderecoCliente = "Rua das almofadas, 99";
		String tipofornecedorCliente = "Box";
		cliente.setNome(nomeCliente);
		cliente.setCodigo(codigoCliente);
		cliente.setEndereco(enderecoCliente);
		cliente.setTipofornecedor(tipofornecedorCliente);

		dao.inserir(cliente);

		Assert.assertNotNull(dao.buscarPorNome(nomeCliente));
		Assert.assertNotNull(dao.buscarPorCodigo(codigoCliente));
		Assert.assertNotNull(dao.buscarPorEndereco(enderecoCliente));
		Assert.assertNotNull(dao.buscarPorTipoFornecedor(tipofornecedorCliente));
	}

}
