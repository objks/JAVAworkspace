package chap06.this_constructor;

public class Car {
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		// ����Ʈ ������
	}
	
	public Car(String model) {
		this(model, "white");	// �Ʒ� 3���� ��ſ� �ٸ� �����߸� ȣ�� -> ������ 2�� ȣ��
//		this.model = model;
//		this.color = "white";
//		this.maxSpeed = 250;
	}
	
	public Car(String model, String color) {
		this(model, color, 250);
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
	}
	
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = speed;
	}
}
