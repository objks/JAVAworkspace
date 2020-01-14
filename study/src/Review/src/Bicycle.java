
public class Bicycle {
	private int cadence = 0;	// ��� Ƚ��
	private int speed = 0;		// �ӵ�
	private int gear = 1;		// �ܼ�
	
	void changeCadence(int newValue) {
		cadence = newValue;
	}
	
	void changeGear(int newValue) {
		gear = newValue; 
	}
	
	void speedUp(int increment) {
		speed += increment;
	}
	
	void applyBraker(int decrement) {
		speed -= decrement;
	}
	
	void printStates() {
		System.out.print("��� Ƚ�� : " + cadence);
		System.out.print(", ���ǵ� : " + speed);
		System.out.println(", ��� : " + gear);
	}
}
