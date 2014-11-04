package br.unifor.MeuCliente.test;

import junit.framework.Assert;
import junit.framework.TestCase;
import br.unifor.MeuCliente.dao.ProdutoDAO;
import br.unifor.MeuCliente.entity.Produto;

public class ProdutoDAOTest extends TestCase {


	
		
	private ProdutoDAO dao;
		
		@Before
		public void init(){
			dao = new ProdutoDAO();
		}

		@Test
		public void testInserir() {
			Produto produto = new Produto();
			String nomeProduto = "Mel azul";
			Integer referenciaProduto = 999;
			String validadeProduto = "01/01/1901";
			Double precoProduto = 0,01;
			produto.setNome(nomeProduto);
			produto.setReferencia(referenciaProduto);
			produto.setValidade(validadeProduto);
			produto.setPreco(precoProduto);
			
			dao.inserir(produto);
			
			Assert.assertNotNull(dao.buscarPorNome(nomeProduto));
			Assert.assertNotNull(dao.buscarPorReferencia(referenciaProduto));
			Assert.assertNotNull(dao.buscarPorValidade(validadeProduto));
			Assert.assertNotNull(dao.buscarPorTipoFornecedor(precoProduto));
		}
		
	}


