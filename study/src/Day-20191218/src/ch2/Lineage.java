package ch2;

import java.util.Random;
import java.util.Scanner;

public class Lineage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		for (;;) {
			int box = ran.nextInt(20) + 1; // 5% Ȯ��
			System.out.println("20���� �ڽ� �� �ϳ��� �������ּ���");
			int user = scan.nextInt();
			if (box == user) {
				System.out.println("�����մϴ�~! ���� �̾ҽ��ϴ�");
				break;
			} else {
				System.out.println("�ٽ� �̾ƺ�����");
				System.out.println(box);
			}
		}

		int strong = 0; // ��ȭ��
		int count = 0; // ��ȭ Ƚ��
		int drng = 1;
		do {
			count++;
			System.out.println("��ȭ�Ͻðڽ��ϱ�?");
			System.out.println("1. YES 2. NO");
			int input = scan.nextInt();
			if (input == 2) {
				System.out.println("���� ������� " + strong + "�Դϴ�.");
				break;
			}
			// ��ȭ ��û�� ��ȭ�غ���
			int check1 = ran.nextInt(2 * drng); // ���� 50% Ȯ�� - ������
			int check2 = 1; // Ȯ�ΰ�
			drng = drng * 2; // Ȯ���� ������ �پ��
			if (check1 == check2) {
				strong++;
				System.out.println("��ȭ ����~!!!! ����� (" + strong + ")");
			} else {
				System.out.println("��ȭ����! ������� �η������ϴ�.");
				break;
			}
		} while (count != 10); // �ִ� 10��ȭ
		System.out.println("��");
	}
}
