package study.chap08_interface_review_interface;

public interface IDatabase {
	// �߻� �޼ҵ�
	void insert(String sql);
	void select(String sql);
	// ���ο� �߰�
	// ��� 1. -> ������ü�� ��� ������ �Ǿ�� ��.
//	void update(int balance);
	
	// ��� 2.
	default void update(int balance) {
		System.out.println("update() ȣ���");
	}
}
