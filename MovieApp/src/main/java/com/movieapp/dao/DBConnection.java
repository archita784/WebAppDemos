package com.movieapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	static Connection connection;
	public static Connection openconnection() {
		try {
			String Sql = "create table Movie(title varchar(20),movieId integer primary key,language varchar(20),genre varchar(20),discription varchar(20),director varchar(20),actor varchar(20),duration integer,rating integer)";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String username = "system";
			String password = "2020";
			connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement=connection.prepareStatement(Sql);
			//statement.execute();
			statement.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeconnection() {
		if (connection != null)
			try {
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		System.out.println("closeConnection");
	}


}
