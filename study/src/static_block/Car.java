package static_block;

public class Car {
	// ���� �ʵ�
	static int field1 = 20;	// ���� ����� �Բ� �ʱ�ȭ
	static int field2;		// �ʱ�ȭ���� ����
	
	
	// �ν��Ͻ� �ʵ� : ��ü ���� �� �޸𸮿� ��������� �Ҵ��� �� ������ ��� �ʵ�
	int seatNum;
	int TireNum;
	int speed;
	
	// �� �Ⱦ��� ���
	static {	// ���� ��('{'�� �����ؼ� '}'�� ������ �κ�
				// static { } : ���� ��
		field2 = 30;	// �ʱ�ȭ ���� : ���� �ʵ常
//		seatNum =4;		// ��� �Ұ� -> ��ü
	}
	
	// �� -> ��ü�� ������ �� ����
	{
		TireNum =4;
	}
	
	// ���� �޼ҵ�
	static void method() {
		field1 = 30;
//		seatNum = 4;	// �ν��Ͻ� �ʵ�
//		setSpeed(5);	// �ν��Ͻ� �޼ҵ� ȣ�� �Ұ�
		method2();		// ���� �޼ҵ�� ȣ�� ����
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	static void method2() {
		System.out.println("���� �޼ҵ�2�� ���డ��");
	}
}
