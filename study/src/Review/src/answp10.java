import java.util.Scanner;

public class answp10 {

	public static void main(String[] args) {
		/*
		 * [����10] 4���� ���� �ֿܼ��� �Է¹޾� ó���Ͻÿ� 
		 * ����) ���� : M �̸� "����", ������ "����" (���׿����� �̿�) Input
		 * name: ��̶� Input gender: F Input age: 25 Input tall: 173.3
		 * 
		 * --���-- 
		 * �̸� : ��̶� ���� : ���� ���� : 25�� ���� : 173.3cm
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸� : ");
		String name = scan.nextLine();
		System.out.println("���� : ");
		char gender = scan.next().charAt(0);
		System.out.println("���� : ");
		int age = scan.nextInt();
		System.out.println("���� : ");
		float tall = scan.nextFloat();
		
		
		System.out.println("�̸�  : " + name);
		System.out.println("����  : " + ( gender == 'f' ? "����" : "����" ));
		System.out.println("����  : " + age);
		System.out.println("����  : " + tall);
	}

}
