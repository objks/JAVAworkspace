package chap06.constructor;

public class Car {
	int speed;
	int seat;
	String model;
	String color;
	
	// �����ڸ� �������� �ʾ��� -> defualt �����ڰ� �����Ѵ�
	public Car() {	// ����Ʈ ������	(�Ű����� ����)
		// ���೻���� �־ �ǰ� ��� �ȴ�. (�Ϲ������� ����)
		// ����Ʈ �����ڴ� �������� �ʾƵ� �����ϹǷ� �������� �ʾƵ� �ȴ�
	}
	// ������ : ����Ʈ �����ڰ� �ƴ� �ٸ� �����ڰ� �����ϸ� , default �����ڴ� ����.
	public Car(int speed) {	// �ʱⰪ���� �����ϰ� ���� ���� �Ű������� �޴´�.
		this.speed = speed;
	}
	public Car(int speed, int seat) {
		this.speed = speed;
		this.seat = seat;		
	}
	
	public Car(String model, String color, int speed) {
		this.color = color;
		this.model = model;
		this.speed = speed;
	}
	
	public Car(int seat, String model, String color, ) {
		this.color = color;
		this.model = model;
		this.seat = seat;
	}
}
	