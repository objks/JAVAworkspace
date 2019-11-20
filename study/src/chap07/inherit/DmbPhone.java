package chap07.inherit;

public class DmbPhone extends CellPhone {
	int channel; // ���� ����ϴ� ä�� ����

	// ������ : ����Ʈ ������
	public DmbPhone() {
		super("��5", "���"); // �θ� �����ڸ� ȣ�� 1. �θ��� �����ڸ� �̿�
		System.out.println("DMB�� �����ڰ� ȣ���");
	}
	
	public DmbPhone(String model, String color, int channel) {
		super("��5", "���");
		this.channel = channel;
	}

	// ��� : �θ� ������ �ʵ�� �޼ҵ带 ��밡��(������)
	public void method() {
		model = "��8"; // �θ� �ʵ� ���
		powerOn(); // �θ��� �޼ҵ带 ���
	}

	public void changeChannel(int ch) {
		channel = ch;
	}

	public void dmb_powerOn() { // �ΰ����� ��ǰ�� �ʱ�ȭ�� �߰���
		System.out.println("DMB���� �մϴ�");
	}

	public void dmp_powerOff() {
		System.out.println("DMB���� ���ϴ�");
	}
}
