package chap08_annoymous;

import chap08_interface_definition.Television;

public class Main {

	public static void main(String[] args) {
		// �ڷ����� ���� ��ü�� ��� -> ��ü�� �̸��� ����
//		RemoteControl r = new Television();
		// �͸�ü�� Ŭ���� �̸��� ����
		// Ŭ���� �̸��� �����Ƿ� �����ڸ� �������̽� �̸����� ���
		RemoteControl rc = new RemoteControl() {
			// ���� ��ü : RemoteControl�� implements(����)
			// �߻� �޼ҵ带 ������ �ؾ���
			// Ŭ���� ���̴� : �ʵ�, ������, �޼ҵ�
			int field1 = 20;
			
			// �޼ҵ�
			void method1() {
				
			}
			
			@Override
			public void turnOn() {
				System.out.println("TV�� �մϴ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("������ " + volume + "���� ����");
			}
			
			// default �޼ҵ� ����
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(20);
//		rc.field1 = 20;		���Ұ�(������ü �������� ���)
//		rc.method1();		���Ұ�(������ü �������� ���)
		//Ŭ���� �̸��� ��� ����Ÿ�Ժ�ȯ�� �� �� ����
		
		RemoteControl audio = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("������ " + volume + "���� ����");
			}
		};
		audio.turnOn();
		audio.turnOff();
		audio.setVolume(40);
	}

}
