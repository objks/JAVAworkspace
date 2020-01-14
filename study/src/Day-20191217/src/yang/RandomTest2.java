package yang;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {

	public static void main(String[] args) {
		// 자바 랜덤
		Random ran = new Random();
		int num = ran.nextInt(20) + 1; // 0~19 +1
		System.out.println(num);

		// 자바 키보드
		Scanner scan = new Scanner(System.in);
		int input;
		int count = 0;
		do {
			count++;
			System.out.print(count + "회차, 숫자 입력 : ");
			input = scan.nextInt();
			if (input < num)
				System.out.println("up");

			else if (num < input)
				System.out.println("down");
		} while (input != num && count != 5);

		if (num == input) {
			System.out.println("정답~! ");
		} else {
			System.out.println("실패하였습니다");
		}

	}
}
