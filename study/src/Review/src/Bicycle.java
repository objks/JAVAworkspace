
public class Bicycle {
	private int cadence = 0;	// 페달 횟수
	private int speed = 0;		// 속도
	private int gear = 1;		// 단수
	
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
		System.out.print("페달 횟수 : " + cadence);
		System.out.print(", 스피드 : " + speed);
		System.out.println(", 기어 : " + gear);
	}
}
