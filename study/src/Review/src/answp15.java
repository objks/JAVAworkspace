import java.util.Scanner;

public class answp15 {

	public static void main(String[] args) {
		/*
		 * 2�ڸ��� ������ �߻��Ͽ� �߻��� ���ڸ� ���ߴ� ���� ���α׷� �����߻�) 1. int a=(int)(Math.random()*100) : 0
		 * - 99 ������ ���� 2. �� import java.util.Random; �� Random ����1 = new Random(); �� int
		 * ����2 = ����1.nextInt(�ִ밪); ==> 0 ~ (�ִ밪 - 1)������ ������ ��
		 */

		int a = (int) (Math.random() * 100);
		int num, count = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("������ ���纸�ÿ�");
			System.out.print("���� : ");
			num = scan.nextInt();
			count++;
			if (a > num) {
				System.out.println("UP");
			} else if (a < num) {
				System.out.println("DOWN");
			} else
				break;
		}
		System.out.println("�������� " + count + "�� ���� ���߾���");
	}

}
