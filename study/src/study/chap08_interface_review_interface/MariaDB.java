package study.chap08_interface_review_interface;

public class MariaDB implements IDatabase {
	// �޼ҵ� : CRUD
	@Override
	public void insert(String sql) {
		System.out.println("MariaDB:insert() ȣ���");
	}
	
	@Override
	public void select(String sql) {
		System.out.println("MariaDB:select() ȣ���");
	}
}
