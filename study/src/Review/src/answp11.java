import java.util.Scanner;

public class answp11 {

	public static void main(String[] args) {
		/*
		 * 2���� ���ڿ� �����ڸ� �Է��Ͽ� ����Ͻÿ� 
		 * ����1) �Ǽ��ΰ��� �Ҽ����� 2°�ڸ����� ����Ͻÿ� ����2) �����ڰ� +,-,*,/ �̿��� ���ڰ� ������ "������error"����Ͻÿ�
		 * 
		 * [������] A���� �Է��Ͻÿ�: 25 B���� �Է��Ͻÿ�: 36 �����ڸ� �Է�(+,-,*,/) : + 25 + 36 = xx
		 * 
		 * A���� �Է��Ͻÿ�: 25 B���� �Է��Ͻÿ�: 36 �����ڸ� �Է�(+,-,*,/) : / 25 / 36 = xx.xxxxx
		 * 
		 * A���� �Է��Ͻÿ�: 25 B���� �Է��Ͻÿ�: 36 �����ڸ� �Է�(+,-,*,/) : # ������ error
		 */
		
		char c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("A���� �Է� : ");
		int a = scan.nextInt();
		System.out.print("B���� �Է� : ");
		int b = scan.nextInt();
		System.out.print("������ : ");
		c = scan.next().charAt(0);
		
		switch (c) {
		case '+':
			System.out.printf("%d %c %d = %d\n", a, c, b, a+b);
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n", a, c, b, a-b);
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n", a, c, b, a*b);
			break;
		case '/':
			System.out.printf("%d %c %d = %.2f\n", a, c, b, (double)a/b);
			break;
		default:
			System.out.println("����");
			break;
		}
		
	}

}
