package static_member;

public class MainExam {

	public static void main(String[] args) {
		int result = Calculator.plus(10, 20);
		System.out.println(" ��� = " +result);
		System.out.println("���� ���� " + Calculator.calculateArea(5.0));
		// �ð� : ��ü �ϳ��� ���� -> �ð� ������ ����
		System.out.println("��� = " + Calculator.minus(30, 20));
	}

}
