package chap08_interface_review;

public class ClassA {
	// �ʵ�
	OracleDB db = new OracleDB();
		
	public void insert() {
		db.insert();
	}
	
	public void select() {
		db.select();
	}
}
