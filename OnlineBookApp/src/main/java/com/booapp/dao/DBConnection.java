package com.booapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	static Connection connection;

	public static Connection openconnection() {
		try {
			String Sql = "create table Book(title varchar(20),bookId integer primary key,author varchar(20),category varchar(20),price decimal)";
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
