package yang;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		// �ڹ� ����
		Random ran = new Random();
		int num = ran.nextInt(41) + 10;
		System.out.println(num);
		
		// �ڹ� Ű����
		Scanner scan = new Scanner(System.in);
		int input;
		do {
			System.out.print("���� �Է� : ");
			input = scan.nextInt();
			if (input < num)
				System.out.println("up");
			else if (num < input)
				System.out.println("down");

		} while (num != input);
		System.out.println("����~!");

	}
}
