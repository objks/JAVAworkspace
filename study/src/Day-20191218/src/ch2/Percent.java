package ch2;

import java.util.Random;
import java.util.Scanner;

public class Percent {

	public static void main(String[] args) {
		// ����ڷ� ���� �ݺ�Ƚ���� �Է¹޾Ƽ� �� ���� ���Դ� Ȯ���� ����Ͻÿ�
		// �� ���� ���Դ� Ȯ���� ����Ͻÿ�
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("�ֻ��� Ƚ�� : ");
		int input = scan.nextInt();

		int[] dice = { 0, 0, 0, 0, 0, 0 };
		// int num1=0,num2=0, num3=0, num4=0, num5=0, num6=0;

		for (int i = 0; i < input; i++) {
			int num = rand.nextInt(6) + 1;
			if (num == 1)
				dice[0]++;
			else if (num == 2)
				dice[1]++;
			else if (num == 3)
				dice[2]++;
			else if (num == 4)
				dice[3]++;
			else if (num == 5)
				dice[4]++;
			else
				dice[5]++;
		}

		for (int i = 0; i < 7; i++) {
			System.out.println("�ֻ���" + i+1 + "�� Ȯ�� : " + dice[i]*100/input);
		}
	}

}
