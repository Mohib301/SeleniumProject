package Selenium.basics;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilities {

	// UI TESTING DATABASE
	
	//create static connect then will make it private
	// Creating private static obj of Connection class
		// it is used to create connection with database
		private static Connection conn;

		// Creating private static obj of Statement class
		// It is used to create a Statement to execute the query
		private static Statement stmt;

		// Creating private static obj of ResultSet class
		// It is used to create a resultset to store query result.
		private static ResultSet resultSet;

		// create db url
		// syntax for db url conection or url string
		// jdbc:typeofdatabase://host:port/databasename
		private static String dbURL = "jdbc:postgresql://localhost:5432/dvdrental";

		// databse user username
		private static String dbUserName = "postgres";

		// databse user password
		private static String dbPassword = "root";

		// sql query
		private static String dbQuery = "select * from public.actor";

		/*
		 * This method creartes connection with DB
		 */

		public static void setupConnection() {

			try {
				conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		/*
		 * This method will execute the query from DB
		 */
		public static void runQuery() {

			try {
				stmt = conn.createStatement();
				resultSet = stmt.executeQuery(dbQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.printf("%-10s %-10s %-10s\n", "Name", "Last Name", "update");

			try {
				while (resultSet.next()) {
					System.out.printf("%-10s %-10s %-10s\n", resultSet.getString("first_name"),
							resultSet.getString("last_name"), resultSet.getString("last_update"));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	
        //close the connection between the selenium and DB
		public static void closeConnection() {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
}
