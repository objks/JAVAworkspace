package chap06.class_review2;

public class CommonData {
	private static final int MAX_MEMBER = 200;
	private static CommonData instance = new CommonData();
	// �̱���
	private CommonData() { }
	
	public static CommonData getInstance() {
		return instance;
	}
	// �����ϰ� ���� ������ ...
	Member data[] = new Member[MAX_MEMBER];
	int count = 0;	// ȸ�� ��
}
