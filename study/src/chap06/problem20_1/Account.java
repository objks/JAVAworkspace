package chap06.problem20_1;

public class Account {
	private String ano;		// �ٸ� Ŭ�������� ������ ������� �ʰ� : private ���
	private String owner;
	private int balance;
	
	// ������
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// Getter & Setter �޼ҵ� : �ʵ尡 private�̹Ƿ� ���� ������ ��ư�, 
	// Getter�� Setter�� ����ؼ� �����ϵ��� ����� �����Ѵ� : ��������.getAno()
	public String getAno() {
		return ano;
	}
	public int setAno(String ano) {
		if(ano.length() > 7) {
			System.out.println("7�ڸ��� �Է��ϼ���");
			return -1;
		} else {
			this.ano = ano;
			return 0;
		}		
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	
	// BankApplication���� �Ա�(�Աݾ�), ���(��ݾ�)
	public void setBalance(int balance) {	// ������ ������� �ʵ��� ����
		this.balance = balance;
	}	
	// �ʿ信 ���� �����Ѵ�.
	public void addBalance(int deposit) {	// �Աݾ�
		balance += deposit;	// ���� ���� �����ڸ� ����Ͽ� ����
	}
	public int subtractBalance(int withdraw) {
		if(balance > withdraw) {
			balance -= withdraw;
			return 0;				// ����� �����ϸ� 0�� ��ȯ�Ѵ�
		} else {	// �ܰ��� �� ���� �����Ϸ��� �� ��
			return -1;				// �ܰ����
		}
	}
	
}
