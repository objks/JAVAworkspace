package ch2;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// 0을 입력할때까지 합계 구하기
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int input;
		do {
			System.out.println("정수를 입력하시오 : ");
			input = scan.nextInt();
			sum = sum + input;
			System.out.println("지금까지 입력한 수의 합은 " + sum);
		} while (input!=0);
		
	}
}
