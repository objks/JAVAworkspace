package chap08_interface_review;

public class ClassAm {
	// �ʵ�
	MariaDB db;
	

	public ClassAm(MariaDB maria) {
		db = maria;
	}
	
	public void insert() {
		db.insert();
	}
	
	public void select() {
		db.select();
	}
}
