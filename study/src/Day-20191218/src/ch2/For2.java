package ch2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// 사용자로 부터 숫자를 입력받은 수만큼 더해서 출력하는 프로그램
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int input = scan.nextInt();
		
		for (int i=1; i <= input; i++) {
			sum = sum + i;			
		}
		System.out.println(sum);
	}

}
