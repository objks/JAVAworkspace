package yang;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.print("정수를 입력하시오 : ");
		input = scan.nextInt();
		System.out.println(input);
		// 홀수 짝수 판단하는 프로그램
		if ( input % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		scan.close();
	}
}
