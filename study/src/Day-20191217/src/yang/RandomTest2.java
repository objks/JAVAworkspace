package yang;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {

	public static void main(String[] args) {
		// �ڹ� ����
		Random ran = new Random();
		int num = ran.nextInt(20) + 1; // 0~19 +1
		System.out.println(num);

		// �ڹ� Ű����
		Scanner scan = new Scanner(System.in);
		int input;
		int count = 0;
		do {
			count++;
			System.out.print(count + "ȸ��, ���� �Է� : ");
			input = scan.nextInt();
			if (input < num)
				System.out.println("up");

			else if (num < input)
				System.out.println("down");
		} while (input != num && count != 5);

		if (num == input) {
			System.out.println("����~! ");
		} else {
			System.out.println("�����Ͽ����ϴ�");
		}

	}
}
