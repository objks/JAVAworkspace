package chap06.problem20_1;

import java.util.Scanner;

public class BankApplication {
	private static final int MAX_ACCOUNT = 100; // �ִ� ���¼�

	// ���������� �����ϴ� �ʵ� : �迭
	// 1. ���� �ʵ�� �����ϴ� ��� : �ϳ��� �ʿ��� ��
	static Account accountArray[];
	static int count = 0;
	static BankApplication ba;
	// Ű����κ��� �����͸� �Է¹ޱ� ���Ͽ�
	static Scanner scanner = new Scanner(System.in);

	// 2. �ν��Ͻ� �ʵ带 ����ϴ� ��� : ���� ���� ����ؾ� �� ���
	Account accountArray2[];
	int count2 = 0;
	String jigum; // �Ǽ�, �͹̳�

	
	public static void main(String[] args) {
		accountArray = new Account[MAX_ACCOUNT];
		// ba = new BankApplication();
		// ba.accountArray2 = new Account[MAX_ACCOUNT];
		boolean run = true;
		while (run) { // �޴��� �Է¹޾Ƽ� ó���ϴ� �κ�
			System.out.println("------------------�ѤѤѤѤѤѤѤѤ�---------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� | 6. �ܾ���ȸ");
			System.out.println("------------------------------�ѤѤѤѤѤѤѤѤ�---------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();
			if (selectNo == 1)
				createAccount();
			else if (selectNo == 2)
				accountList();
			else if (selectNo == 3)
				deposit();
			else if (selectNo == 4) // �ٽ� ó������ ������ �ش޶�
				withdraw();
			else if (selectNo == 5)
				run = false; // �ݺ����� Ż���ϴ� ���
			else if (selectNo == 6) // ���� �ܾ� ��ȸ
				retrieveAccount();
		}
		System.out.println("���α׷� ����");
	}

	private static void retrieveAccount() {	// �ܾ���ȸ
		System.out.println("------------");
		System.out.println("�ܾ���ȸ");
		System.out.println("------------");
		System.out.print("���¹�ȣ: "); // ���� �ٲ��� �����Ƿ� print
		String ano = scanner.next(); // ���ڿ��� �Է¹��� �� : next()
		Account account	= findAccount(ano);	// Account
		if(account == null) {	// ���� ����
			System.out.println("���¸� ���� �����Ͻÿ�.");
		} else {	// ���°˻� ����
			System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
		}
	}

	private static void withdraw() {
		System.out.println("------------");
		System.out.println("�� ��");
		System.out.println("------------");
		// �Է� ������ : ���¹�ȣ, ���ݾ� -> ��� ���
		System.out.print("���¹�ȣ: "); // ���� �ٲ��� �����Ƿ� print
		String ano = scanner.next(); // ���ڿ��� �Է¹��� �� : next()
		System.out.print("��ݾ�: "); // ���� �ٲ��� �����Ƿ� print
		int withdraw = scanner.nextInt();// ������ �Է¹��� �� : nextInt()
		Account account	= findAccount(ano);	// Account
		if(account == null) {	// ���� ����
			System.out.println("���¸� ���� �����Ͻÿ�.");
		} else {	// ���°˻� ����
			int balance = account.getBalance();
			if(balance < withdraw) {	// �ܰ����
				System.out.println("�ܰ� �����մϴ�");
			} else {
				account.setBalance(balance - withdraw);
				System.out.println("��� : ����� �����Ͽ����ϴ�.");
			}
		}
	}

	private static void deposit() {
		System.out.println("------------");
		System.out.println("�� ��");
		System.out.println("------------");
		// �Է� ������ : ���¹�ȣ, ���ݾ� -> ��� ���
		System.out.print("���¹�ȣ: "); // ���� �ٲ��� �����Ƿ� print
		String ano = scanner.next(); // ���ڿ��� �Է¹��� �� : next()
		System.out.print("���ݾ�: "); // ���� �ٲ��� �����Ƿ� print
		int deposit = scanner.nextInt();// ������ �Է¹��� �� : nextInt()
		Account account	= findAccount(ano);	// Account
		// ������ ����
		if(account == null) {	// ���� ������ ���
			System.out.println("���¸� ���� �����ϼ���.");
		} else {	// ���°˻� ����
			// ��� 1
//			account.addBalance(deposit);	// �ܰ� ����
			// ��� 2
			int balance = account.getBalance();
			account.setBalance(balance + deposit);	// �ܰ� ����
			System.out.println("������ �����Ͽ����ϴ�.");
		}
	}

	// �Ű����� : ano (���¹�ȣ)
	// ��ȯ�� : ���������� ������ Account ��ü(ano, owner, balance)
	// ���� : �Ű������� ���޵� ���¹�ȣ�� ���� ���¸� �˻��ؼ� ��ȯ
	public static Account findAccount(String ano) {
		for (int i = 0; i < count; i++) {
			// ano�� accountArray[i].getAno()�� ��(���� �� -> equals())
			if(ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
			}
		}
		return null;		// �� ã��(����)
	}

	private static void accountList() {
		System.out.println("------------");
		System.out.println("���¸��");
		System.out.println("------------");
		for (int i = 0; i < count; i++) {
			Account account = accountArray[i];
			System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());

			/*
			 * ������ ��� �ø���. ������
			 *  System.out.println(accountArray[i].getAno() +
			 * "\t" + accountArray[i].getOwner() + "\t" +
			 * accountArray[i].getBalance());
			 */
		}
	}

	public static void createAccount() { // ���� �޼ҵ� main()���� ȣ��Ǿ����Ƿ� ���� �޼ҵ�
		System.out.println("------------");
		System.out.println("���»���");
		System.out.println("------------");
		// ���¹�ȣ, ������, �ʱ��Աݾ� �Է� �޴´�.
		System.out.print("���¹�ȣ: "); // ���� �ٲ��� �����Ƿ� print
		String ano = scanner.next(); // ���ڿ��� �Է¹��� �� : next()
		System.out.print("������: "); // ���� �ٲ��� �����Ƿ� print
		String owner = scanner.next(); // ���ڿ��� �Է¹��� �� : next()
		System.out.print("�ʱ��Աݾ�: "); // ���� �ٲ��� �����Ƿ� print
		int balance = scanner.nextInt();// ������ �Է¹��� �� : nextInt()
		Account account = new Account(ano, owner, balance);
		accountArray[count] = account;
		count++;
		// accountArray[count++] = new Account(ano, owner, balance);
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}
}
