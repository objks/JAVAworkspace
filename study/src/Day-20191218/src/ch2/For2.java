package ch2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// ����ڷ� ���� ���ڸ� �Է¹��� ����ŭ ���ؼ� ����ϴ� ���α׷�
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int input = scan.nextInt();
		
		for (int i=1; i <= input; i++) {
			sum = sum + i;			
		}
		System.out.println(sum);
	}

}
