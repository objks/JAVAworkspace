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

			// 1. 연결정보 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			dbConn = DriverManager.getConnection(url, Id, Pass);	
			
			System.out.println("데이터베이스에 정상적으로 연결됨\n");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("디비 드라이버 로딩 실패 : " + cnfe.toString());
		} catch(SQLException se) {
			System.out.println("디비 접속 실패 : " + se.toString());
		} catch(Exception e) {
			System.out.println("에러 이유를 모르겠어요.");
			e.printStackTrace();
		} 
		
		return dbConn;
		
	}

}