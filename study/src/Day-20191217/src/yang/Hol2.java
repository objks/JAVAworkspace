package yang;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Hol2 {

	public static void main(String[] args) {
		// �ڹ� ����
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int input;
		int user;
		int money=0;
		System.out.print("�ǵ� �Է� : ");
		input = scan.nextInt();
		do {
			int num = ran.nextInt(10) + 1; // 1~10�� ������ ���ڸ� ����
			System.out.print("1�� Ȧ��, 2�� ¦��, 0�� ���� : ");
			user = scan.nextInt();
			if (user == 0)
				break;
			if ((num % 2 == 0 && user == 2) || (num % 2 != 0 && user == 1)) {
				System.out.println("����");
				money += input;
			}
			else {
				System.out.println("����");
				money -= input;
			}
			System.out.println("�ܾ� :" + money);
		} while (true);
		
	
	}
}