package study04;

import java.util.Scanner; // �ܺο��� ���ǵ� Ŭ������ ����� �� import�� ���ش�.

public class SwitchExample {

	public static void main(String[] args) {
		int num;

		System.out.print("���� �Է� : "); // Ŀ���� ����
		// ���� �Է� = C��� scanf
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		switch (num) { // int
		case 1:
			System.out.println("���ϱ�");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("���ϱ�");
			break;
		default:
			System.out.println("������");
			break;
		}

		// �ڹٿ����� ���ڿ��� ����
		String value;
		System.out.print("�޴� ���� : ");
		value = scanner.next();		// next() : ���ڿ�
		switch(value) {	// ���ڿ�
		case "10" :
			System.out.println("10��");
			break;
		case "20" : 
			System.out.println("20");
			break;
		default :
			System.out.println("��Ÿ");
			break;
		}
	}
}
