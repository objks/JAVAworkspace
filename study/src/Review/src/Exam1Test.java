
public class Exam1Test {

	public static void main(String[] args) {
		// 65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.
		
		int money = 65430;
		
		int a = money / 10000;
		int b  = (money - (a * 10000)) / 1000;

		int c = money / 100;
		int d = money / 10;
		
		System.out.println("���� " + a);
		System.out.println("õ�� " + b);
		System.out.println("��� " + c);
		System.out.println("�ʿ� " + d);
	}

}
