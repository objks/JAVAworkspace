package chap08.polymorphism;

public class Car {
	Tire fl = new HanKookTire("�տ���", 5);
	Tire fr = new HanKookTire("�տ�����", 3);
	Tire bl = new NesenTire("�ڿ���", 4);
	Tire br = new NesenTire("�ڿ�����", 6);
	
	// ���� �޼ҵ�
	// Ÿ�̾� ȸ���ϸ鼭 ���� : ������ Ÿ�̾��� ��ġ�� �˷��ش�.
	public int run() {
		System.out.println("�ڵ����� ��������");
		if(!fl.roll()) {	// Ÿ�̾� ��ũ �߻�
			System.out.println("�տ��� ���� ��ũ");
			stop();
			return 1;		// ���峭 ���� ��ġ (1 : �� ����)
		}
		if(!fr.roll()) {	// Ÿ�̾� ��ũ �߻�
			System.out.println("�տ����� ���� ��ũ");
			stop();
			return 2;		// ���峭 ���� ��ġ (1 : �� ����)
		}
		if(!bl.roll()) {	// Ÿ�̾� ��ũ �߻�
			System.out.println("�ڿ��� ���� ��ũ");
			stop();
			return 3;		// ���峭 ���� ��ġ (1 : �� ����)
		}
		if(!br.roll()) {	// Ÿ�̾� ��ũ �߻�
			System.out.println("�ڿ��� ���� ��ũ");
			stop();
			return 4;		// ���峭 ���� ��ġ (1 : �� ����)
		}
		return 0;		// ��ũ �ȳ�
	}
	
	public void stop() {
		System.out.println("���� �����");
	}
}
