package yang;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Hol {

	public static void main(String[] args) {
		// 자바 랜덤
		Random ran = new Random();
		int input;

		do {
			int num = ran.nextInt(10) + 1; // 1~10개 사이의 숫자를 선택
			System.out.println();
			System.out.println("랜덤값 " + num);

			// 자바 키보드
			Scanner scan = new Scanner(System.in);
			System.out.println("1은 홀수, 2는 짝수, 0은 종료 입력 :");
			input = scan.nextInt();
			if (input == 0)
				break;
			if ((num % 2 == 0 && input == 2) || (num % 2 != 0 && input == 1))
				System.out.println("정답");
			else
				System.out.println("오답");
		} while (input != 0);
		System.out.println();
	}
}
