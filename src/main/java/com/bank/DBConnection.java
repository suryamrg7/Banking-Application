package com.bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con = null;

	static Connection get() {
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rishi", "rishi");
			con = DriverManager.getConnection("jdbc:mysql:thin:@localhost:1521:xe", "root", "123@Rishi");
			return con;
		} catch (Exception e) {
			return null;
		}
	}
}
