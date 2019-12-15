package Selenium.basics;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. call setup method to create connection between selenium and DB
		
		DBUtilities.setupConnection();
		DBUtilities.runQuery();
		DBUtilities.closeConnection();
	}

}
