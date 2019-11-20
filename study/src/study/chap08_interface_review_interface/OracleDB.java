package study.chap08_interface_review_interface;

public class OracleDB implements IDatabase {

	@Override
	public void insert(String sql) {
		// JDBC ���̺귯�� SQL(INSERT INTO ...)
		System.out.println("OracleDB:insert() ȣ���");
	}

	@Override
	public void select(String sql) {
		System.out.println("OracleDB:select() ȣ���");
	}

	@Override
	public void update(int balance) {
		System.out.println("OracleDB:update() ȣ���");
	}
}
