package chap06.class_review;

public class MainExam {

	public static void main(String[] args) {
		// �ڵ��� ��ü : ��������
		Car myCar = new Car();	// �ڵ��� ����
		// �ʿ信 ���ؼ� ������ ����
		System.out.println("�ӵ� : " + myCar.speed);
		myCar.company = "���";	// ��������.�ʵ�
		myCar.speedUp(60);		// ��������.�޼ҵ�
		System.out.println("�ӵ� : " + myCar.speed);
		
		Car car2 = new Car("����");
		Car car3 = new Car("BMW", "520D");
	}

}
