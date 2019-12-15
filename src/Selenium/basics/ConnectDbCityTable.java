package Selenium.basics;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDbCityTable {

	
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet resultSet;
	
	private static String dbURL = "jdbc:postgresql://localhost:5432/dvdrental";
	private static String dbUserName = "postgres";
	private static String dbPassword = "root";
	private static String dbQuery = "select * from public.city";
	private static String dbQuerycountry = "select * from public.country";
	private static String dbQueryfilm_actor = "select * from public.film_actor";
	
	
	
	
	public static void setupConnection() {

		try {
			conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void runQuery() {

		try {
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(dbQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.printf("%-10s %-10s %-10s\n", "city_id", "city", "last_update");

		try {
			while (resultSet.next()) {
				System.out.printf("%-10s %-10s %-10s\n", resultSet.getString("city_id"),
						resultSet.getString("city"), resultSet.getString("last_update"));
				
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//country
		System.out.println("\n-----------coountry---------\n");
		try {
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(dbQuerycountry);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.printf("%-10s %-10s %-10s\n", "coountry_id", "country", "last_update");

		
		try {
			while (resultSet.next()) {
				System.out.printf("%-10s %-10s %-10s\n", resultSet.getString("country_id"),
						resultSet.getString("country"), resultSet.getString("last_update"));
				
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//film actor
		
		System.out.println("\n-----------film actor---------\n");
		try {
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(dbQueryfilm_actor);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.printf("%-10s %-10s %-10s\n", "actor_id", "film_id", "last_update");

		
		try {
			while (resultSet.next()) {
				System.out.printf("%-10s %-10s %-10s\n", resultSet.getString("actor_id"),
						resultSet.getString("film_id"), resultSet.getString("last_update"));
				
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		

	}
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. call setup method to create connection between selenium and DB
		
		ConnectDbCityTable.setupConnection();
		ConnectDbCityTable.runQuery();
		ConnectDbCityTable.closeConnection();
	}


}
