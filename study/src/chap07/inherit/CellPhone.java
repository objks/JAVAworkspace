package chap07.inherit;

public class CellPhone {
	// �ʵ�
	String model;
	String color;
	
	//������
//	public CellPhone() {
//		System.out.println("CellPhone() �����ڰ� ȣ���");
//	}
	
	public CellPhone(String model, String color) {
		System.out.println("CellPhone(String model, String color) ");
		this.model = model;
		this.color = color;
	}
	
	// �޼ҵ�
	public void powerOn() {
		System.out.println("���� ON");
	}
	
	public void powerOff() {
		System.out.println("���� OFF");
	}
	
	public void sendMessage(String message) {
		System.out.println(message + "�� �����մϴ�");
	}
	
	public String receiveMessage() {
		System.out.println("�޽����� �����մϴ�.");
		return "���ŵ� ������";
	}
}
