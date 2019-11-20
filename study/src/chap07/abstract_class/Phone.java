package chap07.abstract_class;

// �߻� Ŭ���� : ǥ��ȭ�� Ŭ���� ���� (�������� Ŭ������ ����Ư���� ����)
/*
 * Phone : ������, ��Ʈ, �׺�
 * ���� : �ε�(����), �߱�(����, ����), �ѱ�(���ο�)
 * ǥ��ȭ�� Ŭ������ ������ �� (�߻� Ŭ����)
 * �𵨺���, �� ���󺰷� ��ü Ŭ������ ���� �����ϸ� ������ ȿ��ȭ
 * abstract Ű���带 ���
 * ��ü�� ������ �� ���� -> �߻� Ŭ������ ����� ��ü�� ���� ���� 
 */
public abstract class Phone {
	// �ʵ�
	public String owner;
	
	// ������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
