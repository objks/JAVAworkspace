package kr.mit.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection dbConn;

	public static Connection getConnection() {
		dbConn = null;
		
		try {
			String url = "Jdbc:oracle:thin:@localhost:1521:xe";
			String Id = "scott";
			String Pass = "tiger";

			// 1. �������� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			dbConn = DriverManager.getConnection(url, Id, Pass);	
			
			System.out.println("�����ͺ��̽��� ���������� �����\n");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("��� ����̹� �ε� ���� : " + cnfe.toString());
		} catch(SQLException se) {
			System.out.println("��� ���� ���� : " + se.toString());
		} catch(Exception e) {
			System.out.println("���� ������ �𸣰ھ��.");
			e.printStackTrace();
		} 
		
		return dbConn;
		
	}

}