package chap08_abstract;

public interface InterfaceA {
	// ��� : ���, �޼ҵ� (� ����� ����) - ������, �˻�, ...
	// ���� ������ : public
	// ���
	int MAX_VOLUME = 20;	// ������ �ƴ϶� ���(public static final�� ������)
	public static final int MIN_VOLUME = 0; // ���
	
	// �޼ҵ� : �߻�޼ҵ�(�ڹ� ���� 7,...), default�޼ҵ�(�ڹ� 8���� �߰�), �����޼ҵ�(�ڹ� 8���� �߰�)
	// �߻� �޼ҵ� : public abstract �ܾ ����
	void method1();	// ����θ� ����
	
	// default �޼ҵ�
	default void method2() {	// ����κ��� ����
		System.out.println("�� �κ��� ����κ� �Դϴ�.");
	}
	
	// ���� �޼ҵ�
	static void setValue(int value) {
		System.out.println("���� ����(" + value + ")");
	}
	
	// ���� �� : ������, �ʵ�(����)
	// �������̽��� ������ ������ü�� ���ؼ� ��� ����
		// RemoteControl -> Television, Audio
	
}
