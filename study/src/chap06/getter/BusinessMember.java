package chap06.getter;

public class BusinessMember extends Member {
	// �θ� ������ �ʵ�, ������, �޼ҵ嵵 �����ϰ� ��� ����
	// ���� �� -> �θ� ������ �޼ҵ带 ������ �޼ҵ� ����
	
	// Override : ������ �θ� ������ �޼ҵ带 ������ ������� ������
	// @Override	// '@' Annotation(������̼�)
	public void setId(String id) {
		super.setId(id);
	}
}
