package chap06.class_review;

// ���α׷��� �����Ϸ��� main() �޼ҵ尡 �ִ� Ŭ������ �־�� ��.

public class AirPlaneExam {

	// ���α׷��� ����Ǹ� main()�� �����
	public static void main(String[] args) {
		AirPlane a1 = new AirPlane();
		AirPlane a2 = new AirPlane("����");
		AirPlane a3 = new AirPlane(900, "��Ű��");
		a3.height = 10000;
		a2.speed = 500;
		System.out.println("������ : " + a1.company);
//		height = 10000;
	}

}
