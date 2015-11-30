package org.yatian.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Jdbc Tools
 * 
 * @author Yatian Gao
 * 
 */
public class JdbcUtil {

	// url is a address for mysql to know which database you want to connect.
	//private String url = "jdbc:mysql://localhost:3306/jdbc_demo";
	private static String url = "jdbc:mysql:///biasfinder";
	private static String user = "root";
	private static String password = "luxiaolin12?";

	/**
	 * This method is used to create the connection between java code and mySQL.
	 */
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * This method is used to close all the connections between database software and code.
	 */
	public static void closeAll(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();  
				rs = null;  
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null && !con.isClosed()) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}










