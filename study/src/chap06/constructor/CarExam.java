package chap06.constructor;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();	// ��ü ����(����Ʈ �����ڸ� ���)
		System.out.println("MyCar �ӵ� : " +myCar.speed);
		// ��ü�� �����ϸ鼭 speed ���� �����ϰ� �ʹ�
		Car car1 = new Car(300);
		System.out.println("�ӵ� : " + car1.speed);
		
		Car car2 = new Car(400,4);
		System.out.println("car2 �ӵ� : " + car2.speed);
		System.out.println("car2 �¼��� : " + car2.seat);
		
		Car car3 = new Car("�׷���", 400, "���");	// ���� �ؼ�
		Car car4 = new Car("���", 400, "�ҳ�Ÿ");
	}

}
