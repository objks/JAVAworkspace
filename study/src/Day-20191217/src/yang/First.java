package yang;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.print("������ �Է��Ͻÿ� : ");
		input = scan.nextInt();
		System.out.println(input);
		// Ȧ�� ¦�� �Ǵ��ϴ� ���α׷�
		if ( input % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		scan.close();
	}
}
