package yang;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		// 자바 랜덤
		Random ran = new Random();
		int num = ran.nextInt(41) + 10;
		System.out.println(num);
		
		// 자바 키보드
		Scanner scan = new Scanner(System.in);
		int input;
		do {
			System.out.print("숫자 입력 : ");
			input = scan.nextInt();
			if (input < num)
				System.out.println("up");
			else if (num < input)
				System.out.println("down");

		} while (num != input);
		System.out.println("정답~!");

	}
}
