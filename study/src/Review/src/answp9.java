import java.util.Scanner;

public class answp9 {

	public static void main(String[] args) {
		/*
		 * �Էµ� ���ڰ� �빮���̸� �ҹ��ڷ� ����ϰ� �ҹ����̸� �빮�ڷ� ��ȯ�Ͽ� ����Ͻÿ�
		 * �׿��� �����̸� "�Էµ���Ÿ����"��� ǥ���Ͻÿ� (if-else�� �̿�) Input Character: A result : a Input
		 * Character: a result : A Input Character: * �Էµ����� ����
		 */

		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է� : ");
		ch = scan.next().charAt(0);		
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("��� : " + (char)(ch + 32));
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("��� : " + (char)(ch - 32));
		} else {
			System.out.println("�Է� ������ ����");
		}
	}

}
