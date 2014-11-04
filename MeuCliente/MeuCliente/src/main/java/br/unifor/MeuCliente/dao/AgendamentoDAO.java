package br.unifor.MeuCliente.dao;


	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.unifor.MeuCliente.entity.Agendamento;
	
	public class AgendamentoDAO {
		
		public void inserir(Agendamento agendamento) {
			
			Connection connection = null;
			try {
				connection = ConnectionFactory.getConnection();
				String sql = "insert into agendamento (data_visita) values (?)";
				PreparedStatement pstm = connection.prepareStatement(sql);
				pstm.setInt(1, agendamento.getDataVisita());
				
				pstm.execute();
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Não foi possível inserir o data da visita, tente novamente!");
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
		
		public Agendamento buscarPorDataVisita(Integer dataVisita) {
			
			Connection connection = null;
			Agendamento agendamento = null;
			try {
				connection = ConnectionFactory.getConnection();
				String sql = "select data_visita, data_ultima_visita from agendamento where data_visita = ?";
				PreparedStatement pstm = connection.prepareStatement(sql);
				pstm.setInt(1, dataVisita);
				
				ResultSet result = pstm.executeQuery();
				if(result.next()) {
					agendamento = new Agendamento();
					agendamento.setDataVisita(result.getInt("data_visita"));
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Não foi possível inserir o agendamento, tente novamente!");
			} finally {
				try {
					if(connection != null && connection.isClosed()) {
						connection.close();
					} 
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return agendamento;
			
		}

	}



