package com.app.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	public static Connection getConnection() {
		Connection connection = null;

		// oracle url
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "kingcrimson";
		String password = "1234";

		// Driver Class loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DriverManager: JDBC 드라이버를 통해서 Connection을 활성화하는 Object
			connection = DriverManager.getConnection(url, userName, password);

		} catch (ClassNotFoundException e) { // Driver load Exception
			System.out.println("Driver load failed");
		} catch (SQLException e) { // Connection Exception
			System.out.println("Connection Error");
		}

		return connection;
	}
}
