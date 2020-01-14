package yang;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Hol2 {

	public static void main(String[] args) {
		// 자바 랜덤
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int input;
		int user;
		int money=0;
		System.out.print("판돈 입력 : ");
		input = scan.nextInt();
		do {
			int num = ran.nextInt(10) + 1; // 1~10개 사이의 숫자를 선택
			System.out.print("1은 홀수, 2는 짝수, 0은 종료 : ");
			user = scan.nextInt();
			if (user == 0)
				break;
			if ((num % 2 == 0 && user == 2) || (num % 2 != 0 && user == 1)) {
				System.out.println("정답");
				money += input;
			}
			else {
				System.out.println("오답");
				money -= input;
			}
			System.out.println("잔액 :" + money);
		} while (true);
		
	
	}
}