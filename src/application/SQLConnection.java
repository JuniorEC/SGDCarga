package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {
	public static Connection Connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:Login.sqlite");
			return conn;
		} catch (Exception e) {
			return null;
		}

	}

}
