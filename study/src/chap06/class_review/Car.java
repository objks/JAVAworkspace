package chap06.class_review;

	// �����ִ� ��� :Car
public class Car {
	// ������� : �ʵ�, ������, �޼ҵ�
	// �ʵ� : ����(speed, seatNum), �⺻����(company, owner), ��ǰ(Engine, Tire, Handle)
	int speed;
	int seatNum;
	String owner;
	String company;
	String model;
	
	// ������
	// �����ڸ� �������� ������ �⺻ �����ڰ� �����ϴ� ������ �����Ϸ��� ����
	public Car() { 
		System.out.println("Car()");
	} 	// ���๮�� ���� : �޼ҵ��� ����, ��ȯ���� ����, �ּҰ��� ��ȯ��
	
	// �������� ���� : 1. ��ü ����(�޸� Ȯ��)	2. �ʵ尪�� �ʱ�ȭ
	public Car(String company, String m) {
		System.out.println("Car(String company, String m)");
		this.company = company;	// �Ű������� �ʵ带 �����ϱ� ���� this�� ���
		model = m;	// this ���� ����
	}
	
	// ������ �����ε� : �����ڸ� ������ ���
	// �Ű������� Ÿ��, ����, ��ġ -> ������ �� ������ ���
//	public Car(String company, String owner) {	// ��� �ȵ� : ������ ������ ������	
//	}
	
	public Car(int speed, String model) {	// ���
		System.out.println("Car(int speed, String model)");
		this.speed = speed;	// �ʵ尪�� �־��� �Ű����� ������ ����
		this.model = model;	// this : Car
	}
	
	public Car(String company) {	// company
		this(company, "�ҳ�Ÿ");	// ������ ������ �����ڸ� �̿� this : Car
		System.out.println("String company");	// �ٸ� �����ڸ� ȣ���� �� �����ڸ� �� ó�� �;� ��		
	}
	
	// �޼ҵ�
	public void speedUp(int speed) {
		this.speed = speed;
	}
}
