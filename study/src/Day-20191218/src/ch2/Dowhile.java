package ch2;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// 0�� �Է��Ҷ����� �հ� ���ϱ�
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int input;
		do {
			System.out.println("������ �Է��Ͻÿ� : ");
			input = scan.nextInt();
			sum = sum + input;
			System.out.println("���ݱ��� �Է��� ���� ���� " + sum);
		} while (input!=0);
		
	}
}
