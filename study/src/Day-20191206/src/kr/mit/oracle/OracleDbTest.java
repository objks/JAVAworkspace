package kr.mit.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class OracleDbTest extends DBConnection {
	
	public static void main(String[] args) {		
	
	PreparedStatement pstmt=null;
	ResultSet rs= null;
	Connection conn=null;
	
	try {	
		System.out.println("1");
		conn=DBConnection.getConnection();
		System.out.println("2");
		// 2. ���� ����
		String query = "SELECT * FROM emp";
		pstmt = conn.prepareStatement(query);
		System.out.println("3");
		// 3. ���� ����
		rs = pstmt.executeQuery();
		System.out.println("4");
		// 4. ���� ��� ó��
		System.out.println("������ȣ | �����̸� | ���� | ������ | �Ի��� | ���� | ���� | �μ���ȣ");
		System.out.println("==================================================");
		
		while(rs.next()) {	// for ������ �����Ͱ� �� ������ �˾ƾ��ϱ� ������ while �������� ����Ѵ�
			// 1. �÷� ������ ����ϴ� ��� 
			// int empno = rs.getInt("empno");
			// 2. ��ȣ�� ���
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			java.sql.Date hiredate = rs.getDate(5);	// ��¥
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);
			
			String result = empno+" "+ename+ " " + job + " " + mgr + " " + hiredate + " " + sal + " " + comm + " " + deptno;
			System.out.println(result);
		}		
		
	} catch (SQLException se) {
		System.out.println("Ŀ�������� ���� �߻��߽��ϴ�.");
		se.printStackTrace();
	} finally {
		// 5. ���� ���� ����
		try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
}

}