package chap06.class_review2;

public class MainExample {

	// ���α׷��� ����Ƿ��� main() �޼ҵ尡 �ִ� Ŭ������ �ʿ�.
	// main() �޼ҵ��� ���ۺ��� ������ ������ �ȴ�. : ���α׷��� ���۰� ����
	public static void main(String[] args) {
		HandPhone handPhone = new HandPhone("��8", 30000);
		handPhone.powerOn();
		handPhone.sendMessage("�ȳ��ϼ���. �ݰ����ϴ�.");
		handPhone.hookoff();
		// ...
		handPhone.hookoff();
		handPhone.receiveMessage();
		handPhone.poweroff();
	}

}
