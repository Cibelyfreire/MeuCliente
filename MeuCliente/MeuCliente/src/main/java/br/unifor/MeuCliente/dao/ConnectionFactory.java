package br.unifor.MeuCliente.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class ConnectionFactory {
	
	private static BoneCP pool;
	private static final ConnectionFactory CONNECTION = new ConnectionFactory();
	
	private ConnectionFactory() {
		BoneCPConfig config = new BoneCPConfig();
		config.setJdbcUrl("jdbc:postgresql://localhost:5432/aulabd");
		//Precisa alterar a URl do jdbc.
		config.setUser("postgres");
		config.setPassword("postgres");
		config.setMinConnectionsPerPartition(3);
		config.setMaxConnectionsPerPartition(50);
		config.setPartitionCount(1);
		
		try {
			pool = new BoneCP(config);
		} catch (SQLException e) {
			System.out.println("Nãoo foi possível conectar!");
			System.exit(0);
		}
	}

	public static Connection getConnection() throws SQLException {
		return pool.getConnection();
	}
	
	public static BoneCP getPool() {
		return pool;
	}
	
	public static Integer getTotalConexoes(){
		return pool.getTotalCreatedConnections();
	}

}