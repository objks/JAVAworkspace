import java.util.Scanner;

public class answp8 {

	public static void main(String[] args) {
		/*
		 * ���� �Է¹޾� 0���� �۰ų� 100���� ũ�� "�Է¿���!!" ��� (if���� ||�����ڸ� �̿��Ͻÿ�) �����Է� : 120 �Է¿���!!
		 * �����Է� : 55 �ԷµȰ� : 55
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int a = scan.nextInt();
		
		if ( a > 100 || a < 0 ) {
			System.out.println("�Է� ���� !!");
		} else
			System.out.println(a);
	}

}
