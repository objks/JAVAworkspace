package chap06.problem20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count;
	
	public static void main(String[] args) {
		boolean run =true;
		while(run) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1. ���� ���� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ���� | 6. �ܾ���ȸ");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("���� > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if ( selectNo ==2) {
				accountList();
			} else if ( selectNo ==3) {
				deposit();
			} else if ( selectNo ==4) {
				withdraw();
			} else if ( selectNo ==5) {
				run = false;
			} else if (selectNo ==6) {
				retrieveAccount();
			}
		}
		System.out.println("���α׷� ����");
	}
	
	private static void retrieveAccount() {
		// TODO Auto-generated method stub
		
	}

	private static void accountList() {
		System.out.println("******************");
		System.out.println("���¸��");
		System.out.println("******************");
		for(int i = 0; i < count;i++) {
			Account account = accountArray[i];
			System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
		}
	}

	// ���� �����ϱ�
	private static void createAccount() {	// ���¼��� 100���� ū��?
		if (count == 100) {
			System.out.println("���¸� ������ �� �ִ� �ִ���� �ʰ��Ͽ����ϴ�.");
			return;
		}
		System.out.println("******************");
		System.out.println("���»���");
		System.out.println("******************");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("������ : ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();	// int -> nextInt
		accountArray[count++] = new Account(ano, owner, balance);
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}
	
	// �����ϱ�
	private static void deposit() {
		System.out.println("******************");
		System.out.println("��     ��");
		System.out.println("******************");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("���ݾ� : ");
		int value = scanner.nextInt();
		
		// findAccount() : ����Ǿ� ���¸� ã�� �޼ҵ带 �̿�
		Account account = findAccount(ano)
		if(account != null) { 	// ���� �˻� ����
			account.setBalance(value);
		} else { 	// ���� ����
			System.out.println("���� �����̴�");
		}
		System.out.println("��� : ���� �Ǿ����ϴ�.");
	}
	
	// ����ϱ�
	private static void withdraw () {
		System.out.print("���¹�ȣ : ");
		Scanner sc = new Scanner(System.in);
		System.out.print("��ݾ� : ");
		Scanner sc = new Scanner(System.in);
		System.out.print("��� : ");
		Scanner sc = new Scanner(System.in);
	}
	
	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		// accountArray[]
		for(int i=0;i<count;i++) {
			Account account = accountArray[i];
			if(account.getAno().equals(ano)) {
				return account;
			}
		}
		return null;	// ���¸� �� ã�� ���
	}
}
