package chap08_interface_usage;

public class TodaySch {

	public static void main(String[] args) {
		// ����
		int num;	// int -> �������̽� 
		Person p1 = new Person("ȫ�浿");
		p1.sb = new Television();
		p1.sb.turnOn();					// �߻�޼ҵ带 �������� �޼ҵ�
		p1.sb.turnOff();				// default �޼ҵ�
		p1.sb = new SettopBox();
		p1.sb.turnOn();
		p1.sb.turnOff();
		p1.method3(new Television());
		p1.watchMovie();
		RemoteControl.changeBattery();// �����޼ҵ�
	}

}
