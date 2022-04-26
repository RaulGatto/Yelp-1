package it.polito.tdp.Yelp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class DBConnect {
	//lo vogliamo statico perche' deve essere sempre uguale
	private static HikariDataSource ds = null;	//deve essere statico per essere letto dal metodo statico
												//che lo utilizza dopo
	
	private static String url = "jdbc:mysql://localhost:3306/yelp";
	
	public static Connection getConnection() {
		//devo controllare che non esista ancora la nostra datasource
		if(ds == null) {	///singleton, voglio solamente uno di questi oggetti (e' un pattern di progr.)
			//creo nuovo data source
			ds = new HikariDataSource();
			ds.setJdbcUrl(url);
			ds.setUsername("root");
			ds.setPassword("PasswMaria");
		}
		
		try {
			//se non e' null mi restituisce la connection gia creata precedentemente
			return ds.getConnection();
		} catch (SQLException e) {
			System.out.println("ERRORE di connessione al database");
			e.printStackTrace();
			return null ;
		}
		
	}
}
