package yang;

import java.util.Random;
import java.util.Scanner;

public class RandomTest3 {

	public static void main(String[] args) {
		// �ڹ� ����
		Random ran = new Random();
		int count1 =0, count2 =0;

		// �ڹ� Ű����
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<150; i++) {
			int num = ran.nextInt(2) + 1; // 0~19 +1
			if(num==1)
				count1++;
			else
				count2++;
		}
		System.out.println("1�� ���� Ȯ�� : " + count1*2/3 + "%");
		System.out.println("2�� ���� Ȯ�� : " + count2*2/3 + "%");
	}
}
