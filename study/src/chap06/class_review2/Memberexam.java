package chap06.class_review2;

import java.util.Scanner;

public class Memberexam {

	public static void main(String[] args) {
		// Ű����κ��� �����͸� �Է¹ޱ� ���� ����ϴ� Ŭ����(���̺귯��)
		String id;
		String name;
		String pw;
		String phone;
		String email;
		
		Scanner scanner = new Scanner(System.in);
		// ȸ������ : id, name, password, phone, email
		System.out.print("���̵�: ");
		id = scanner.next();
		System.out.print("�̸�: ");
		name = scanner.next();
		System.out.print("��й�ȣ: ");
		pw = scanner.next();
		System.out.print("�޴�����ȣ: ");
		phone = scanner.next();
		System.out.print("�̸����ּ�: ");
		email = scanner.next();
		Member member = new Member(id, name, pw, phone, email);
		// �����͸� �����ϴ� ��ü�� �ϳ��� �����ؼ� �� ��ü�� ���ؼ��� �����͸� ���� -> �̱���
		CommonData store = CommonData.getInstance();
		store.data[store.count] = member;
		store.count++;
		
		scanner.close();	// �Է¹޴� scanner�� OS�� �ݳ�
	}

}
