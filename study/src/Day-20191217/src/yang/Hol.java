package yang;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Hol {

	public static void main(String[] args) {
		// �ڹ� ����
		Random ran = new Random();
		int input;

		do {
			int num = ran.nextInt(10) + 1; // 1~10�� ������ ���ڸ� ����
			System.out.println();
			System.out.println("������ " + num);

			// �ڹ� Ű����
			Scanner scan = new Scanner(System.in);
			System.out.println("1�� Ȧ��, 2�� ¦��, 0�� ���� �Է� :");
			input = scan.nextInt();
			if (input == 0)
				break;
			if ((num % 2 == 0 && input == 2) || (num % 2 != 0 && input == 1))
				System.out.println("����");
			else
				System.out.println("����");
		} while (input != 0);
		System.out.println();
	}
}
