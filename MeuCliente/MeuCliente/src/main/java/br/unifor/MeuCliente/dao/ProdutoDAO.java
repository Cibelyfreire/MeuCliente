package br.unifor.MeuCliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.unifor.MeuCliente.entity.Produto;

public class ProdutoDAO {

public void inserir(Produto produto) {
		
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "insert into produto (nome_produto, referencia_produto, validade_produto, preco_produto) values (?)";
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, produto.getNome());
			pstm.setInt(2, produto.getReferencia());
			pstm.setInt(3, produto.getValidade());
			pstm.setDouble(4, produto.getPreco());
			
			pstm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível inserir o produto, tente novamente!");
		} finally {
			try {
				if(connection != null && connection.isClosed()) {
					connection.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Produto buscarPorNome(String nome) {
		
		Connection connection = null;
		Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "select referencia_produto, nome_produto from produto where nome_produto = ?";
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, nome);
			
			ResultSet result = pstm.executeQuery();
			if(result.next()) {
				produto = new Produto();
				produto.setReferencia(result.getInt("referencia_produto"));
				produto.setNome(result.getString("nome_produto"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível inserir o produto, tente novamente!");
		} finally {
			try {
				if(connection != null && connection.isClosed()) {
					connection.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return produto;
		
	}

}
