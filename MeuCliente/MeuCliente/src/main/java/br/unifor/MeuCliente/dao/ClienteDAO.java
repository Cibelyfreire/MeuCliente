package br.unifor.MeuCliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.unifor.MeuCliente.entity.Cliente;


public class ClienteDAO {
public void inserir(Cliente cliente) {
		
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "insert into cliente (nome_cliente, codigo_cliente, endereco_cliente, tipofornecedor_cliente) values (?)";
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, cliente.getNome());
			pstm.setInt(2, cliente.getCodigo());
			pstm.setString(3, cliente.getEndereco());
			pstm.setString(4, cliente.getTipofornecedor());
			
			pstm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível inserir o cliente, tente novamente!");
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
	
	public Cliente buscarPorNomeETipoFornecedor(String nome, String tipofornecedor) {
		
		Connection connection = null;
		Cliente cliente = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "select codigo_cliente, nome_cliente, tipo_fornecedor from cliente where nome_cliente = ?";
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, nome);
			
			ResultSet result = pstm.executeQuery();
			if(result.next()) {
				cliente = new Cliente();
				cliente.setCodigo(result.getInt("codigo_cliente"));
				cliente.setNome(result.getString("nome_cliente"));
				cliente.setTipofornecedor(result.getString("tipo_fornecedor"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("NÃ£o foi possÃ­vel inserir o pais, tente novamente!");
		} finally {
			try {
				if(connection != null && connection.isClosed()) {
					connection.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cliente;
		
	}

}



