package ch2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// ������ ���� 10���� �迭�� ����� ����ڷκ��� 10���� �Է¹޾� ������ �ְ�
		// ���� ����ִ� �迭�� �̿��ؼ� ��հ��� ���� ����Ѵ�.
		//�׸��� �Է��ߴ� ���� �����ش�.		
		
		int num[] = new int[10];
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i< 10; i++) {
			System.out.print("���� 10���� �Է��ϼ��� : ");
			num[i] = scan.nextInt();	
			sum += num[i];
		}
		for(int i=0; i<10; i++) {
			System.out.print(num[i]);			
		}
		System.out.println();
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum/10);
	}

}
