package Na;

public class CarTest {

	public static void main(String[] args) {
		Car firstCar = new Car("morning");
		Car seconCar = new Car("morning");
		if(firstCar.equals(seconCar)) {
			System.out.println("������ ��");
		} else {
			System.out.println("�ٸ� ��");
		}
		System.out.println(firstCar.toString());
	}
}
