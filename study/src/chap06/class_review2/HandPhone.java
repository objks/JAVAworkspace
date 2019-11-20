package chap06.class_review2;

/*
 * �ڵ��� : �˶�- ���
 * 		 ���� : ����� (���ͳ�)
 * 		��ȭ : ����
 * 		SNS : ī��(���ڸ޽��� ����)
 * 			���̽���
 * 		����
 * 		�� - ���� ����(�ȵ���̵�)
 */

public class HandPhone {
	// ���� ��� : �ʵ�, ������, �޼ҵ�
	// �ʵ� : �Ϲ�����, ��������, ��ǰ(����ǰ), ���(static final)
	public static final int BUSY = 1;	// ��� : static(����) final(�Һ�,����)
	public static final int IDLE = 2;	// ���� : �޼ҵ念���� Ŭ������ ����
	public static final int RING = 3;	// Ŭ�����̸����� ���� : HandPhone.BUSY
	int state = IDLE;	// ��ȭ���¸� �����ϴ� �ʵ� -> �����ڰ� ��ü�� �����ϱ� ���� �ʱ�ȭ
	int power;			// ������ ��
	String model;		// ��9
	int dataUsage;		// 1GB : ������ ��뷮
	int monthlyFee;		// ��ſ��
	//��ǰ : WiFi, BT, GPS, NFC, ����, DIsplay, ī�޶� (��ü)
	
	// ������ : 1. ��ü�� ����(heap ������ �޸𸮸� �Ҵ� ����) -> 2. �ʱ�ȭ(� ���� ����)
	// �������� ���� : ClassName() { }
//	HandPhone() {	// �⺻ ������ : �ٸ� �����ڰ� ������ �����Ϸ��� �⺻ �����ڸ�
					// �������� �ʾƵ� �ִٰ� ����
//	}
	// ��ü�� �����ϸ鼭 � �ʱⰪ�� �־��� �ʿ伺�� ���� ��� ���ο� �����ڸ� �����Ѵ�.
	HandPhone(String model, int fee) {
		this.model = model;	// this : �Ű������� �ʵ��̸��� �����ϱ� ���ؼ� ����ϴ� �� (HandPhone)
		monthlyFee = fee;	// this�� ���ʿ�
	}
	
	HandPhone(int power, String model) {	// �����Ϸ��� ���� �ִ� �����ڿ� ������ �� ����
		this.power = power;
		this.model = model;
	}

	public HandPhone(int state, int power, String model, int dataUsage, int monthlyFee) {
		this.state = state;
		this.power = power;
		this.model = model;
		this.dataUsage = dataUsage;
		this.monthlyFee = monthlyFee;
	}

	// ������ �����ε� : �Ű����� Ÿ��, ����, ������ �ٸ��� �ٸ� �����ڷ� ����
	public HandPhone(String model, int dataUsage, int monthlyFee) {
		this(IDLE, 0, model, dataUsage, monthlyFee);
//		this.model = model;
//		this.dataUsage = dataUsage;
//		this.monthlyFee = monthlyFee;
//		power = 0;
//		state = IDLE;
	}
	
	// �޼ҵ� : ���, ����
	public void powerOn() {
		System.out.println("���� ON");		
	}
	
	void poweroff() {
		System.out.println("���� OFF");
	}
	
	void sendMessage(String message) {
		dataUsage += message.length();
		System.out.println(message + "�� ����");
	}
	String receiveMessage() {
		String buffer = "���� �޽��� ���� ����";
		dataUsage += buffer.length();
		power -= 1;
		return "���� �޽��� ���ų���";
	}
	
	void chargeBattery(int hour) {
		System.out.println("�����մϴ�.(" + hour + ")");
		power += (hour * 2);
	}
	
	void hookoff() {
		System.out.println("��ȭ�� �߽� ��� ����");
	}
	
	void hookon() {
		System.out.println("��ȭ�� ���´�");		
	}
	
}
