package chap06.instance;

public class CarExam {

	// �ν��Ͻ� ���
	public static void main(String[] args) {
		Car.MaxSeatNum = 6;	// ���뵥����, ��ü �������� ���� : static
		Car.chageBattery(); // ��ü�� �������� ����
		
		Car car1 = new Car();
		car1.setSpeed(50);
		car1.speed=60;
		System.out.println("���� �ӵ� : " + car1.getSpeed());
	}

}
