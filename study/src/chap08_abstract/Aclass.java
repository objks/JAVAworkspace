package chap08_abstract;

public abstract class Aclass {	// abstract : �߻� Ŭ���� -> �������
	// �̿ϼ��� Ŭ���� -> ��ü�� �Ұ���
	// �߻�Ŭ������ ����� �޾� ���մ� Ŭ���� �����ؼ� ���
	// ��� : �ʵ�, ������, �޼ҵ�
	// �߻�޼ҵ�
	
	// �ν��Ͻ� �޼ҵ�
	public void method() {
		System.out.println("method1()�� ȣ���");
	}
	
	// �߻� �޼ҵ� :
	public abstract void method2();	// ����θ� ���� : ��ȯ��, �޼ҵ��̸�,
	
}
